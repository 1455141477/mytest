package com.controller;

import com.domain.Book;
import com.domain.BorrowBook;
import com.domain.Reader;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.service.BBookService;
import com.service.BookService;
import com.service.ReaderService;
import com.utils.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/book")
@SessionAttributes(names = "sreaderid",types = {Integer.class})
public class BookController {
    @Autowired
    private BookService service;
    @Autowired
    private ReaderService rservice;
    @Autowired
    private BBookService  bService;

    /**
     * 跳转到添加页面
     */
    @RequestMapping("/toadd")
    public String toadd() {
        return "BookAdd";
    }
    /**
     * 跳转到更新页面
     */
    @RequestMapping("/toupdate")
    public String toupdate(int id, ModelMap modelMap){
        Book book=service.findById(id);
        modelMap.addAttribute("book",book);
        return "BookUpdate";
    }
    /**
     * 查找所有图书
     */
    @RequestMapping("/findAll")
    public ModelAndView tofindAll(@RequestParam(value = "pageNum",required = true,defaultValue = "1") String pageNum,@RequestParam(value = "pageSize",required = true,defaultValue = "4") String pageSize) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("BookShow");
        PageInfo<Book> books = service.findAll(Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        mav.addObject("books",books);
        return mav;
    }
    /**
     *通过类型查找
     * 管理员界面
     */
    @RequestMapping("/findByType")
    public ModelAndView findByType(@RequestParam(value = "type") String type,@RequestParam(value = "pageNum",required = true,defaultValue = "1")String pageNum,@RequestParam(value = "pageSize",required = true,defaultValue = "4")String pageSize){
        System.out.println(type);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("BookShow");
        PageInfo<Book> books=service.findByType(type,Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        mav.addObject("books",books);
        return mav;
    }

    /**
     * 添加图书
     * @param book
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String addBook(Book book,Model model){
        System.out.println(book.toString());
        try {
            service.saveBook(book);
        } catch (BookException e) {
           model.addAttribute("error",e.getMessage());
           return "BookAdd";
        }
        return "redirect:findAll";
    }
    /**
     * 更新图书信息
     */
    @RequestMapping("/update")
    public String updateBook(Book book){
        service.updateBook(book);
        return "redirect:findAll";
    }
    /**
     * 删除指定图书
     */
    @RequestMapping("/delete")
    public String deleteBook(@RequestParam("id") int id){
       service.deleteBook(id);
       return "redirect:findAll";
    }
/*    *//**
     * 通过id查找图书
     *//*
    @RequestMapping("/findById")
    public String findById(@RequestParam("id") int id, Model model){
        Book book=service.findById(id);
        model.addAttribute("book",book);
        return "BookUpdate";
    }*/
    /**
     * 查找所有图书
     * 读者界面查询
     */
    @RequestMapping("/findAllB")
    public ModelAndView tofindAllBorrow(@RequestParam(value = "readerid",required = false)String readerid,@RequestParam(value = "pageNum",required = true,defaultValue = "1") String pageNum,@RequestParam(value = "pageSize",required = true,defaultValue = "4") String pageSize,HttpSession session) {
        if(readerid==null){
            readerid=(String) session.getAttribute("sreaderid");
        }
        PageInfo<BorrowBook> list=bService.findBBookByReaderId(Integer.parseInt(readerid),Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        Reader reader=rservice.findReaderById(Integer.parseInt(readerid));
        for (BorrowBook bb:list.getList()){
            reader.setBorrowBooks(bb);
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("BookShow2");
        PageInfo<Book> books = service.findAll(Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        mav.addObject("books",books);
        mav.addObject("reader",reader);
        return mav;
    }
    /**
     * 借阅图书
     */
    @RequestMapping("/borrowBook")
    public String borrowBook(@RequestParam(value = "id",required = true)String id, @RequestParam(value = "readerid",required=true)String readerid, Model model){
        Book book=service.findById(Integer.parseInt(id));
        Reader reader=rservice.findReaderById(Integer.parseInt(readerid));
        BorrowBook bbook=new BorrowBook();
        bbook.setBook(book);
        bbook.setReader(reader);
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String time=sdf.format(date);
        bbook.setBtime(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.MONTH,2);
        date=calendar.getTime();
        bbook.setRtime(date);
        bService.saveBBook(bbook);
        book.setNumber(book.getNumber()-1);
        service.updateBook(book);
        model.addAttribute("sreaderid",readerid);
        return "redirect:findAllB";
    }
    /**
     * 查询借书信息
    **/
    @RequestMapping("/findBBook")
     public String findBorrowBook(@RequestParam(value = "readerid",required = false)String readerid, @RequestParam(value = "pageNum",required = true,defaultValue = "1")String pageNum, @RequestParam(value = "pageSize",required = true,defaultValue = "4")String pageSize, Model model, HttpSession session){
        System.out.println("==============");
        System.out.println(readerid);
        if(readerid==null){
            readerid=(String)session.getAttribute("sreaderid");
        }
        System.out.println("========");
        System.out.println(readerid);
        PageInfo<BorrowBook> pages=bService.findBBookByReaderId(Integer.parseInt(readerid),Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        System.out.println("============");
        for (BorrowBook bb:pages.getList()){
            System.out.println(bb.toString());
        }
        System.out.println("=============");
        model.addAttribute("pages",pages);
        return "BorrowShow";
    }
  /*  @RequestMapping("/findBBook")
    public String findBorrowBook(@RequestParam(value = "readerid")String readerid,@RequestParam(value = "pageNum",required = true,defaultValue = "1")String pageNum,@RequestParam(value = "pageSize",required = true,defaultValue = "4")String pageSize,Model model){
        System.out.println(readerid);
        PageInfo<BorrowBook> pages=bService.findBBookByReaderId(Integer.parseInt(readerid),Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        for (BorrowBook bb:pages.getList()){
            System.out.println(bb.toString());
        }
        model.addAttribute("pages",pages);
        return "BorrowShow";
    }*/
    /**
     * 查询还书情况
     */
    @RequestMapping("/returnBook")
    public String ReturnBook(@RequestParam(value = "id",required = true)String id,@RequestParam(value = "readerid",required = true)String readerid,Model model){
/*        System.out.println("==========");
        System.out.println(id);
        System.out.println(readerid);
        System.out.println("================");*/
        Book book=service.findById(Integer.parseInt(id));
        System.out.println(book.toString());
        System.out.println("=========");
        bService.deleteBBookByRidandBid(Integer.parseInt(readerid),Integer.parseInt(id));
        book.setNumber(book.getNumber()+1);
        service.updateBook(book);
        model.addAttribute("sreaderid",readerid);
        return "redirect:findBBook";
    }
    /**
     *通过类型查找
     * 读者界面
     */
    @RequestMapping("/findByTypeB")
    public ModelAndView findByTypeB(@RequestParam(value = "type") String type,@RequestParam(value = "pageNum",required = true,defaultValue = "1")String pageNum,@RequestParam(value = "pageSize",required = true,defaultValue = "4")String pageSize){
        System.out.println(type);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("BookShow2");
        PageInfo<Book> books=service.findByType(type,Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        mav.addObject("books",books);
        return mav;
    }
}
package com.controller;

import com.domain.Reader;
import com.service.ReaderService;
import com.utils.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/reader")
@SessionAttributes(value = "sreader",types = {Reader.class})
public class ReaderController {
    @Autowired
    private ReaderService readerService;

    /**
     * 跳转到增加读者页面
     * @param model
     * @return
     */
    @RequestMapping("/toadd")
    public String toAddReader() {
        return "ReaderAdd";
    }

    /**
     * 跳转到更改读者界面
     */
    @RequestMapping("/toupdate")
    public String toUpdateReader(@RequestParam(value = "readerid", required = true) String readerid, Model model) {
        Reader reader = readerService.findReaderById(Integer.parseInt(readerid));
        model.addAttribute("reader", reader);
        return "ReaderUpdate";
    }

    /**
     * 添加读者
     *
     * @param reader
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String add(Reader reader, Model model) {
        try {
            System.out.println(reader.toString());
            readerService.addReader(reader);
        } catch (BookException e) {
            model.addAttribute("error", e.getMessage());
            return "ReaderAdd";
        }
        return "redirect:findAll";
    }

    /**
     * 删除读者
     */
    @RequestMapping("/delete")
    public String deleteReader(@RequestParam("readerid")String readerid){
        readerService.deleteReader(Integer.parseInt(readerid));
        return "redirect:findAll";
    }

    /**
     * 更新读者
     * @param reader
     * @return
     */
    @RequestMapping(value = "/update",method = {RequestMethod.POST})
    public String updateReader(Reader reader,Model model){
        System.out.println(reader.toString());
        try {
            readerService.updateReader(reader);
        } catch (BookException e) {
            model.addAttribute("error",e.getMessage());
            model.addAttribute("reader",reader);
            return "ReaderUpdate";
        }
        return "redirect:findAll";
    }

    /**
     * 查找所有读者
     *
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Reader> list = readerService.findAll();
/*        for (Reader reader : list) {
            System.out.println(reader.toString());
        }*/
        model.addAttribute("readers", list);
        return "Readershow";
    }
    /**
     * 读者登录
     */
    @RequestMapping("/login")
    public String readerLogin(Reader reader,Model model){
        System.out.println(reader.toString());
        Reader r=readerService.findReaderByUsername(reader.getUsername());

        if(r==null){
           model.addAttribute("error","您输入的用户名不存在！");
           return "readerLogin";
        }
        if(!r.getPassword().equals(reader.getPassword())){
            model.addAttribute("perror","您输入的密码不正确！");
            return "readerLogin";
        }
        model.addAttribute("sreader",r);
        return "index2";
    }

    @RequestMapping("/deleteByMid")
    public String deleteByMid(@RequestParam("tag")String tag){
        System.out.println(tag);
        String[] strs=tag.split(",");
        for (String str:strs){
            System.out.println(str);
        }
        /*for (String str:strs){
            deleteReader(Integer.parseInt(str));
        }*/
        return "index";
    }
    @RequestMapping("/toindex")
    public String ToIndex(){
        return "index2";
    }
}

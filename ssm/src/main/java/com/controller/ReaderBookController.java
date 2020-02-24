package com.controller;

import com.domain.BorrowBook;
import com.domain.Reader;
import com.service.BBookService;
import com.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/readerBook")
public class ReaderBookController {
    @Autowired
    private ReaderService readerService;
    @Autowired
    private BBookService bBookService;
    @RequestMapping("/findAllReaderBook")
    public String findAllReaderBook(Model model){
        List<Reader> readers=readerService.findAll();
        for (Reader reader:readers){
            List<BorrowBook> list=bBookService.findByRid(reader.getReaderid());
            for (BorrowBook borrowBook:list){
                System.out.println(borrowBook.toString());
                reader.setBorrowBooks(borrowBook);
            }
            System.out.println(reader.toString());
        }
        model.addAttribute("readers",readers);
        return "readerBookShow";
    }
}

package com.service.impl;

import com.dao.BookDao;
import com.domain.Book;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.BookService;
import com.utils.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public PageInfo<Book> findAll(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Book> list=bookDao.findAll();
        PageInfo<Book> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Book findById(int id) {
        Book book=bookDao.findById(id);
        return book;
    }

    @Override
    public PageInfo<Book> findByType(String type,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Book> books=bookDao.findByType(type);
        PageInfo<Book> pageInfo=new PageInfo<>(books);
        return pageInfo;
    }

    @Override
    public void saveBook(Book book) throws BookException {
         Book b=bookDao.findByName(book.getName());
         if(b!=null){
             throw new BookException("您要插入的图书已存在！");
         }
         bookDao.saveBook(book);
    }

    @Override
    public void deleteBook(int id) {
       bookDao.deleteBook(id);
    }

    @Override
    public void updateBook(Book book) {
       bookDao.updateBook(book);
    }

    @Override
    public int findCount() {
        return bookDao.findCount();
    }
}

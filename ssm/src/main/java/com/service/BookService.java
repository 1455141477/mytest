package com.service;

import com.domain.Book;
import com.github.pagehelper.PageInfo;
import com.utils.BookException;


public interface BookService {
    PageInfo<Book> findAll(int pageNum, int pageSize);
    Book findById(int id);
    PageInfo<Book> findByType(String type,int pageNum,int pageSize);
    void saveBook(Book book) throws BookException;
    void deleteBook(int id);
    void updateBook(Book book);
    int findCount();
}

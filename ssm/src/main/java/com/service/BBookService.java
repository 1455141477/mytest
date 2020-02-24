package com.service;

import com.domain.BorrowBook;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BBookService {
    public PageInfo<BorrowBook> findBBookByReaderId(int readerid, int pageNum, int pageSize);
    public void saveBBook(BorrowBook borrowBook);
    public void deleteBBookByRidandBid(int readerid,int id);
    public List<BorrowBook> findByRid(int readerid);
}

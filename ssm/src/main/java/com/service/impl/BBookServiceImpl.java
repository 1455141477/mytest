package com.service.impl;

import com.dao.BorrowBookDao;
import com.domain.BorrowBook;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.BBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bBookService")
public class BBookServiceImpl implements BBookService {
    @Autowired
    private BorrowBookDao borrowBookDao;
    @Override
    public PageInfo<BorrowBook> findBBookByReaderId(int readerid,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BorrowBook> Bbooks=borrowBookDao.findBorrowBookByreaderId(readerid);
        PageInfo<BorrowBook> pageInfo=new PageInfo<>(Bbooks);
        return pageInfo;
    }

    @Override
    public void saveBBook(BorrowBook borrowBook) {
         borrowBookDao.saveBorrowBook(borrowBook);
    }

    @Override
    public void deleteBBookByRidandBid(int readerid, int id) {
        System.out.println("service"+readerid);
        System.out.println(readerid);
        System.out.println("============");
        borrowBookDao.deleteBBookByRidandBid(readerid,id);
    }

    @Override
    public List<BorrowBook> findByRid(int readerid) {
        return borrowBookDao.findBorrowBookByreaderId(readerid);
    }
}

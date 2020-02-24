package com.dao;

import com.domain.BorrowBook;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BorrowBookDao {
    @Select("select * from borrowbook where readerid=#{readerid}")
    @Results(id = "BBookMap",
    value ={
            @Result(id = true,column = "bbid",property = "bbid"),
            @Result(column = "readerid",property = "reader",one = @One(select = "com.dao.ReaderDao.findReaderById",fetchType = FetchType.EAGER)),
            @Result(column ="bid",property ="book",one =@One(select = "com.dao.BookDao.findById",fetchType = FetchType.EAGER)),
            @Result(column = "btime",property = "btime"),
            @Result(column = "rtime",property = "rtime")
    }
    )
    public List<BorrowBook> findBorrowBookByreaderId(int readerId);
    @Select("insert into borrowbook(readerid,bid,btime,rtime) values(#{reader.readerid},#{book.id},#{btime},#{rtime})")
    public void saveBorrowBook(BorrowBook borrowBook);
    @Delete("delete from borrowbook where readerid=#{readerid} and bid=#{bid}")
    public void deleteBBookByRidandBid(@Param("readerid") int readerid,@Param("bid") int bid);
}

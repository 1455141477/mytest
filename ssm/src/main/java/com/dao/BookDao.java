package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookDao {
    @Select("select * from book")
    @Results(id = "bookMap",
            value = {
            @Result(id = true,column = "id",property = "id"),
                    @Result(column = "bname",property = "name"),
                    @Result(column = "btype",property = "type"),
                    @Result(column = "author",property = "author"),
                    @Result(column = "price",property = "price"),
                    @Result(column = "number",property = "number")
            }
    )
    List<Book> findAll();
    @Select("select * from book where id=#{id}")
    @ResultMap("bookMap")
    Book findById(int id);
    @Select("select * from book where bname=#{name}")
    @ResultMap("bookMap")
    Book findByName(String name);
    @Select("select * from book where btype=#{type}")
    @ResultMap("bookMap")
    List<Book> findByType(String type);
    @Insert("insert into book(bname,btype,author,price,number) values(#{name},#{type},#{author},#{price},#{number})")
    void saveBook(Book book);
    @Delete("delete from book where id=#{id}")
    void deleteBook(int id);
    @Update("update book set bname=#{name},btype=#{type},author=#{author},price=#{price},number=#{number} where id=#{id}")
    void updateBook(Book book);
    @Select("select count(*) from book")
    int findCount();
    @Select("select * from book where id in (select id from book_reader where readerid=#{readerid})")
    List<Book> findByReaderId(int readerid);
}

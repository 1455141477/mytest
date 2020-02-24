package com.dao;

import com.domain.Reader;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReaderDao {
   @Select("select * from reader")
   @Results(id = "readerMap",value = {
           @Result(id = true,property = "readerid",column = "readerid"),
           @Result(property = "name",column = "name"),
           @Result(property = "sex",column = "sex"),
           @Result(property = "age",column = "age"),
           @Result(property = "phone",column = "phone"),
           @Result(property = "dept",column = "dept"),
           @Result(property = "regdate",column = "regdate"),
           @Result(property = "username",column = "username"),
           @Result(property = "password",column = "password"),
   })
   List<Reader> findAll();
   @Insert("insert into reader(name,age,sex,phone,dept,regdate,username,password) values(#{name},#{age},#{sex},#{phone},#{dept},#{regdate},#{username},#{password})")
   void addReader(Reader reader);
   @Select("select * from reader where name=#{name}")
   @ResultMap("readerMap")
   Reader findByName(String name);
   @Select("select * from reader where readerid=#{id}")
   @ResultMap("readerMap")
   Reader findReaderById(int id);
   @Select("select * from reader where username=#{username}")
   @ResultMap("readerMap")
   Reader findReaderByUsername(String username);
   @Update("update reader set name=#{name},sex=#{sex},phone=#{phone},age=#{age},dept=#{dept},username=#{username},password=#{password} where readerid=#{readerid}")
   void updateReader(Reader reader);
   @Delete("delete from reader where readerid=#{readerid}")
   void deleteReader(int id);
}
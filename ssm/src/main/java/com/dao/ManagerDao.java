package com.dao;

import com.domain.Manager;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerDao {
    @Select("select * from manager")
    @Results(id = "managerMap",
            value = {
                    @Result(column = "mid", property = "id", id = true),
                    @Result(column = "musername", property = "username"),
                    @Result(column = "mpassword", property = "password"),
                    @Result(column = "mname", property = "name")
            })
    List<Manager> findAll();
    @Select("select * from manager where musername=#{username}")
    @ResultMap("managerMap")
     Manager findByUserName(String username);
    @Insert("insert into manager(musername,mpassword,mname) values(#{username},#{password},#{name})")
    void addManager(Manager manager);
}

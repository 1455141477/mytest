package cn.itcast.controller;

import cn.itcast.dao.UserMapper;
import cn.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
       return userMapper.findAll();
    }

}

package cn.itcast.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
@RequestMapping("/q2")
public class QuickStartController2 {
    private String name;
    private Integer age;
    @RequestMapping("/quick2")
    @ResponseBody
    public String quick(){
       return "name:"+name+",age:"+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

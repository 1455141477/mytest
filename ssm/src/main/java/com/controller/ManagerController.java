package com.controller;

import com.domain.Manager;
import com.service.ManagerService;
import com.utils.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/manager")
@SessionAttributes(value = "man",types = {Manager.class})
public class ManagerController {
    @Autowired
    private ManagerService service;
    /**
     * 管理员注册
     */
    @RequestMapping(value = "/regist",method = {RequestMethod.POST})
    public String ManagerRegist(@RequestParam(value = "check",required = false)String check, @RequestParam(value = "repassword",required = false) String repassword, Model model, Manager manager){
        if(check==null){
            check="0";
        }
        System.out.println(manager);
        if(!manager.getPassword().equals(repassword)){
            model.addAttribute("reerror","两次输入的密码不一致！");
            return "ManagerRegist";
        }
        try {
            service.addManager(manager);
        } catch (BookException e) {
            model.addAttribute("error",e.getMessage());
        }
        model.addAttribute("success","注册成功！");
        model.addAttribute("manager",manager);
        if(Integer.parseInt(check)==1){
            model.addAttribute("man",manager);
        }
        return "ManagerLogin";
    }
    /**
     * 管理员登录
     * @param manager
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method ={RequestMethod.POST})
    public String login(@RequestParam(value = "check",required = false) String check, Manager manager, Model model, HttpServletRequest request) throws Exception{
        Manager man=(Manager)request.getSession().getAttribute("man");
        if(man!=null){

        }
        System.out.println(check);
        boolean b;
        try {
            b = service.login(manager);
        } catch (BookException e) {
            model.addAttribute("error",e.getMessage());
            return "ManagerLogin";
        }
        if(b){
            if(check!=null){
                model.addAttribute("man",manager);
            }
            model.addAttribute("manager",manager);
            return "index";
        }else {
            model.addAttribute("username",manager.getUsername());
            model.addAttribute("perror","您输入的密码错误，请重新输入");
            return "ManagerLogin";
        }
    }

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/toregist")
    public String ManagertoRegist(){
        return "ManagerRegist";
    }
    @RequestMapping("/toindex")
    public String ToIndex(){
        return "index";
    }
}

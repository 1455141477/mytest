package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/mlogin")
    public String Managerlogin(){
        return "ManagerLogin";
    }
    @RequestMapping("/rlogin")
    public String ReaderLogin(){
        return "readerLogin";
    }
}

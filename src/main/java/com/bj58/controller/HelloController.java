package com.bj58.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
    @RequestMapping(value="/Hello")  
    public String HelloWorld(Model model){  
        model.addAttribute("message","Hello World!!!");  
        return "HelloWorld";  
    }  
}

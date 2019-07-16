package com.company.controllers;

import com.company.beans.RequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private RequestBean requestBean;

    @RequestMapping(method = RequestMethod.GET)
    public String printYee() {
        requestBean.printHashCode();
        System.out.println("Yeeee");
        return "hello";
    }

    @RequestMapping(value = "/tt",method = RequestMethod.GET)
    public String printHello() {
        System.out.println("I am in controller");
        return "hello";
    }
}

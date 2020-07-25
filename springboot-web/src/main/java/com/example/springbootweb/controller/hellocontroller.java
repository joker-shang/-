package com.example.springbootweb.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class hellocontroller {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "helloworld";
    }
}


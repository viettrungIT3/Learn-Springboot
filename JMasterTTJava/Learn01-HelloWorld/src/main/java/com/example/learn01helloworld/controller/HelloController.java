package com.example.learn01helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @Value("${my.key}")
    private String hello;

    @Autowired
    private Environment environment;

    @GetMapping("/hi")
    public String hello(HttpServletRequest request) {
        request.setAttribute("msg", environment.getProperty("my.key"));
        return "hello";
    }
}

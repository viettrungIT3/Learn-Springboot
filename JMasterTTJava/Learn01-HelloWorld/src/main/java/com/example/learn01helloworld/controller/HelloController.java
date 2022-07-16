package com.example.learn01helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hi")
    public String hello(HttpServletRequest request) {
        request.setAttribute("msg", "Hello World!");
        return "hello";
    }
}

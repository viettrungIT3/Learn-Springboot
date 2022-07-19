package com.example.learn01helloworld.controller;

import com.example.learn01helloworld.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/get")
    public String getPerson(Model model) {
        Person p1 = new Person(1, "Nguyễn Văn A");
        model.addAttribute("p", p1);
        return "person";
    }

    @GetMapping("/list")
    public String getAllPerson(Model model) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Nguyễn Văn A"));
        list.add(new Person(2, "Nguyễn Văn B"));
        list.add(new Person(3, "Nguyễn Văn C"));
        model.addAttribute("listPerson", list);
        return "person-list";
    }
}

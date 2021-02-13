package com.norisuke.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.norisuke.quickmaster.models.BookRepository;

@Controller
public class HelloController {
    private BookRepository rep;

    @Autowired
    public HelloController(BookRepository rep){
        this.rep=rep;
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("books",rep.findAll());
        return "list";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String inidex(){
        return "Hello Container Java Develop World !!";
    }

    @GetMapping("/greet")
    public String greet(Model model){
        model.addAttribute("message","Hello Spring Container Develop Environment !!");
        return "/hello/greet";
    }

}

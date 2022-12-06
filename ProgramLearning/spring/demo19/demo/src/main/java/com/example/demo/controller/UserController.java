package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//SpringMVC的注解
@RestController
@RequestMapping("/books")
public class UserController {

    // Restful的注解
    @GetMapping("/{id}")
    public String save(@PathVariable Integer id) {
        System.out.println("id===>" + id);
        return "hello,spring boot";
    }
}
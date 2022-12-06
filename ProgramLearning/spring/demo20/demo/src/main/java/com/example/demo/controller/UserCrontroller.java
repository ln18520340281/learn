package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserCrontroller
 */
@Controller
public class UserCrontroller {
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name, int age) {
        System.out.println("save..." + name + "..." + age);
        return "{'info':'springmvc'}";
    }
}
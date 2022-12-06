package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserCrontroller
 */
@RestController
@RequestMapping("/users")
public class UserCrontroller {

    // RESTFUL风格
    @GetMapping("/{id}")
    public String insert(@PathVariable int id) {
        System.out.println("insert..." + id);
        return "{'info':'springmvc'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        System.out.println("delete..." + id);
        return "{'info':'springmvc'}";
    }
}
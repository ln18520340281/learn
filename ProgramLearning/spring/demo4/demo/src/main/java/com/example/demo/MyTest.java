package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // retrieve configured instance
        UserService userService = context.getBean(UserServiceImpl.class);

        // use configured instance
        userService.save();
    }
}

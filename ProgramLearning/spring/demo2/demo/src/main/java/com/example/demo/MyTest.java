package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import service.UserService;
import service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // retrieve configured instance
        UserService userService = context.getBean("userService", UserServiceImpl.class);

        // use configured instance
        UserDao userDao = context.getBean("userDao",UserDaoImpl.class);

        userService.save();
        userDao.save();
    }
}

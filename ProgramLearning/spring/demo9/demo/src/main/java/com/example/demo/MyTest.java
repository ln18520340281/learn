package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.SpringConfig;
import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userService", UserServiceImpl.class);

        UserDao userDao = context.getBean("userDao",UserDaoImpl.class);

        userService.save();
        userDao.save();
        context.close();
    }
}

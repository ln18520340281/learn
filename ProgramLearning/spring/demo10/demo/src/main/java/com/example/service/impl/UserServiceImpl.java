package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.UserDao;
import com.example.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserServiceImpl...");
        userDao.save();
    }

}

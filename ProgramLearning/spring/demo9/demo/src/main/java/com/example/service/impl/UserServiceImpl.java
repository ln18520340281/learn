package com.example.service.impl;

import org.springframework.stereotype.Component;

import com.example.service.UserService;
@Component("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("UserServiceImpl...");
    }

}

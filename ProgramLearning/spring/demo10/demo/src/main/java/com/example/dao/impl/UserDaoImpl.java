package com.example.dao.impl;

import org.springframework.stereotype.Component;

import com.example.dao.UserDao;
@Component("userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void save() {
        System.out.println("UserDaoImpl...");        
    }
    
}

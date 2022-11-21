package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.Dao;
import com.example.demo.service.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface{
    @Autowired
    private Dao dao;
    @Override
    public void save() {
        System.out.println("Here is Service Impl");
        dao.save();    
    }
    
}

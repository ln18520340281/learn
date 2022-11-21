package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.Dao;

@Repository
public class DaoImpl implements Dao{

    @Override
    public void save() {
        System.out.println("Here is DaoImpl");
    }
    
}

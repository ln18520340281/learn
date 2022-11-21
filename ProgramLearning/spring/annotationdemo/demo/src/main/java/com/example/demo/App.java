package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.SpringConfig;
import com.example.demo.dao.Dao;
import com.example.demo.dao.impl.DaoImpl;
import com.example.demo.service.ServiceInterface;
import com.example.demo.service.impl.ServiceImpl;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        ServiceInterface service = app.getBean(ServiceImpl.class);
        service.save();
        app.close();
    }
}

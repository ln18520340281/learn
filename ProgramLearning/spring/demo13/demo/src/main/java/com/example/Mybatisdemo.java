package com.example;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Config.SpringConfig;
import com.example.POJO.Blog;
import com.example.Service.SelectService;
import com.example.Service.impl.Serviceimpl;

public class Mybatisdemo {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext = 
        new AnnotationConfigApplicationContext(SpringConfig.class);
        SelectService selectService = applicationContext.getBean(Serviceimpl.class);
        Blog blog = selectService.selectblog(101);
        System.out.println(blog);
        applicationContext.close();
    }
}
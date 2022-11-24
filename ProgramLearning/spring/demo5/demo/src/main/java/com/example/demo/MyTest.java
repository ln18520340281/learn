package com.example.demo;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        DataSource dataSource = context.getBean("druidDataSource",DataSource.class);
        System.out.println(dataSource);
    }
}

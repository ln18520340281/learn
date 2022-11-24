package com.example.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.SpringConfig;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = context.getBean("dataSource",DataSource.class);
        System.out.println(dataSource);
        context.close();
    }
}

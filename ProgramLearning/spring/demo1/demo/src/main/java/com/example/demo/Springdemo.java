package com.example.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.jpetstore.services.PetStoreService;

public class Springdemo {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        // use configured instance
        List<String> userList = service.getUsernameList();
    }
}

package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Config.SpringConfig;
import com.example.Service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SelectServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("张三", "李南", 100D);
        System.out.println("hello---------------------------------------------------------------");
    }
}

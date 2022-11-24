package com.example.Service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SelectServiceTest {

    @Autowired
    private SelectService selectService;

    @Test
    public void testSelectService() {
        System.out.println(selectService.selectblog(101));
    }

    @Test
    public void test() {
        System.out.println("hello");
    }
}

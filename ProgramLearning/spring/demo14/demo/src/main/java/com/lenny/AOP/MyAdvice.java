package com.lenny.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    
    @Pointcut("execution(void com.lenny.dao.UserDao.test())")
    private void pt(){}

    @Before("pt()")
    public void method() {
        System.out.println("AOP here");
    }
}

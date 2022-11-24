package com.lenny.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.lenny.dao.UserDao.test())")
    private void pt() {
    }

    @Around("pt()")
    public void method(ProceedingJoinPoint pJoinPoint) throws Throwable {
        System.out.println("before");
        // Object proceed = pJoinPoint.proceed();
        pJoinPoint.proceed();
        System.out.println("after");
    }
}

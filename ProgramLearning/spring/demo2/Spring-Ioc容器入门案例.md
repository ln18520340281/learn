# Ioc容器入门案例

## 目录结构

![20221121170954](https://cdn.jsdelivr.net/gh/ln18520340281/PicGo@master/20221121170954.png)

~~~java
import dao.UserDao;

public class UserDaoImpl implements UserDao{

    @Override
    public void save() {
        System.out.println("UserDaoImpl...");        
    }
    
}
~~~

~~~java
import service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("UserServiceImpl...");
    }

}
~~~

说明：dao层和service层的接口只有一个save方法，在实现类中save方法打印一行表示调用

## 编写XML配置文件

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
        
    <bean id="userDao" class="dao.impl.UserDaoImpl"/>
    <bean id="userService" class="service.impl.UserServiceImpl"/>
</beans>
~~~

## 实例化Ioc容器

~~~Java
package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import service.UserService;
import service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // retrieve configured instance
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        UserDao userDao = context.getBean("userDao",UserDaoImpl.class);
        
        // use configured instance
        userService.save();
        userDao.save();
    }
}
~~~

package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//标志配置类SpringConfig，让Spring可以识别
@ComponentScan("com.example")//扫描com.example.demo下的文件，自动装配
public class SpringConfig {
    
}

package com.lenny.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring
 */
@Configuration
@ComponentScan("com.lenny")
@EnableAspectJAutoProxy
public class SpringCongfig {

}
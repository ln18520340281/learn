package com.example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;

public class JdbcConfig {
    @Bean("dataSource")
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}

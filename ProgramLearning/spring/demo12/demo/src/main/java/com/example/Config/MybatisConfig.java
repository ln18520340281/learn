package com.example.Config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean session = new SqlSessionFactoryBean();
        // TypeAliasesPackage用于确定返回的查询结果类型（mybatis查询）
        session.setTypeAliasesPackage("com.example.POJO");
        session.setDataSource(dataSource);
        return session;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mConfigurer = new MapperScannerConfigurer();
        mConfigurer.setBasePackage("com.example.dao");
        return mConfigurer;
    }
}

package com.example.MyBatisDemo;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.POJO.Blog;

public class FirstMyBatis {
    public static void main(String[] args) throws IOException {

        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        /***
         * try-with-resources
         * JDK7 之后，Java 新增的 try-with-resource 语法糖来打开资源，并且可以在语句执行完毕后确保每个资源都被自动关闭 。
         * 
         * JDK7 之前所有被打开的系统资源，比如流、文件或者 Socket 连接等，都需要被开发者手动关闭，否则将会造成资源泄露。
         * 
         * try (resource declaration) {
         * // 使用的资源
         * } catch (ExceptionType e1) {
         * // 异常块
         * }
         * 以上的语法中 try 用于声明和实例化资源，catch 用于处理关闭资源时可能引发的所有异常。
         * 
         * 注意：try-with-resources 语句关闭所有实现 AutoCloseable 接口的资源。
         ***/
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Blog selectOne = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
            System.out.println(selectOne);
        }
    }
}
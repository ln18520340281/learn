# Java-阿里巴巴Druid数据库连接池范例

## 配置文件

~~~properties
driverClassName=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/user?useSSL=false&useServerPreStmts=true
# 也可以这样写
# url=jdbc:mysql:///user?useSSL=false&useServerPreStmts=true
username=root
password=!@#123ToBeHappy
initialSize=5
maxActive=10
maxWait=3000
~~~

## Java代码

~~~Java
package com.example.demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class MyTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("demo/src/main/resources/jdbc.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement("select * from student");
        ResultSet resultSet = prepareStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getInt("idstudent"));
            System.out.println(resultSet.getString("studentname"));
            System.out.println(resultSet.getString("studentgender"));
        }
        resultSet.close();
        prepareStatement.close();
        connection.close();
        System.out.println(connection);
    }
}
~~~

package com.lq.s1.s5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test2 {

    public static void main(String[] args){
        ApplicationContext ac =  new ClassPathXmlApplicationContext("Spring-config-2.xml");

        /**
         * 1.数据库配置链接 需要c3p0-0.9.1.2.jar与mysql-connector-java-5.1.10.jar
         * 2.导入属性文件
         */
        DataSource dataSource = (DataSource) ac.getBean("dataSource2");
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

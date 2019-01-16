package com.lq.s1.jdbc2;

import com.lq.s1.jdbc2.UserInfo;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class Main {

    public static void main(String[] args) {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setUser("root");
//        dataSource.setPassword("123456");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8");
//        try {
//            dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
        ComboPooledDataSource dataSource = DataSourceUtil.getDataSource();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String queryUser = "select * from user_info where id=2";
        UserInfo userInfo = jdbcTemplate.queryForObject(queryUser, new BeanPropertyRowMapper<>(UserInfo.class));
        System.out.println(userInfo.toString());
    }

}

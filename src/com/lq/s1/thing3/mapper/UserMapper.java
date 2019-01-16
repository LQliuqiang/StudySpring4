package com.lq.s1.thing3.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int updateMoney(String username,int devalue){
        String sql = "UPDATE thing_test_user SET money=money-? WHERE username=?";
        return jdbcTemplate.update(sql, devalue, username);
    }

    public int queryBalance(String username){
        String sql = "SELECT money FROM thing_test_user WHERE username=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, username);
    }

}

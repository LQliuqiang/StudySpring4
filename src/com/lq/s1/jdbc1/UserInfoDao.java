package com.lq.s1.jdbc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * 开发时使用的模式
 */
@Repository
public class UserInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 根据username查询获取UserInfo
     */
    public UserInfo get(String username){
        String querySql = "select * from user_info where username=?";
        RowMapper<UserInfo> rowMapper = new BeanPropertyRowMapper<>(UserInfo.class);
        UserInfo userInfo = jdbcTemplate.queryForObject(querySql, rowMapper, username);
        return userInfo;
    }

}

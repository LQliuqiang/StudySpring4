package com.lq.s1.jdbc3;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Qualifier("c3dataSource")
    @Autowired
    private ComboPooledDataSource c3dataSource;

    public void queryUser(String userId){
        c3dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/corepro");
        String sql = "SELECT type_name,product_id FROM iot_gw_type WHERE user_id=?";
        List<String> strings = jdbcTemplate.query(sql, new SingleColumnRowMapper<>(), userId);
        System.out.println(strings);

    }

}

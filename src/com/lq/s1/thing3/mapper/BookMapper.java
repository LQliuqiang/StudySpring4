package com.lq.s1.thing3.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;



    //查询库存
    public int queryInventory(int book_id){
        String sql = "SELECT inventory FROM thing_test_book WHERE book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, book_id);
    }

    //修改库存
    public int updateInventory(int book_id){
        String sql = "UPDATE thing_test_book SET inventory=inventory-1 WHERE book_id=?";
        return jdbcTemplate.update(sql,book_id);
    }

    //查询书的价格
    public int queryBookPrice(int book_id){
        String sql = "SELECT price FROM thing_test_book WHERE book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, book_id);
    }

}

package com.lq.s1.thing3.service;

import com.lq.s1.thing3.mapper.BookMapper;
import com.lq.s1.thing3.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BuyBookService {

    @Autowired
    BookMapper bookMapper;
    @Autowired
    UserMapper userMapper;

    @Transactional
    public void buyBook(String username, int book_id) {
        int inventory = bookMapper.queryBookPrice(book_id);
        if (inventory == 0) {
            throw new RuntimeException("库存不够");
        }

        int updateInventory = bookMapper.updateInventory(book_id); //先更新库存
        if (updateInventory == 1) {

            int bookPrice = bookMapper.queryBookPrice(book_id);//查询书价格

            int balance = userMapper.queryBalance(username);
            if (balance < bookPrice) {
                throw new RuntimeException("购买失败:余额不足");
            }else {
                int updateMoney = userMapper.updateMoney(username, bookPrice);//修改账户余额
                if (updateMoney == 1) {
                    System.out.println("购买成功");
                } else {
                    throw new RuntimeException("购买失败:修改用户余额");
                }
            }

        } else {
            throw new RuntimeException("购买失败:修改库存");
        }
    }

}

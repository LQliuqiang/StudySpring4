package com.lq.s1.s9.respository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRespository implements IUserRespository {
    @Override
    public void saveUser() {
        System.out.println("UserJdbcRespository 保存用户...");
    }
}

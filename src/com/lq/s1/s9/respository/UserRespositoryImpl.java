package com.lq.s1.s9.respository;

import org.springframework.stereotype.Repository;

/**
 * Repository:标识持久层组件
 *
 * 指定调用的注解名称
 */
//@Repository(value = "userRespository")
@Repository
public class UserRespositoryImpl implements IUserRespository {

    @Override
    public void saveUser() {
        System.out.println("UserRespositoryImpl 保存用户...");
    }
}

package com.lq.s1.s9.service;

import com.lq.s1.s9.MyObject;
import com.lq.s1.s9.TestObject;
import com.lq.s1.s9.respository.IUserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Service:标识服务层(业务层)组件
 */
@Service
public class UserService {


    /**
     * Autowired:自动装配 (只会装配添加Spring配置注解的类)
     */
    //因为有两个实现了IUserRespository接口且都添加了@Repository，于是当前addUser()方法内不知调用的是哪一个，
    // 所以要通过@Qualifier指定实现调用哪一个实现类
    @Qualifier("userJdbcRespository")
    @Autowired
    private IUserRespository userRespository;

    //因为myObject没有被Spring装配修饰 所以可以用required = false 不然会空指针
    @Autowired(required = false)
    private MyObject myObject;

    @Autowired
    private TestObject testObject;

    public void addUser(){
        System.out.println("UserService  添加用户......" + myObject+"--------"+testObject);
        userRespository.saveUser();
    }

    public void deleteUser(){
        System.out.println("UserService  删除用户......");
    }

    public void updateUser(){
        System.out.println("UserService  修改用户......");
    }
}

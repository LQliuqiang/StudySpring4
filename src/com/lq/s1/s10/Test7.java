package com.lq.s1.s10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {

    /***
     * （前面都是基于注解’的方式来配置bean）
     *
     * ******现在是基于‘泛型依赖注入’的方式来配置
     */
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-6.xml");

        UserService userService = (UserService) ac.getBean("userService");
        userService.addUser();
    }

}

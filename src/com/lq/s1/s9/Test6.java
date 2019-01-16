package com.lq.s1.s9;

import com.lq.s1.s9.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

    /***
     * （前面都是基于xml文件的方式来配置bean）
     *
     * ******现在是基于‘注解’的方式来配置（在开发中比较流行）
     *      [就是 注解+bean 将这个bean放入IOC容器中]
     */
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-5.xml");

//        TestObject testObject = (TestObject) ac.getBean("testObject");
//        testObject.test();
//
//        UserController userController = (UserController) ac.getBean("userController");
//        userController.execute();
//
//        UserService userService = (UserService) ac.getBean("userService");
//        userService.addUser();
//
//        IUserRespository userRespository = (IUserRespository) ac.getBean("userRespository");
//        userRespository.saveUser();


        UserController userController = (UserController) ac.getBean("userController");
//        UserController userController =  ac.getBean(UserController.class);
        userController.execute();

    }

}

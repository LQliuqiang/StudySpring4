package com.lq.s1.jdbc3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-jdbc3.xml");

        UserController userController = (UserController) ac.getBean("userController");

        //mysql corepro_tow
        userController.queryUser( "liuqiang");

    }

}

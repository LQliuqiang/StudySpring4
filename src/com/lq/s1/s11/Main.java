package com.lq.s1.s11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-11.xml");

        MyController myController = (MyController) ac.getBean("myController");

        myController.display();
    }

}

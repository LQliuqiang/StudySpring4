package com.lq.s1.a3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AMain3 {

    public static void main(String[] args){

        /**
         使用配置xml文件来做切面
         */

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-a3.xml");

        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ac.getBean("arithmeticCalculator");
//
        int addNumber = arithmeticCalculator.add(3, 9);
        System.out.println("得到的结果addNumber："+addNumber);

        System.out.println("--------------------------------------------");

        int divNumber = arithmeticCalculator.div(10, 0);
        System.out.println("得到的结果divNumber："+divNumber);

    }

}

package com.lq.s1.a2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AMain2 {

    public static void main(String[] args){

        /**
         AspectJ 支持 5 种类型的通知注解:
         @Before: 前置通知, 在方法执行之前执行
         @After: 后置通知, 在方法执行之后执行()
         @AfterRunning: 返回通知, 在方法返回结果之后执行
         @AfterThrowing: 异常通知, 在方法抛出异常之后
         @Around: 环绕通知, 围绕着方法执行
         */

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-a1.xml");

        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ac.getBean("arithmeticCalculator");

        int addNumber = arithmeticCalculator.add(3, 9);
        System.out.println("得到的结果addNumber："+addNumber);

        System.out.println("--------------------------------------------");

        int divNumber = arithmeticCalculator.div(10, 0);
        System.out.println("得到的结果divNumber："+divNumber);

    }

}

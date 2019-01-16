package com.lq.s1.s8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-4.xml");

//        静态工厂方法
        Car car1 = (Car) ac.getBean("car1");
        System.out.println(car1.toString());

        System.out.println("-------------------------------------");

//        实例工厂方法
        Car car2 = (Car) ac.getBean("car2");
        System.out.println(car2.toString());

        System.out.println("-------------------------------------");

//        使用spring提供的FactoryBean
        Car car3 = (Car) ac.getBean("car3");
        System.out.println(car3.toString());

    }


}

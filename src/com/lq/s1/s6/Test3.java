package com.lq.s1.s6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-2.xml");

        //        SpEL表达式

        Car car = (Car) ac.getBean("car");
        System.out.println(car.getLunTaiZhouChang());

        System.out.println("-------------------------------------------------------");


        Person person = (Person) ac.getBean("person");
        System.out.println(person.toString());

    }

}

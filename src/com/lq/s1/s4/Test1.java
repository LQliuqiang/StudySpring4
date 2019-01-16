package com.lq.s1.s4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-1.xml");

//        01.自动装配
        Person person = (Person) ac.getBean("person");
        System.out.println(person.toString());

        System.out.println("----------------------------------------");

//        02.bean继承 使用bean的parent属性 继承bean的配置
        Address addressChild = (Address) ac.getBean("addressChild");
        System.out.println(addressChild.toString());

        System.out.println("----------------------------------------");

//        03.Spring中配置的bean对象默认是单例的
        Address address = (Address) ac.getBean("address");
        Address address2 = (Address) ac.getBean("address");
        System.out.println("单例的作用域："+(address == address2));

        System.out.println("----------------------------------------");

        Address myAddress = (Address) ac.getBean("myAddress");
        Address myAddress2 = (Address) ac.getBean("myAddress");
        System.out.println("原型的作用域："+(myAddress == myAddress2));

        System.out.println("----------------------------------------");
    }

}

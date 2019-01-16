package com.lq.s1.thing2;

import com.lq.s1.thing2.service.BookShopService;
import com.lq.s1.thing2.service.BuyBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    /**
     * 相对与thing1，本篇是在xml文件中进行事物配置，
     * 并且将有关事物操作的放在service与serviceImpl文件夹下，好在xml文件中做事物配置的管理
     */
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-thing2.xml");

//        BookShopDao bookShopDao = (BookShopDao) ac.getBean("bookShopDao");

        BookShopService bookShopService = ac.getBean(BookShopService.class);
//        bookShopService.purchase("AA",1001);

        BuyBook buyBook = ac.getBean(BuyBook.class);

        buyBook.buy("AA",Arrays.asList(1001,1002));



    }


}

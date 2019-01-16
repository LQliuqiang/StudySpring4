package com.lq.s1.thing;

import com.lq.s1.thing.dispense.BuyBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-thing.xml");

//        BookShopDao bookShopDao = (BookShopDao) ac.getBean("bookShopDao");

        BookShopService bookShopService = ac.getBean(BookShopService.class);
//        bookShopService.purchase("AA",1001);

        BuyBook buyBook = ac.getBean(BuyBook.class);

        buyBook.buy("AA",Arrays.asList(1001,1002));



    }


}

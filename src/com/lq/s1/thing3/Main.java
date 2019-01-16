package com.lq.s1.thing3;

import com.lq.s1.thing2.service.BookShopService;
import com.lq.s1.thing2.service.BuyBook;
import com.lq.s1.thing3.service.BuyBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-thing3.xml");


        BuyBookService buyBookService = ac.getBean(BuyBookService.class);


        buyBookService.buyBook("liuqiang",1);
    }

}

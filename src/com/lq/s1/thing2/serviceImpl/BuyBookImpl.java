package com.lq.s1.thing2.serviceImpl;

import com.lq.s1.thing2.service.BookShopService;
import com.lq.s1.thing2.service.BuyBook;

import java.util.List;

public class BuyBookImpl implements BuyBook {

    private BookShopService bookShopService;

    public void setBookShopService(BookShopService bookShopService) {
        this.bookShopService = bookShopService;
    }

    @Override
    public void buy(String username, List<Integer> isbns) {
        for (Integer isbn:isbns){
            bookShopService.purchase(username,isbn);
        }
    }
}

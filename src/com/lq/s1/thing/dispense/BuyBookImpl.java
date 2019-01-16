package com.lq.s1.thing.dispense;

import com.lq.s1.thing.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("buyBook")
public class BuyBookImpl implements BuyBook {

    @Autowired
    private BookShopService bookShopService;

    //这个事物调用了BookShopService.purchase()方法上的事物-----[结合BookShopService.purchase()方法上的注释看]
    @Transactional
    @Override
    public void buy(String username, List<Integer> isbns) {
        for (Integer isbn:isbns){
            bookShopService.purchase(username,isbn);
        }
    }
}

package com.lq.s1.thing2.service;

import java.util.List;

public interface BuyBook {

    /**
     * 一个人买多本书
     * @param username
     * @param isbns 多个书号
     */
    void buy(String username, List<Integer> isbns);

}

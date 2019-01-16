package com.lq.s1.s11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Qualifier("userLiuFeiFeiBean")
    @Autowired
    private UserBean userBean;

    public void display(){
        System.out.println(userBean.toString());
    }

}

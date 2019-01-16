package com.lq.s1.s9.controller;

import com.lq.s1.s9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller:标识表现层组件
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    public UserController() {
    }

    public  void execute(){
        userService.addUser();
        System.out.println("UserController  execute.....");
    }
}

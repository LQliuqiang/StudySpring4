package com.lq.s1.s10;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    protected BaseRepository<T> baseRepository;

    public void  addUser(){
        System.out.println("添加用户");
        baseRepository.save();
    }

}

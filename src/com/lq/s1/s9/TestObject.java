package com.lq.s1.s9;

import org.springframework.stereotype.Component;

/**
 * Component : 基本注解, 标识了一个受 Spring 管理的组件
 */
@Component
public class TestObject {

    public TestObject() {

    }

    public void test(){
        System.out.println("TestObject.....");
    }
}

package com.lq.s1.s7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args){

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Spring-config-3.xml");
        Login login = (Login) ac.getBean("login");
        login.executeLogin();
        System.out.println(login.toString());
        login.loginSuccess();
        ac.close();

        /**
         login.......
         设置密码了.....
         设置用户名了.....
         postProcessBeforeInitialization:login
         初始化方法
         postProcessAfterInitialization:login
         执行了登录的方法了
         Login{userName='liuqiang', password='123456'}
         执行了登录的方法了后，登录成功了
         销毁方法
         */
    }

}

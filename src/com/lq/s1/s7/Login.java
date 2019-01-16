package com.lq.s1.s7;

public class Login {

    private String userName;
    private String password;

    public Login() {
        System.out.println("login.......");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("设置用户名了.....");
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("设置密码了.....");
        this.password = password;
    }

    public void init(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("销毁方法");
    }

    @Override
    public String toString() {
        return "Login{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void executeLogin(){
        System.out.println("执行了登录的方法了");
    }

    public void loginSuccess(){
        System.out.println("执行了登录的方法了后，登录成功了");
    }
}

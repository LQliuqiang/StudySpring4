package com.lq.s1;

public class User {

    private String name;
    private String sex;
    private int age;
    private double newAge;

    public User(String name, String sex, int age) {
        System.out.println("User第一个构造");
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public User(String name, String sex, double newAge) {
        System.out.println("User第二个构造");
        this.name = name;
        this.sex = sex;
        this.newAge = newAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", newAge=" + newAge +
                '}';
    }
}

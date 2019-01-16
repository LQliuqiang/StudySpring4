package com.lq.s1.s2;

import java.util.Map;

public class NewPerson {

    private String name;
    private String age;
    private Map<String,Car> carMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", carMap=" + carMap +
                '}';
    }
}

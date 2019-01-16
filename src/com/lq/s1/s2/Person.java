package com.lq.s1.s2;

public class Person {

    private String name;
    private String age;
    private float salary;
    private Car car;

    public Person() {
    }

    public Person(String name, String age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                ", car=" + displayCar(car) +
                '}';
    }

    private String displayCar(Car car){
        if (car == null){
            return null;
        }else {
            return car.toString();
        }
    }

}

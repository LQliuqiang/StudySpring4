package com.lq.s1.s8;

/**
 * 车
 */
public class Car {

    private String type;
    private int price;

    public Car(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

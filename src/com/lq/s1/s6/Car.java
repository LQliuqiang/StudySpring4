package com.lq.s1.s6;

/**
 * 车
 */
public class Car {

    private String type;
    private int price;
    private double lunTaiZhouChang;

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

    public double getLunTaiZhouChang() {
        return lunTaiZhouChang;
    }

    public void setLunTaiZhouChang(double lunTaiZhouChang) {
        this.lunTaiZhouChang = lunTaiZhouChang;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", lunTaiZhouChang=" + lunTaiZhouChang +
                '}';
    }
}

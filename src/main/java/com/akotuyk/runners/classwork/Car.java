package com.akotuyk.runners.classwork;


public class Car {

    private int speed, price;
    private String name;


    public Car() {
        this.speed = 150;
        this.price = 250000;
        this.name = "BMW";
    }

    public Car(int price, String name) {
        this();
        this.price = price;
        this.name = name;
    }

    public String toString (){
        return "name: " + name + "; price: " + price + "; speed: " + speed;
    }

//    @Override                            можно вызвать его через Shift+Insert и выбрать toString();
//    public String toString() {
//        return "Car{" +
//                "speed=" + speed +
//                ", price=" + price +
//                ", name='" + name + '\'' +
//                '}';
//    }
}

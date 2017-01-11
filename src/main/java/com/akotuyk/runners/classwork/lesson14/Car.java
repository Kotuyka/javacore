package com.akotuyk.runners.classwork.lesson14;

public abstract class Car {

    public String name = "Car";

    abstract void drive();

    public Car(String name) {
        this.name = name;
    }
}

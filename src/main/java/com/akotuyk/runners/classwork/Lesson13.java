package com.akotuyk.runners.classwork;

/**
 * Created by Huly-Buly on 15.12.2016.
 */
public class Lesson13 {

    public static void main(String[] args) {
        Lesson13 lesson13 = new Lesson13();
        lesson13.printObject();
    }

    public void printObject() {
        Car car1 = new Car();
        System.out.println(car1.toString());
        Car car2 = new Car(999, "Lanos");
        System.out.println(car2.toString());
    }
}

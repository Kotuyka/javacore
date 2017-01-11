package com.akotuyk.runners.classwork.lesson14;

/**
 * Created by Huly-Buly on 29.12.2016.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car bmw = new BMW("X6");
        System.out.println(bmw.name);
        Car audi = new Audi("A6");
        System.out.println(audi.name);
        printEmissions(bmw);
        printEmissions(audi);

//        BMW bmw1 = new BMW("X7", 1);
//        System.out.println(bmw1.);

        Car car = new Car("X6"){
            @Override
            void drive() {
                System.out.println("We are in anonymus class");
            }
        };
        printEmissions(car);


    }

    public static void printEmissions (Car car){
        car.drive();
    }
}

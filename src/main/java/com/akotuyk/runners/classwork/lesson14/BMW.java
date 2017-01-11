package com.akotuyk.runners.classwork.lesson14;


public class BMW extends Car {

    private Engine bmwEngine;

    public BMW(String name) {
        super(name);
    }

    public BMW(String name, String bmwEngine) {
        super(name);
        this.bmwEngine.setTypeOfCylinder("V10");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "bmwEngine=" + bmwEngine +
                '}';
    }

    @Override
    void drive() {
        System.out.println("94 emissions");

    }
}

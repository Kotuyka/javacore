package com.akotuyk.runners.classwork.lesson14;

/**
 * Created by Huly-Buly on 29.12.2016.
 */
public class Audi extends Car {

    private String name;
    public Audi(String name) {
        super(name);
    }

//    @Override
//    void setUp() {
//        System.out.println("90 emissions");
//    }

    @Override
    void drive() {
        System.out.println("90 emissions");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audi)) return false;

        Audi audi = (Audi) o;

        return name != null ? name.equals(audi.name) : audi.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

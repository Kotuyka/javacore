package com.akotuyk.app.homework.lesson13;

/**
 * Created by Huly-Buly on 27.12.2016.
 */
public class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.name = name;
        if (setAge(age)) {
            this.age = age;
        }
    }

    private boolean setAge(int age) {
        if (1 <= age && age <= 120) {
            System.out.println("New age setted");
            return true;
        }
        System.out.println("Age invalid");
        return false;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

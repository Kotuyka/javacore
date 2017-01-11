package com.akotuyk.app.homework.lesson15;

/**
 * Created by Huly-Buly on 11.01.2017.
 */
public class CustomBicycle extends Bicycle {

    private int speed;
    private int gear;

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void printSpeed() {
        System.out.println("Your bicycle speed is: " + speed + ".");
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void printGear() {
        System.out.println("Your bicycle has " + gear + " gears.");
    }
}

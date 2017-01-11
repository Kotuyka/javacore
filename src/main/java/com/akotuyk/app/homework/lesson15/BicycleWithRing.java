package com.akotuyk.app.homework.lesson15;

/**
 * Created by Huly-Buly on 11.01.2017.
 */
public class BicycleWithRing extends Bicycle implements BicycleWithRingInterface {

    private int speed;
    private int gear;

    @Override
    public void ring(int ringCounter) {
        for (int i = 0; i < ringCounter; i++) {
            System.out.print("Di-ling!");
        }
        System.out.println();
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

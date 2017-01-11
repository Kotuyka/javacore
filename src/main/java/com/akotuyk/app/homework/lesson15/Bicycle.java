package com.akotuyk.app.homework.lesson15;

/**
 * Created by Huly-Buly on 11.01.2017.
 */
public abstract class Bicycle {

    public abstract void setSpeed(int speed);

    public abstract void printSpeed();

    public abstract void setGear(int gear);

    public abstract void printGear();

    public void ride() {
        System.out.println("Wroom!");
    }

}

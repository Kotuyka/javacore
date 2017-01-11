package com.akotuyk.runners.homework.lesson15;

import com.akotuyk.app.homework.lesson15.Bicycle;
import com.akotuyk.app.homework.lesson15.BicycleWithRing;
import com.akotuyk.app.homework.lesson15.BicycleWithRingInterface;
import com.akotuyk.app.homework.lesson15.CustomBicycle;

/**
 * Created by Huly-Buly on 11.01.2017.
 */
public class Lesson15Runner {

    public static void main(String[] args) {

        BicycleWithRingInterface ringTry = new BicycleWithRing();
        ringTry.ring(3);

        Bicycle newBicycle = new CustomBicycle();
        newBicycle.setGear(2);
        newBicycle.printGear();
        newBicycle.ride();
    }
}

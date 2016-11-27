package com.akotuyk.app.homework.lesson7;

/**
 * Created by Huly-Buly on 27.11.2016.
 */
public class ExerciseA {

    public static int[] evenArray () {
        int count = 0;
        for (int a=0; a<=20; a+=2) {
            count++;}
        int[] intArray = new int[count];
        int n=0;
        for (int a=0; a<=20; a+=2) {
                intArray [n] = a;
                n++;}
        return intArray;
    }
}

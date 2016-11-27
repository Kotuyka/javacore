package com.akotuyk.app.homework.lesson7;

/**
 * Created by Huly-Buly on 27.11.2016.
 */
public class ExerciseB {

    public static int[] oddArray () {
        int count = 0;
        for (int a=1; a<=99; a+=2) {
            count++;}
        int[] intArray = new int[count];
        int n=0;
        for (int a=1; a<=99; a+=2) {
            intArray [n] = a;
            n++;}
        return intArray;
    }
}

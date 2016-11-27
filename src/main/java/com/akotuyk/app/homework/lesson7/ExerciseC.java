package com.akotuyk.app.homework.lesson7;

import com.akotuyk.runners.homework.lesson7.LoopsArraysRunner;

public class ExerciseC {

    public static int[] randomArray () {
        int[] intArray = new int[15];
        for (int i = 0; i <intArray.length ; i++) {
            intArray[i]=( (int)((Math.random()*9) + 0));}
        return intArray;
    }

    public static int countArray () {
        int count = 0;
        for (int a=0; a<=LoopsArraysRunner.intArray.length; a+=2) {
            count++;}
        return count;
    }
}

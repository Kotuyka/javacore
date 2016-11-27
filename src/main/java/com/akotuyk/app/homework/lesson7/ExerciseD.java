package com.akotuyk.app.homework.lesson7;

import static com.akotuyk.runners.homework.lesson7.LoopsArraysRunner.intArray;

public class ExerciseD {

    public static int[] randomArray () {
        int[] intArray = new int[15];
        for (int i = 0; i <intArray.length ; i++) {
            intArray[i]=( (int)((Math.random()*999) + 0));}
        return intArray;
    }

    public static int maxIntArray () {
        int maxIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[maxIndex] < intArray[i]) {
                maxIndex = i;}}
        return intArray[maxIndex];
    }

    public static int minIntArray () {
        int minIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[minIndex] > intArray[i]) {
                minIndex = i;}}
        return intArray[minIndex];
    }
}

package com.akotuyk.app.homework.lesson7;

public class ExerciseC {

    public int[] randomArray(int a, int b, int c) {
        int[] intArray = new int[a];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ((int) ((Math.random() * b) + c));
        }
        return intArray;
    }

    public int countArray(int[] d) {
        int count = 0;
        for (int a = 0; a <= d.length; a += 2) {
            count++;
        }
        return count;
    }
}

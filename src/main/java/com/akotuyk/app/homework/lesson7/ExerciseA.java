package com.akotuyk.app.homework.lesson7;

public class ExerciseA {

    public int countForEvenArray(int b) {
        int count = 0;
        for (int a = 0; a <= b; a += 2) {
            count++;
        }
        return count;
    }

    public int[] evenArray(int count, int c) {
        int[] intArray = new int[count];
        int n = 0;
        for (int a = 0; a <= c; a += 2) {
            intArray[n] = a;
            n++;
        }
        return intArray;
    }
}

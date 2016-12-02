package com.akotuyk.app.homework.lesson7;

public class ExerciseB {

    public int[] oddArray(int count, int b) {
        int[] intArray = new int[count];
        int n = 0;
        for (int a = 1; a <= b; a += 2) {
            intArray[n] = a;
            n++;
        }
        return intArray;
    }

    public int countForArray(int b) {
        int count = 0;
        for (int a = 1; a <= b; a += 2) {
            count++;
        }
        return count;
    }
}

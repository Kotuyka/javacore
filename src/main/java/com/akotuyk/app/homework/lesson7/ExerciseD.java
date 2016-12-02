package com.akotuyk.app.homework.lesson7;

public class ExerciseD {

    public int[] randomArray(int a, int b, int c) {
        int[] intArray = new int[a];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ((int) ((Math.random() * b) + c));
        }
        return intArray;
    }

    public int maxIntArray(int[] a) {
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[maxIndex] < a[i]) {
                maxIndex = i;
            }
        }
        return a[maxIndex];
    }

    public int minIntArray(int[] b) {
        int minIndex = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[minIndex] > b[i]) {
                minIndex = i;
            }
        }
        return b[minIndex];
    }
}

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

    public int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        return b;
    }
}

package com.akotuyk.app.homework.lesson9;

/**
 * Created by Huly-Buly on 03.12.2016.
 */
public class MethodsOfSorts {

    private static int[] intArray;

    public void intArray(int a, int b, int c) {
        this.setRandomArray(a, b, c);
    }

    private int[] setRandomArray(int a, int b, int c) {
        intArray = new int[a];
        for (int i = 0; i < a; i++) {
            intArray[i] = ((int) ((Math.random() * b) + c));
        }
        return intArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public int[] bubbleSortFromLowToHigher(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length; j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    public int[] bubbleSortFromHigherToLow(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length; j++) {
                if (intArray[j - 1] < intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    public int[] selectionSortFromLowToHigher(int[] intArray) {
        int min;
        for (int i = 0; i < intArray.length; i++) {
            min = i;
            for (int j = i + 1; j < intArray.length; j++) {
                while (intArray[j] < intArray[min]){
                    min = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[min];
            intArray[min] = temp;
        }
        return intArray;
    }

    public int[] selectionSortFromHigherToLow(int[] intArray) {
        int min;
        for (int i = 0; i < intArray.length; i++) {
            min = i;
            for (int j = i + 1; j < intArray.length; j++) {
                while (intArray[j] > intArray[min]){
                    min = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[min];
            intArray[min] = temp;
        }
        return intArray;
    }
}

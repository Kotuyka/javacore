package com.akotuyk.runners.homework.lesson9;

import com.akotuyk.app.homework.lesson9.MethodsOfSorts;
import com.akotuyk.app.homework.lesson9.TwoDimensionalArray;

import java.util.Arrays;

public class ArrayPrint {

    public static void main(String[] args) {
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.menu();
    }

    public void menu() {
        System.out.println("Welcome to my ArrayApp.");
        MethodsOfSorts methodsOfSorts = new MethodsOfSorts();
        methodsOfSorts.intArray(10, 1000, 1);
        System.out.println("We created random array: " + Arrays.toString(methodsOfSorts.getIntArray()));
        System.out.println("We sorted the array by BUBBLE sort method, from low to higher numbers: \n"
                + Arrays.toString(methodsOfSorts.bubbleSortFromLowToHigher(methodsOfSorts.getIntArray())));
        System.out.println("We sorted the array by BUBBLE sort method, from higher to low numbers: \n"
                + Arrays.toString(methodsOfSorts.bubbleSortFromHigherToLow(methodsOfSorts.getIntArray())));
        System.out.println("We sorted the array by SELECTION sort method, from low to higher numbers: \n"
                + Arrays.toString(methodsOfSorts.selectionSortFromLowToHigher(methodsOfSorts.getIntArray())));
        System.out.println("We sorted the array by SELECTION sort method, from higher to low numbers: \n"
                + Arrays.toString(methodsOfSorts.selectionSortFromHigherToLow(methodsOfSorts.getIntArray())));

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.intTwoDimensionalArray(99, -99);
        System.out.println("We created random array[5][8]: ");
        for (int j = 0; j < twoDimensionalArray.getIntTwoDimensionalArray().length; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(twoDimensionalArray.getIntTwoDimensionalArray()[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("It's max element is: " + twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray());

        System.out.println("Statrt of the multiplikation table examples:");
        int[][] arr = twoDimensionalArray.getRandomUniqueResults(15, 3);
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k]);
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }


}

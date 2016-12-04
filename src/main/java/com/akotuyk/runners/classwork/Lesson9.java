package com.akotuyk.runners.classwork;

import java.util.Arrays;

/**
 * Created by Huly-Buly on 02.12.2016.
 */

public class Lesson9 {

    public static void main(String[] args) {
        System.out.println("Welcome to my ArrayApp.");
        Lesson9 lesson9 = new Lesson9();
        lesson9.start(10, 1000, 1);
    }

    public int[] start(int a, int b, int c) {
        int[] intArray = new int[a];
        int temp;

        for (int i = 0; i < a; i++) {
            intArray[i] = ((int) ((Math.random() * b) + c));
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length; j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println("Основная разница между ними,\t что массив может");
        System.out.println("Основная разница между ними,\b что массив может");
        System.out.println("Основная разница между ними,\n что массив может");
        System.out.println("Основная разница между ними,\r что массив может");
        System.out.println("Основная разница между ними,\' что массив может");
        System.out.println("Основная разница между ними,\" что массив может");
        System.out.println("Основная разница между ними,\\ что массив может");


        System.out.println();

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
        System.out.println();


        Arrays.sort(intArray);
        System.out.println("Sorted array" + Arrays.toString(intArray));

        return intArray;
    }
}

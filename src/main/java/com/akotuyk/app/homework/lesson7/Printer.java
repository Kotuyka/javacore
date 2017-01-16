package com.akotuyk.app.homework.lesson7;

/**
 * Created by Huly-Buly on 14.01.2017.
 */
public class Printer {

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void printArrayInColumn(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void printTwoDimensionalArray(int[][] a) {
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(a[j][k] + " ");
            }
            System.out.println();
        }
    }

    public void printArrayThroughGaps(int[][] a) {
        for (int j = 0; j < a.length; j++) {
            int x = j + 1;
            System.out.print("List " + x + ": ");
            for (int k = 0; k < 5; k++) {
                if (a[j][k] < 100) {
                    if (a[j][k] < 10) {
                        System.out.print("  " + a[j][k]);
                    } else {
                        System.out.print(" " + a[j][k]);
                    }
                } else {
                    System.out.print(a[j][k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printArrayThroughPrintF(int[][] a) {
        for (int j = 0; j < a.length; j++) {
            int x = j + 1;
            System.out.print("List " + x + ": ");
            for (int k = 0; k < 5; k++) {
                System.out.printf("%4d", a[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

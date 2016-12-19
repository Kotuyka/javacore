package com.akotuyk.app.homework.lesson9;

import com.akotuyk.runners.homework.MainRunnerForHomeTasks;

import java.util.Arrays;

public class ArrayPrint {

    public void menu() {
        System.out.println("You can choose the method of array sorts:\n" +
                "(1) bubble Sort From Low To Higher;\n" +
                "(2) bubble Sort From Higher ToLow;\n" +
                "(3) selection Sort From Low To Higher;\n" +
                "(4) selection Sort From Higher To Low;\n" +
                "(5) build random two dimensional array in radius [-99:99] and figure it max/min element;\n" +
                "(6) to build random examples elements from the multiplikation table;\n" +
                "(0) to exit;\n" +
                "(9) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
    }

    public void printMethod(int[] a, int b) {
        switch (b) {
            case 1:
                System.out.println("We sorted the array by BUBBLE sort method, from low to higher numbers: \n"
                        + Arrays.toString(a));
                break;
            case 2:
                System.out.println("We sorted the array by BUBBLE sort method, from higher to low numbers: \n"
                        + Arrays.toString(a));
                break;
            case 3:
                System.out.println("We sorted the array by SELECTION sort method, from low to higher numbers: \n"
                        + Arrays.toString(a));
                break;
            case 4:
                System.out.println("We sorted the array by SELECTION sort method, from higher to low numbers: \n"
                        + Arrays.toString(a));
                break;
            case 0:
                System.out.println("Bye!");
                break;
            case 9:
                MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                mainRunnerForHomeTasks.textMenu();
                break;
            default:
                System.out.println("Please, enter correct value. You entered the WRONG VALUE. Correct yourself...");
                break;


//            TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
//            twoDimensionalArray.intTwoDimensionalArray(99, -99);
//            System.out.println("We created random array[5][8]: ");
//            for (
//                    int j = 0; j < twoDimensionalArray.getIntTwoDimensionalArray().length; j++)
//
//            {
//                for (int k = 0; k < 5; k++) {
//                    System.out.print(twoDimensionalArray.getIntTwoDimensionalArray()[j][k]);
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }


        }
    }

    public void printRandomArray(int[] a) {
        System.out.println("We created random array: " + Arrays.toString(a));
    }

    public void printTwoDimensionalArray(int[][] arr, int a) {
        System.out.println("We created random array[5][8]: ");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
        System.out.print("It's max element is: " + a);
    }

    public void printUniqueResults() {
        System.out.println("The multiplikation table examples for this time:");
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arr = twoDimensionalArray.getRandomUniqueResults(15, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " * " + arr[i][1] + " = " + arr[i][2]);
        }
    }
}

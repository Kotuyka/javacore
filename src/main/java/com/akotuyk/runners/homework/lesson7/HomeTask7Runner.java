package com.akotuyk.runners.homework.lesson7;

import com.akotuyk.app.homework.lesson7.*;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.lesson5.HomeTask5Runner;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask7Runner {
    private static int sumForExH = 0;
    private static String menuChoice;
    private int[] intArray;
    private int[][] intTwoDimensionalArray;

    public static void main(String[] args) {
        System.out.println("Welcome to my ArrayApp. You can choose the number of action:");
        HomeTask7Runner homeTask7Runner = new HomeTask7Runner();
        homeTask7Runner.menu();
    }

    public void menu() {
        System.out.println("You can choose the number of action:\n" +
                "(a) even array from 2 to 20;\n" +
                "(b) odd array from 1 to 99;\n" +
                "(c) an array with 15 random numbers from 0 to 9;\n" +
                "(d) an array with 15 random numbers from 0 to 999;\n" +
                "(e) a two-dimensional array [8][5] with random numbers from 10 to 99.;\n" +
                "(f) go to Homework of Lesson 5;\n" +
                "(g) *** a two-dimensional array [8][5] with random numbers from 1 to 999;\n" +
                "(h) *** to enter a series of numbers to determine their amount;\n" +
                "(q) to exit;\n" +
                "(ex) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        chooseMenu();
    }

    public void chooseMenu() {
        scaner();
        switch (menuChoice.toLowerCase()) {
            case "a":
                ExerciseA exerciseA = new ExerciseA();
                System.out.println("You choose (a) even array from 2 to 20.\n" + "We need are calculating...");
                intArray = exerciseA.evenArray(exerciseA.countForEvenArray(20), 20);
                System.out.println("An even array in line is: ");
                printArray(intArray);
                System.out.println(" \n" + "An even array in column is: ");
                printArrayInColumn(intArray);
                System.out.println("We done with (a).");
                escFunction();
                break;
            case "b":
                ExerciseB exerciseB = new ExerciseB();
                System.out.println("You choose (b) odd array from 1 to 99.\n" + "We need are calculating...");
                intArray = exerciseB.oddArray(exerciseB.countForArray(99), 99);
                System.out.println("An odd array in line is: ");
                printArray(intArray);
                System.out.println(" \n" + "An odd line of array in reverse is: ");
                printArray(exerciseB.reverseArray(intArray));
                System.out.println(" \n" + "We done with (b).");
                escFunction();
                break;
            case "c":
                ExerciseC exerciseC = new ExerciseC();
                System.out.println("You choose (c) an array with 15 random numbers from 0 to 9.\n" +
                        "We need are calculating...");
                intArray = exerciseC.randomArray(15, 9, 0);
                System.out.println("An array with 15 random numbers from 0 to 9 is: ");
                System.out.println(Arrays.toString(intArray));
                System.out.println("The quantity of even numbers in this array is: " + exerciseC.countArray(intArray));
                System.out.println("We done with (c).");
                escFunction();
                break;
            case "d":
                ExerciseD exerciseD = new ExerciseD();
                System.out.println("You choose (d) an array with 15 random numbers from 0 to 999.\n" + "We need are calculating...");
                intArray = exerciseD.randomArray(15, 999, 0);
                System.out.println("An array with 15 random numbers from 0 to 999 is: ");
                System.out.println(Arrays.toString(intArray));
                System.out.println("The max number in this array is: " + exerciseD.maxIntArray(intArray));
                System.out.println("The min number in this array is: " + exerciseD.minIntArray(intArray));
                System.out.println("We done with (d).");
                escFunction();
                break;
            case "e":
                ExerciseE exerciseE = new ExerciseE();
                System.out.print("You choose (e) an two-dimensional array [8][5] with random numbers from 10 to 99.\n" +
                        "We need are calculating...\n");
                intTwoDimensionalArray = exerciseE.randomArray(8, 5, 89, 10);
                System.out.println("A two-dimensional array [8][5] with random numbers from 10 to 99 is: ");
                printTwoDimensionalArray(intTwoDimensionalArray);
                System.out.println("We done with (e).");
                escFunction();
            case "f":
                System.out.print("go to Homework of Lesson 5\n" + "See you!\n");
                HomeTask5Runner homeTask5Runner = new HomeTask5Runner();
                homeTask5Runner.menu();
                break;
            case "g":
                ExerciseG exerciseG = new ExerciseG();
                System.out.print("You choose (g) an two-dimensional array [8][5] with random numbers from 1 to 999.\n" +
                        "We need are calculating...\n");
                intTwoDimensionalArray = exerciseG.randomArray();
                System.out.println("A two-dimensional array [8][5] with random numbers from 1 to 999 is: \n" +
                        "There are at list two ways to print this array centering on the right edge.\n" +
                        "I invented the first one. I made it with gaps help:");
                printArrayThroughGaps(intTwoDimensionalArray);
                System.out.println("The second way is to use Printf method: ");
                printArrayThroughPrintF(intTwoDimensionalArray);
                System.out.println("We done with (g).");
                escFunction();
                break;
            case "h":
                System.out.println("You choose (h) to enter a series of numbers to determine their amount. \n" +
                        "The ammount of your numbers is: " + scanerForH());
                System.out.println("We done with (g).");
                sumForExH = 0;
                escFunction();
                break;
            case "q":
                escFunction();
                break;
            case "ex":
                MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                mainRunnerForHomeTasks.textMenu();
                break;
            default:
                System.out.println("Please, enter correct value. You entered the WRONG VALUE. Correct yourself...");
                menu();
                break;
        }
    }

    public String scaner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the letter: ");
        menuChoice = input.next();
        return menuChoice;
    }

    public int scanerForH() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a number you want to add: ");
        if (input.hasNextInt()) {
            int inputNumber = Integer.parseInt(input.next());
            sumForExH = sumForExH + inputNumber;
            scanerForH();
        } else {
            while (!input.next().equals("exit")) {
                System.out.println("So, you entered not a number.");
                scanerForH();
                break;
            }
        }
        return sumForExH;
    }

//     ВТОРОЙ ВАРИАНТ РЕШЕНИЯ. Первый мне больше нравится.
//     public int scanerForH() {                 
//         int sum = 0;
//         boolean toExitTheCircle = true;
//         do {
//             Scanner input = new Scanner(System.in);
//             System.out.println("Please, enter a number you want to add: ");
//             String answer = input.next();
//             try {
//                 if (answer.equals("exit")) {
//                 } else {
//                     int inputNumber = Integer.parseInt(answer);
//                     sum = sum + inputNumber;
//                 }
//             } catch (Exception e) {
//                 System.out.println("So, you entered not a number.");
//             }
//         } while (toExitTheCircle);
//         return sum;
//     }

    public void escFunction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to out? (yes/no)");
        switch (input.next().toLowerCase()) {
            case "no":
                menu();
                break;
            case "yes":
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Please, enter correct value. You entered the WRONG VALUE. Correct yourself...");
                escFunction();
                break;
        }
    }

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

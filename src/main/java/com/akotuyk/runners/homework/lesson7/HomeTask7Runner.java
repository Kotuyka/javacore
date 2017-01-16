package com.akotuyk.runners.homework.lesson7;

import com.akotuyk.app.homework.lesson7.*;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;
import com.akotuyk.runners.homework.lesson5.HomeTask5Runner;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask7Runner {

    private static int sumForExH = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to my ArrayApp. You can choose the number of action:");
        HomeTask7Runner homeTask7Runner = new HomeTask7Runner();
        homeTask7Runner.menuText();
    }

    public void menuText() {
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) even array from 2 to 20;\n" +
                "(SECOND) odd array from 1 to 99;\n" +
                "(THIRD) an array with 15 random numbers from 0 to 9;\n" +
                "(FOURTH) an array with 15 random numbers from 0 to 999;\n" +
                "(FIFTH) a two-dimensional array [8][5] with random numbers from 10 to 99.;\n" +
                "(SIXTH) go to Homework of Lesson 5;\n" +
                "(SEVENTH) *** a two-dimensional array [8][5] with random numbers from 1 to 999;\n" +
                "(EIGHTH) *** to enter a series of numbers to determine their amount;\n" +
                "(NINTH) to go back to the MAIN runner.\n" +
                "(ZERO) to exit;\n" +
                "What do you choose? : ");
        menu();
    }

    private void menu() {
        System.out.println("Please, write down the number (by letters) of the menu item you'd like to choose:");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            Printer printer = new Printer();
            switch (menuInput) {
                case FIRST:
                    ExerciseA exerciseA = new ExerciseA();
                    System.out.println("You choose (a) even array from 2 to 20.\n" + "We need are calculating...");
                    int[] intEvenArray = exerciseA.evenArray(exerciseA.countForEvenArray(20), 20);
                    System.out.println("An even array in line is: ");
                    printer.printArray(intEvenArray);
                    System.out.println(" \n" + "An even array in column is: ");
                    printer.printArrayInColumn(intEvenArray);
                    System.out.println("We done with (a).");
                    escFunction();
                    break;
                case SECOND:
                    ExerciseB exerciseB = new ExerciseB();
                    System.out.println("You choose (b) odd array from 1 to 99.\n" + "We need are calculating...");
                    int[] intOddArray = exerciseB.oddArray(exerciseB.countForArray(99), 99);
                    System.out.println("An odd array in line is: ");
                    printer.printArray(intOddArray);
                    System.out.println(" \n" + "An odd line of array in reverse is: ");
                    printer.printArray(exerciseB.reverseArray(intOddArray));
                    System.out.println(" \n" + "We done with (b).");
                    escFunction();
                    break;
                case THIRD:
                    ExerciseC exerciseC = new ExerciseC();
                    System.out.println("You choose (c) an array with 15 random numbers from 0 to 9.\n" +
                            "We need are calculating...");
                    int[] intRandomArrayC = exerciseC.randomArray(15, 9, 0);
                    System.out.println("An array with 15 random numbers from 0 to 9 is: ");
                    System.out.println(Arrays.toString(intRandomArrayC));
                    System.out.println("The quantity of even numbers in this array is: " + exerciseC.countArray(intRandomArrayC));
                    System.out.println("We done with (c).");
                    escFunction();
                    break;
                case FOURTH:
                    ExerciseD exerciseD = new ExerciseD();
                    System.out.println("You choose (d) an array with 15 random numbers from 0 to 999.\n" + "We need are calculating...");
                    int[] intRandomArrayD = exerciseD.randomArray(15, 999, 0);
                    System.out.println("An array with 15 random numbers from 0 to 999 is: ");
                    System.out.println(Arrays.toString(intRandomArrayD));
                    System.out.println("The max number in this array is: " + exerciseD.maxIntArray(intRandomArrayD));
                    System.out.println("The min number in this array is: " + exerciseD.minIntArray(intRandomArrayD));
                    System.out.println("We done with (d).");
                    escFunction();
                    break;
                case FIFTH:
                    ExerciseE exerciseE = new ExerciseE();
                    System.out.print("You choose (e) an two-dimensional array [8][5] with random numbers from 10 to 99.\n" +
                            "We need are calculating...\n");
                    int[][] intRandomTwoDimensionalArrayE = exerciseE.randomArray(8, 5, 89, 10);
                    System.out.println("A two-dimensional array [8][5] with random numbers from 10 to 99 is: ");
                    printer.printTwoDimensionalArray(intRandomTwoDimensionalArrayE);
                    System.out.println("We done with (e).");
                    escFunction();
                    break;
                case SIXTH:
                    System.out.print("go to Homework of Lesson 5\n" + "See you!\n");
                    HomeTask5Runner homeTask5Runner = new HomeTask5Runner();
                    homeTask5Runner.menuText();
                    break;
                case SEVENTH:
                    ExerciseG exerciseG = new ExerciseG();
                    System.out.print("You choose (g) an two-dimensional array [8][5] with random numbers from 1 to 999.\n" +
                            "We need are calculating...\n");
                    int[][] intRandomTwoDimensionalArrayG = exerciseG.randomArray();
                    System.out.println("A two-dimensional array [8][5] with random numbers from 1 to 999 is: \n" +
                            "There are at list two ways to print this array centering on the right edge.\n" +
                            "I invented the first one. I made it with gaps help:");
                    printer.printArrayThroughGaps(intRandomTwoDimensionalArrayG);
                    System.out.println("The second way is to use Printf method: ");
                    printer.printArrayThroughPrintF(intRandomTwoDimensionalArrayG);
                    System.out.println("We done with (g).");
                    escFunction();
                    break;
                case EIGHTH:
                    System.out.println("You choose (h) to enter a series of numbers to determine their amount.");
                    System.out.println("You can enter any quantity of numbers you want to add and enter 'exit' when you are done.");
                    System.out.println("The ammount of your numbers is: " + scanerForH());
                    System.out.println("We done with (h).");
                    sumForExH = 0;
                    escFunction();
                    break;
                case NINTH:
                    MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                    mainRunnerForHomeTasks.textMenu();
                    break;
                case ZERO:
                    escFunction();
                    break;
                default:
                    System.out.println("Please, enter correct value. You entered the WRONG VALUE. Correct yourself...");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("You made a wrong choice. Try again.");
            menu();
        }
    }

    private String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

    private int scanerForH() {
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

    public void escFunction() {
        System.out.println("Do you want to out? (yes/no)");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case NO:
                    menu();
                    break;
                case YES:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Please, enter correct value. You entered the WRONG VALUE. Correct yourself...");
                    escFunction();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
            escFunction();
        }
    }

}

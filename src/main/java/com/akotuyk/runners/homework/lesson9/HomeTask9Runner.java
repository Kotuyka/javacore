package com.akotuyk.runners.homework.lesson9;

import com.akotuyk.app.homework.lesson9.ArrayPrint;
import com.akotuyk.app.homework.lesson9.MethodsOfSorts;
import com.akotuyk.app.homework.lesson9.TwoDimensionalArray;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask9Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to my ArrayApp.");
        HomeTask9Runner homeTask9Runner = new HomeTask9Runner();
        homeTask9Runner.chooseMenu();
    }

    public void chooseMenu() {
        ArrayPrint arrayPrint = new ArrayPrint();
        MethodsOfSorts methodsOfSorts = new MethodsOfSorts();
        arrayPrint.menu();
        int number = scanerForMenu();
        switch (number) {
            case 1:
                methodsOfSorts.setRandomArray(10, 1000, 1);
                arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                arrayPrint.printMethod(methodsOfSorts.bubbleSortFromLowToHigher(methodsOfSorts.getIntArray()), number);
                escFunction();
                break;
            case 2:
                methodsOfSorts.setRandomArray(10, 1000, 1);
                arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                arrayPrint.printMethod(methodsOfSorts.bubbleSortFromHigherToLow(methodsOfSorts.getIntArray()), number);
                escFunction();
                break;
            case 3:
                methodsOfSorts.setRandomArray(10, 1000, 1);
                arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                arrayPrint.printMethod(methodsOfSorts.selectionSortFromLowToHigher(methodsOfSorts.getIntArray()), number);
                escFunction();
                break;
            case 4:
                methodsOfSorts.setRandomArray(10, 1000, 1);
                arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                arrayPrint.printMethod(methodsOfSorts.selectionSortFromHigherToLow(methodsOfSorts.getIntArray()), number);
                escFunction();
                break;
            case 5:
                TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
                twoDimensionalArray.setRandomTwoDimensionalArray(99, -99);
                arrayPrint.printTwoDimensionalArray(twoDimensionalArray.getIntTwoDimensionalArray(), twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(twoDimensionalArray.getIntTwoDimensionalArray()));
                escFunction();
                break;
            case 6:
                arrayPrint.printUniqueResults();
                escFunction();
                break;
            case 0:
                escFunction();
                break;
            case 9:
                MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                mainRunnerForHomeTasks.textMenu();
                break;
            default:
                System.out.println("Please, enter correct value. You entered the WRONG VALUE. Correct yourself...");
                chooseMenu();
                break;
        }
    }

    public int scanerForMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int number = 0;
        try {
            number = input.nextInt();
        } catch (InputMismatchException ex) {
        }
        return number;
    }

    public void escFunction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to out? (yes/no)");
        switch (input.next().toLowerCase()) {
            case "no":
                chooseMenu();
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
}

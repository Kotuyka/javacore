package com.akotuyk.runners.homework.lesson9;

import com.akotuyk.app.homework.lesson9.ArrayPrint;
import com.akotuyk.app.homework.lesson9.MethodsOfSorts;
import com.akotuyk.app.homework.lesson9.TwoDimensionalArray;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.util.Scanner;

public class HomeTask9Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to my ArrayApp.");
        HomeTask9Runner homeTask9Runner = new HomeTask9Runner();
        homeTask9Runner.menu();
    }

    public void menu() {
        ArrayPrint arrayPrint = new ArrayPrint();
        MethodsOfSorts methodsOfSorts = new MethodsOfSorts();
        arrayPrint.menuText();
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case FIRST:
                    methodsOfSorts.setRandomArray(10, 1000, 1);
                    arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                    arrayPrint.printMethod(methodsOfSorts.bubbleSortFromLowToHigher(methodsOfSorts.getIntArray()), String.valueOf(menuInput));
                    escFunction();
                    break;
                case SECOND:
                    methodsOfSorts.setRandomArray(10, 1000, 1);
                    arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                    arrayPrint.printMethod(methodsOfSorts.bubbleSortFromHigherToLow(methodsOfSorts.getIntArray()), String.valueOf(menuInput));
                    escFunction();
                    break;
                case THIRD:
                    methodsOfSorts.setRandomArray(10, 1000, 1);
                    arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                    arrayPrint.printMethod(methodsOfSorts.selectionSortFromLowToHigher(methodsOfSorts.getIntArray()), String.valueOf(menuInput));
                    escFunction();
                    break;
                case FOURTH:
                    methodsOfSorts.setRandomArray(10, 1000, 1);
                    arrayPrint.printRandomArray(methodsOfSorts.getIntArray());
                    arrayPrint.printMethod(methodsOfSorts.selectionSortFromHigherToLow(methodsOfSorts.getIntArray()), String.valueOf(menuInput));
                    escFunction();
                    break;
                case FIFTH:
                    TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
                    twoDimensionalArray.setRandomTwoDimensionalArray(99, -99);
                    arrayPrint.printTwoDimensionalArray(twoDimensionalArray.getIntTwoDimensionalArray(), twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(twoDimensionalArray.getIntTwoDimensionalArray()));
                    escFunction();
                    break;
                case SIXTH:
                    arrayPrint.printUniqueResults();
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
            System.out.println("Please, enter correct value. You entered the WRONG VALUE. Try again.");
            menu();
        }
    }

    private String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
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

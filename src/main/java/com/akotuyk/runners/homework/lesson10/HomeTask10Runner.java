package com.akotuyk.runners.homework.lesson10;

import com.akotuyk.app.homework.lesson10.MethodsToCheckForPolindrom;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask10Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to my app for testing if there is a palindrome in input.");
        HomeTask10Runner homeTask10Runner = new HomeTask10Runner();
        homeTask10Runner.menu();
    }

    public void menu() {
        System.out.println("You can choose the method of testing if there is a palindrome in input:\n" +
                "(1) I'll reverse your input and compare those strings;\n" +
                "(2) I'll divide your input into two part and compare those with each other;\n" +
                "(3) I'll fetch your String input into ARRAY and compare elements with both sides;\n" +
                "(4) I'll fetch your String input into CHAR and compare elements with both sides;\n" +
                "(0) to exit;\n" +
                "(9) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        chooseMenu();
    }

    public void chooseMenu() {
        MethodsToCheckForPolindrom methodsToCheckForPolindrom = new MethodsToCheckForPolindrom();
        int number = scanerForMenu();
        ;
        switch (number) {
            case 1:
                if (methodsToCheckForPolindrom.reverseStringMethod(scannerForStringInput())) {
                    System.out.println("The string you inserted is palindrome.");
                } else {
                    System.out.println("The string you inserted is NOT a palindrome.");
                }
                escFunction();
                break;
            case 2:
                if (methodsToCheckForPolindrom.dividedStringMethod(scannerForStringInput())) {
                    System.out.println("The string you inserted is palindrome.");
                } else {
                    System.out.println("The string you inserted is NOT a palindrome.");
                }
                escFunction();
                break;
            case 3:
                if (methodsToCheckForPolindrom.strToArrayMethod(scannerForStringInput())) {
                    System.out.println("The string you inserted is palindrome.");
                } else {
                    System.out.println("The string you inserted is NOT a palindrome.");
                }
                escFunction();
                break;
            case 4:
                if (methodsToCheckForPolindrom.strToCharMethod(scannerForStringInput())) {
                    System.out.println("The string you inserted is palindrome.");
                } else {
                    System.out.println("The string you inserted is NOT a palindrome.");
                }
                escFunction();
                break;
            case 7:
                System.out.println("Bye!");
                break;
            case 9:
                MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                mainRunnerForHomeTasks.textMenu();
                break;
            default:
                System.out.println("You entered the WRONG number. Correct yourself...");
                chooseMenu();
                break;
        }

    }

    public String scannerForStringInput() {
        System.out.println("Please fill the string: ");
        Scanner input = new Scanner(System.in);
        String polindrom = input.next().replaceAll("[^A-Za-z1-9]+", "");
        return polindrom;
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
        System.out.println("Do you want to out? (yes/no)");
        Scanner input = new Scanner(System.in);
        switch (input.next()) {
            case "no":
                menu();
                break;
            case "yes":
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                escFunction();
                break;
        }

    }


}

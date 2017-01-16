package com.akotuyk.runners.homework.lesson10;

import com.akotuyk.app.homework.lesson10.MethodsToCheckForPolindrom;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.util.Scanner;

public class HomeTask10Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to my app for testing if there is a palindrome in input.");
        HomeTask10Runner homeTask10Runner = new HomeTask10Runner();
        homeTask10Runner.menuText();
    }

    public void menuText() {
        System.out.println("You can choose the method of testing if there is a palindrome in input:\n" +
                "(FIRST) I'll reverse your input and compare those strings;\n" +
                "(SECOND) I'll divide your input into two part and compare those with each other;\n" +
                "(THIRD) I'll fetch your String input into ARRAY and compare elements with both sides;\n" +
                "(FOURTH) I'll fetch your String input into CHAR and compare elements with both sides;\n" +
                "(ZERO) to exit;\n" +
                "(NINTH) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        menu();
    }

    private void menu() {
        try {
            MethodsToCheckForPolindrom methodsToCheckForPolindrom = new MethodsToCheckForPolindrom();
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case FIRST:
                    if (methodsToCheckForPolindrom.reverseStringMethod(scannerForStringInput())) {
                        System.out.println("The string you inserted is palindrome.");
                    } else {
                        System.out.println("The string you inserted is NOT a palindrome.");
                    }
                    escFunction();
                    break;
                case SECOND:
                    if (methodsToCheckForPolindrom.dividedStringMethod(scannerForStringInput())) {
                        System.out.println("The string you inserted is palindrome.");
                    } else {
                        System.out.println("The string you inserted is NOT a palindrome.");
                    }
                    escFunction();
                    break;
                case THIRD:
                    if (methodsToCheckForPolindrom.strToArrayMethod(scannerForStringInput())) {
                        System.out.println("The string you inserted is palindrome.");
                    } else {
                        System.out.println("The string you inserted is NOT a palindrome.");
                    }
                    escFunction();
                    break;
                case FOURTH:
                    if (methodsToCheckForPolindrom.strToCharMethod(scannerForStringInput())) {
                        System.out.println("The string you inserted is palindrome.");
                    } else {
                        System.out.println("The string you inserted is NOT a palindrome.");
                    }
                    escFunction();
                    break;
                case NINTH:
                    MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                    mainRunnerForHomeTasks.textMenu();
                    break;
                case ZERO:
                    System.out.println("Bye!");
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

    private String scannerForStringInput() {
        System.out.println("Please fill the string: ");
        Scanner input = new Scanner(System.in);
        String polindrom = input.next().replaceAll("[^A-Za-z1-9]+", "");
        return polindrom;
    }

    private void escFunction() {
        System.out.println("Do you want to out? (yes/no)");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case NO:
                    menuText();
                    break;
                case YES:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                    escFunction();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
            escFunction();
        }
    }

}

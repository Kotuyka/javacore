package com.akotuyk.runners.homework.lesson3;

import com.akotuyk.app.homework.lesson3.PrimitiveConvertor;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.util.Scanner;

public class HomeTask3Runner {

    private int intVariable = 12522;
    private float floatVariable = 36.4028f;
    private char charVariable = 'd';

    public static void main(String[] args) {
        HomeTask3Runner homeTask3Runner = new HomeTask3Runner();
        homeTask3Runner.menuText();
    }

    public void menuText() {
        System.out.println("Welcome to my app. Here you can choose what primitives you want to convert.");
        System.out.println("Enter the corresponding number:");
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) If you want to convert float to char;\n" +
                "(SECOND) If you want to convert int to char;\n" +
                "(THIRD) If you want to convert char to int;\n" +
                "(ZERO) If you want to exit;\n" +
                "(NINTH) If you want to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        menu();
    }

    private void menu() {
        System.out.println("Please, write down the number (by letters) of the menu item you'd like to choose:");
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("Input float value is " + floatVariable +
                            ". Output char value is " + primitiveConvertor.floatToChar(floatVariable));
                    escFunction();
                    break;
                case SECOND:
                    System.out.println("Input int value is " + intVariable +
                            ". Output char value is " + primitiveConvertor.intToChar(intVariable));
                    escFunction();
                    break;
                case THIRD:
                    System.out.println("Input char value is " + charVariable +
                            ". Output int value is " + primitiveConvertor.charToInt(charVariable));
                    escFunction();
                    break;
                case ZERO:
                    escFunction();
                    System.out.println("See you!");
                    break;
                case NINTH:
                    MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                    mainRunnerForHomeTasks.textMenu();
                    break;
                default:
                    System.out.println("You entered the WRONG TEXT. Try again.");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("You entered the WRONG TEXT. Try again.");
            menu();
        }
    }

    private String scanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

    private void escFunction() {
        System.out.println("Do you want to out? (yes/no)");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanner());
            switch (menuInput) {
                case NO:
                    menuText();
                    break;
                case YES:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Is it hard to enter a yes/no? You entered the WRONG TEXT. Correct yourself...");
                    escFunction();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Is it hard to enter a yes/no? You entered the WRONG TEXT. Correct yourself...");
            escFunction();
        }
    }
}

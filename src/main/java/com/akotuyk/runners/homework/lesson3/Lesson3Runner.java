package com.akotuyk.runners.homework.lesson3;

import com.akotuyk.app.homework.lesson3.PrimitiveConvertor;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;

import java.util.Scanner;

public class Lesson3Runner {
    private static int menuInput;
    static int intVariable = 12522;
    static float floatVariable = 36.4028f;
    static char charVariable = 'd';

    public static void main(String[] args) {
        Lesson3Runner lesson3Runner = new Lesson3Runner();
        lesson3Runner.scanner();
        lesson3Runner.menu();
    }

    public void menu() {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        System.out.println("Welcome to my app. Here you can choose what primitives you want to convert.");
        System.out.println("Enter the corresponding number:");
        System.out.println("You can choose the number of action:\n" +
                "(1) If you want to convert float to char;\n" +
                "(2) If you want to convert int to char;\n" +
                "(3) If you want to convert char to int;\n" +
                "(0) If you want to exit;\n" +
                "(9) If you want to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        switch (menuInput) {
            case 1:
                System.out.println("Input float value is " + floatVariable +
                        ". Output char value is " + primitiveConvertor.floatToChar(floatVariable));
                break;
            case 2:
                System.out.println("Input int value is " + intVariable +
                        ". Output char value is " + primitiveConvertor.intToChar(intVariable));
                break;
            case 3:
                System.out.println("Input char value is " + charVariable +
                        ". Output int value is " + primitiveConvertor.charToInt(charVariable));
                break;
            case 0:
                System.out.println("See you!");
                break;
            case 9:
                MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                mainRunnerForHomeTasks.textMenu();
                break;
            default:
                System.out.println("You made a wrong choice. Try again.");
                menu();
                break;
        }
    }

    public void scanner() {
        Scanner input = new Scanner(System.in);
        menuInput = input.nextInt();
    }
}

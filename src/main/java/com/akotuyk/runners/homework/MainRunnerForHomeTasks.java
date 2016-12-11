package com.akotuyk.runners.homework;

import com.akotuyk.runners.homework.lesson10.HomeTask10Runner;
import com.akotuyk.runners.homework.lesson3.HomeTask3Runner;
import com.akotuyk.runners.homework.lesson5.HomeTask5Runner;
import com.akotuyk.runners.homework.lesson7.HomeTask7Runner;
import com.akotuyk.runners.homework.lesson9.HomeTask9Runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRunnerForHomeTasks {
    private static int menuInput;

    public static void main(String[] args) {
        MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
        mainRunnerForHomeTasks.textMenu();
    }

    public void textMenu() {
        System.out.println("This is the main runner, from where you can get to all the homework runners.");
        System.out.println("You need to choose the number of theme and corresponding runner will start.");
        System.out.println("So, here are the themes:");
        System.out.println("You can choose the number of action:\n" +
                "(1) convert primitives (Lesson 3);\n" +
                "(2) calculation with circles and triangles (Lesson 5);\n" +
                "(3) creation and fillings arrays (Lesson 7);\n" +
                "(4) methods of arrays sorts (Lesson 9);\n" +
                "(5) figure out if the string is polindrom (Lesson 10);\n" +
                "(0) exit.\n" +
                "What do you choose? : ");
        scanner();
        menu();
    }

    public void menu() {
        try {
            switch (menuInput) {
                case 1:
                    HomeTask3Runner HomeTask3Runner = new HomeTask3Runner();
                    HomeTask3Runner.menu();
                    break;
                case 2:
                    HomeTask5Runner homeTask5Runner = new HomeTask5Runner();
                    homeTask5Runner.menu();
                    break;
                case 3:
                    HomeTask7Runner homeTask7Runner = new HomeTask7Runner();
                    homeTask7Runner.menu();
                    break;
                case 4:
                    HomeTask9Runner homeTask9Runner = new HomeTask9Runner();
                    homeTask9Runner.chooseMenu();
                    break;
                case 5:
                    HomeTask10Runner homeTask10Runner = new HomeTask10Runner();
                    homeTask10Runner.menu();
                    break;
                case 0:
                    System.out.println("Adieu!");
                    break;
                default:
                    System.out.println("You made a wrong choice. Try again.");
                    menu();
                    break;
            }
        } catch (InputMismatchException ex) {
            System.out.println("You entered the WRONG value. Please, try again.");
            menu();
        }

    }

    public void scanner() {
        Scanner input = new Scanner(System.in);
        menuInput = input.nextInt();
    }
}

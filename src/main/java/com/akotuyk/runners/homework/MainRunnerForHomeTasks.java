package com.akotuyk.runners.homework;

import com.akotuyk.runners.homework.lesson10.HomeTaskRunner;
import com.akotuyk.runners.homework.lesson3.Lesson3Runner;
import com.akotuyk.runners.homework.lesson5.Main;
import com.akotuyk.runners.homework.lesson7.LoopsArraysRunner;
import com.akotuyk.runners.homework.lesson9.ArrayPrint;

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
        switch (menuInput) {
            case 1:
                Lesson3Runner Lesson3Runner = new Lesson3Runner();
                Lesson3Runner.menu();
                break;
            case 2:
                Main main = new Main();
                main.menu();
                break;
            case 3:
                LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
                loopsArraysRunner.menu();
                break;
            case 4:
                ArrayPrint arrayPrint = new ArrayPrint();
                arrayPrint.menu();
                break;
            case 5:
                HomeTaskRunner homeTaskRunner = new HomeTaskRunner();
                homeTaskRunner.menu();
                break;
            case 0:
                System.out.println("Adieu!");
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

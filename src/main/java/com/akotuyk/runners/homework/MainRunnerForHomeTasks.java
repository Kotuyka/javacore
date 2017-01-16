package com.akotuyk.runners.homework;

import com.akotuyk.runners.homework.lesson10.HomeTask10Runner;
import com.akotuyk.runners.homework.lesson11.HomeTask11Runner;
import com.akotuyk.runners.homework.lesson12.HomeTask12Runner;
import com.akotuyk.runners.homework.lesson3.HomeTask3Runner;
import com.akotuyk.runners.homework.lesson5.HomeTask5Runner;
import com.akotuyk.runners.homework.lesson7.HomeTask7Runner;
import com.akotuyk.runners.homework.lesson9.HomeTask9Runner;

import java.io.IOException;
import java.util.Scanner;

public class MainRunnerForHomeTasks {

    public static void main(String[] args) {
        MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
        mainRunnerForHomeTasks.textMenu();
    }

    public void textMenu() {
        System.out.println("This is the main runner, from where you can get to all the homework runners.");
        System.out.println("You need to choose the number of theme and corresponding runner will start.");
        System.out.println("So, here are the themes:");
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) convert primitives (Lesson 3);\n" +
                "(SECOND) calculation with circles and triangles (Lesson 5);\n" +
                "(THIRD) creation and fillings arrays (Lesson 7);\n" +
                "(FOURTH) methods of arrays sorts (Lesson 9);\n" +
                "(FIFTH) figure out if the string is polindrom (Lesson 10);\n" +
                "(SIXTH) split array methods and decoding Enigma and Caesar scripts (Lesson 11);\n" +
                "(SEVENTH) read and write data to files, properties file creation (Lesson 12);\n" +
                "(ZERO) exit.\n" +
                "What do you choose? : ");
        menu();
    }

    public void menu() {
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanner());
            switch (menuInput) {
                case FIRST:
                    HomeTask3Runner HomeTask3Runner = new HomeTask3Runner();
                    HomeTask3Runner.menuText();
                    break;
                case SECOND:
                    HomeTask5Runner homeTask5Runner = new HomeTask5Runner();
                    homeTask5Runner.menuText();
                    break;
                case THIRD:
                    HomeTask7Runner homeTask7Runner = new HomeTask7Runner();
                    homeTask7Runner.menuText();
                    break;
                case FOURTH:
                    HomeTask9Runner homeTask9Runner = new HomeTask9Runner();
                    homeTask9Runner.menu();
                    break;
                case FIFTH:
                    HomeTask10Runner homeTask10Runner = new HomeTask10Runner();
                    homeTask10Runner.menuText();
                    break;
                case SIXTH:
                    HomeTask11Runner homeTask11Runner = new HomeTask11Runner();
                    homeTask11Runner.menuText();
                    break;
                case SEVENTH:
                    HomeTask12Runner homeTask12Runner = new HomeTask12Runner();
                    homeTask12Runner.menuText();
                    break;
                case ZERO:
                    System.out.println("Adieu!");
                    break;
                default:
                    System.out.println("You made a wrong choice. Try again.");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("You entered the WRONG value. Please, try again.");
            menu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String scanner() {
        System.out.println("Please, write down the number (by letters) of the menu item you'd like to choose:");
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }
}

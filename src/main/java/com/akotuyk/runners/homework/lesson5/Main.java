package com.akotuyk.runners.homework.lesson5;

import com.akotuyk.app.homework.lesson5.*;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final double PI = 3.14d;

    public static void main(String[] args) {
        System.out.println("Welcome to my app. You can choose the number of action:");
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        System.out.println("You can choose the number of action:\n" +
                "(1) to calculate circle area;\n" +
                "(2) to figure if the number is even or odd;\n" +
                "(3) to figure if you can to build a right-angled triangle;\n" +
                "(4) to figure what area is bigger;\n" +
                "(5) to figure what number is bigger;\n" +
                "(0) to exit;\n" +
                "(9) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        choose();
    }

    public int scaner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int number = 0;
        try {
        number = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You entered the NOT A NUMBER. Correct yourself...");
            scaner();
        }
        return number;
    }

    public void choose() {
        try {
            switch (scaner()) {
                case 1:
                    CircleArea circleArea = new CircleArea();
                    System.out.println("You choose to calculate circle are.\n" +
                            "We need to know the number of circle radius.");
                    System.out.println("Circle area is: " + circleArea.calculate(PI, scaner()));
                    escFunction();
                    break;
                case 2:
                    EvenOrOdd evenOrOdd = new EvenOrOdd();
                    System.out.println("You choose to figure if the number is even or odd.");
                    while (evenOrOdd.isEven(scaner()) == true) {
                        System.out.println("Number is even");
                        escFunction();
                        break;
                    }
                    System.out.println("Number is odd");
                    escFunction();
                    break;
                case 3:
                    RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
                    System.out.println("You choose to figure if you can to build a right-angled triangle.\n" +
                            "We need to know the sides of the triangle.");
                    if (rightAngledTriangle.calculator(scaner(), scaner(), scaner()) == true) {
                        System.out.println("You can build a right-angled triangle with such sides.");
                        escFunction();
                    } else {
                        System.out.println("You can't build a right-angled triangle with such sides.");
                        escFunction();
                    }
                    break;
                case 4:
                    MaxArea maxArea = new MaxArea();
                    System.out.println("You choose to figure what area is bigger.\n" +
                            "We need to know radii of circles.");
                    if (maxArea.compareAreas(maxArea.setArea1(PI, scaner()), maxArea.setArea2(PI, scaner()))) {
                        System.out.println("Circle area of the first number is bigger.");
                        escFunction();
                    } else {
                        System.out.println("Circle area of the second number is bigger.");
                        escFunction();
                    }
                    break;
                case 5:
                    MaxNumber maxNumber = new MaxNumber();
                    System.out.println("You choose to figure what number is bigger.\n" +
                            "We need to know numbers you want to compare.");
                    if (maxNumber.compareNumbers(scaner(), scaner())) {
                        System.out.println("The first number is bigger.");
                        escFunction();
                    } else {
                        System.out.println("The second number is bigger.");
                        escFunction();
                    }
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                case 9:
                    MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                    mainRunnerForHomeTasks.textMenu();
                    break;
                default:
                    System.out.println("You entered the WRONG number. Correct yourself...");
                    menu();
                    break;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Is it hard to enter a number? You entered the WRONG VALUE. Correct yourself...");
            menu();
        }
    }

    public void escFunction() {
        System.out.println("Do you want to out? (yes/no)");
            Scanner input = new Scanner(System.in);
            switch (input.next()){
                case "no":
                    menu();
                    break;
                case "yes":
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                    escFunction();
            }

    }
}

package com.akotuyk.runners.homework.lesson5;

import com.akotuyk.app.homework.lesson5.*;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask5Runner {

    public static final double PI = 3.14d;

    public static void main(String[] args) {
        System.out.println("Welcome to my app. You can choose the number of action:");
        HomeTask5Runner homeTask5Runner = new HomeTask5Runner();
        homeTask5Runner.menuText();
    }

    public void menuText() {
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) to calculate circle area;\n" +
                "(SECOND) to figure if the number is even or odd;\n" +
                "(THIRD) to figure if you can to build a right-angled triangle;\n" +
                "(FOURTH) to figure what area is bigger;\n" +
                "(FIFTH) to figure what number is bigger;\n" +
                "(ZERO) to exit;\n" +
                "(NINTH) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        menu();
    }

    private void menu() {
        System.out.println("Please, write down the number (by letters) of the menu item you'd like to choose:");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case FIRST:
                    CircleArea circleArea = new CircleArea();
                    System.out.println("You choose to calculate circle are.\n" +
                            "We need to know the number of circle radius.");
                    System.out.println("Circle area is: " + circleArea.calculate(PI, NumberScanner()));
                    escFunction();
                    break;
                case SECOND:
                    EvenOrOdd evenOrOdd = new EvenOrOdd();
                    System.out.println("You choose to figure if the number is even or odd.");
                    if (evenOrOdd.isEven(NumberScanner())) {
                        System.out.println("Number is even");
                        escFunction();
                        break;
                    }
                    System.out.println("Number is odd");
                    escFunction();
                    break;
                case THIRD:
                    RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
                    System.out.println("You choose to figure if you can to build a right-angled triangle.\n" +
                            "We need to know the sides of the triangle.");
                    if (rightAngledTriangle.calculator(NumberScanner(), NumberScanner(), NumberScanner())) {
                        System.out.println("You can build a right-angled triangle with such sides.");
                        escFunction();
                        break;
                    }
                    System.out.println("You can't build a right-angled triangle with such sides.");
                    escFunction();
                    break;
                case FOURTH:
                    MaxArea maxArea = new MaxArea();
                    System.out.println("You choose to figure what area is bigger.\n" +
                            "We need to know radii of circles.");
                    if (maxArea.compareAreas(maxArea.setArea1(PI, NumberScanner()), maxArea.setArea2(PI, NumberScanner()))) {
                        System.out.println("Circle area of the first number is bigger.");
                        escFunction();
                        break;
                    }
                    System.out.println("Circle area of the second number is bigger.");
                    escFunction();
                    break;
                case FIFTH:
                    MaxNumber maxNumber = new MaxNumber();
                    System.out.println("You choose to figure what number is bigger.\n" +
                            "We need to know numbers you want to compare.");
                    if (maxNumber.compareNumbers(NumberScanner(), NumberScanner())) {
                        System.out.println("The first number is bigger.");
                        escFunction();
                        break;
                    }
                    System.out.println("The second number is bigger.");
                    escFunction();
                    break;
                case ZERO:
                    System.out.println("Bye!");
                    break;
                case NINTH:
                    MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                    mainRunnerForHomeTasks.textMenu();
                    break;
                default:
                    System.out.println("You entered the WRONG VALUE. Correct yourself...");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("You entered the WRONG VALUE. Try again.");
            menu();
        }
    }

    private int NumberScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int number = 0;
        try {
            number = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You entered the NOT A NUMBER. Correct yourself...");
            NumberScanner();
        }
        return number;
    }

    private String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

    private void escFunction() {
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

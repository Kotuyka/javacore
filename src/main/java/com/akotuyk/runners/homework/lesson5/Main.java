package com.akotuyk.runners.homework.lesson5;

import com.akotuyk.app.homework.lesson5.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final double PI = 3.14d;

    public static void main(String[] args) {
        System.out.println("Welcome to my app. You can choose the number of action:");
        menu();}

    public static void menu() {
        //System.out.println(getRadius());
        System.out.println("You can choose the number of action:\n"+
                "(1) to calculate circle area;\n"+
                "(2) to figure if the number is even or odd;\n"+
                "(3) to figure if you can to build a right-angled triangle;\n"+
                "(4) to figure what area is bigger;\n"+
                "(5) to figure what number is bigger;\n"+
                "(0) to exit.\n"+
                "What do you choose? : ");
        choose();}

    public static double scaner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        double number = input.nextInt();
        return number;}

    public static void choose() {
        try {
            double menuInput = scaner();
            if (menuInput == 1) {
                System.out.println("You choose to calculate circle are.\n" +
                        "We need to know the number of circle radius.");
                System.out.println("Circle area is: " + CircleArea.calculate(PI, scaner()));
                Main.escFunction();}

            if (menuInput == 2) {
                System.out.println("You choose to figure if the number is even or odd.");
                if (EvenOrOdd.isEven(scaner()) == true) {
                    System.out.println("Number is even");
                    Main.escFunction();
                } else {
                    System.out.println("Number is odd");
                    Main.escFunction();}}

            if (menuInput == 3) {
                System.out.println("You choose to figure if you can to build a right-angled triangle.\n" +
                        "We need to know the sides of the triangle.");
                if (RightAngledTriangle.calculator(scaner(), scaner(), scaner()) == true) {
                    System.out.println("You can build a right-angled triangle with such sides.");
                    Main.escFunction();
                } else {
                    System.out.println("You can't build a right-angled triangle with such sides.");
                    Main.escFunction();}}

            if (menuInput == 4) {
                System.out.println("You choose to figure what area is bigger.\n" +
                        "We need to know radii of circles.");
                if (MaxArea.compareAreas(MaxArea.setArea1(PI, scaner()), MaxArea.setArea2(PI, scaner()))) {
                    System.out.println("Circle area of the first number is bigger.");
                    Main.escFunction();
                } else {
                    System.out.println("Circle area of the second number is bigger.");
                    Main.escFunction();}}

            if (menuInput == 5) {
                System.out.println("You choose to figure what number is bigger.\n" +
                        "We need to know numbers you want to compare.");
                if (MaxNumber.compareNumbers(scaner(), scaner())) {
                    System.out.println("The first number is bigger.");
                    Main.escFunction();
                } else {
                    System.out.println("The second number is bigger.");
                    Main.escFunction();}}

            if (menuInput == 0) {
                System.out.println("Bye!");
            } else{System.out.println("Is it hard to enter a number? You entered the WRONG VALUE. Correct yourself...");
                menu();}

        } catch (InputMismatchException ex) {
            System.out.println("Is it hard to enter a number? You entered the WRONG VALUE. Correct yourself...");
            menu();}}

    public static void equal(){
        System.out.println("They are equals");
        escFunction();}

    public static void escFunction(){
        System.out.println("Do you want to out? (yes/no)");
        try {
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            if (answer.equals("no")){
                menu();}
            if (answer.equals("yes")){            // НЕ ПОНИМАЮ ПОЧЕМУ ТУТ ОШИБКА. Вместо выхода, оно переходит на елс, и замыкает цикл. Сначала этого небыло, а потом появилось и я не понимаю почему.
                System.out.println("Bye!");
            } else {System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                escFunction();}
        } catch (InputMismatchException ex) {
            System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
            escFunction();}}
}

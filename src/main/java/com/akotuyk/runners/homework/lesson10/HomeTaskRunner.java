package com.akotuyk.runners.homework.lesson10;

import com.akotuyk.app.homework.lesson10.MethodsToCheckForPolindrom;

import java.util.Scanner;

public class HomeTaskRunner {

    private static String polindrom;

    public static void main(String[] args) {
        HomeTaskRunner homeTaskRunner = new HomeTaskRunner();
        homeTaskRunner.menu();
    }

    public void menu() {
        System.out.println("Please fill the string: ");
        HomeTaskRunner homeTaskRunner = new HomeTaskRunner();
        homeTaskRunner.scanner();
        MethodsToCheckForPolindrom methodsToCheckForPolindrom = new MethodsToCheckForPolindrom();
        System.out.println("Is the string you inserted polindrom? - " + methodsToCheckForPolindrom.reverseStringMethod(polindrom));
        System.out.println("Is the string you inserted polindrom? - " + methodsToCheckForPolindrom.dividedStringMethod(polindrom));
        System.out.println("Is the string you inserted polindrom? - " + methodsToCheckForPolindrom.dividedArrayMethod(polindrom));
    }

    public String scanner() {
        Scanner input = new Scanner(System.in);
        polindrom = input.next().replaceAll("[^A-Za-z1-9]+", "");
        return polindrom;
    }

















}

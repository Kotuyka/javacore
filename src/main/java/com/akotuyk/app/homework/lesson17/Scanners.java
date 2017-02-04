package com.akotuyk.app.homework.lesson17;

import java.util.Scanner;

/**
 * Created by Kotuyk A on 26.01.2017.
 */

public class Scanners {

    public String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

    public String stringScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next();
        return menuInput;
    }
}

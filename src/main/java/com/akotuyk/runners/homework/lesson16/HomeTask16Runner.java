package com.akotuyk.runners.homework.lesson16;

import com.akotuyk.app.homework.lesson16.FamousPeoples;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 16.01.2017.
 */

public class HomeTask16Runner {

    public static void main(String[] arg) throws IOException {
        System.out.println("Welcome to my 'Guess who' game!");
        HomeTask16Runner homeTask16Runner = new HomeTask16Runner();
        homeTask16Runner.menuText();
    }

    public void menuText() throws IOException {
        System.out.println("I'll show you famous people's names \n" +
                "and you need to guess if they are still alive and what their age now. \n" +
                "You need to guess three famous people's to win. Good luck!");
        runner();
    }

    public void runner() {
        int winCounter = 0;
        int uniqueCounter = 0;
        do {
            FamousPeoples randomFamousPeoples = FamousPeoples.getRandom();
            if (!(uniqueCounter == randomFamousPeoples.hashCode())) {
                System.out.println();  // easier to read process with it. Thats all.
                System.out.println("What is the " + randomFamousPeoples.getFullName() + " age?");
                if (answerDOB() == (2017 - randomFamousPeoples.getDOB())) {
                    System.out.println("You are correct!");
                    System.out.println("Is " + randomFamousPeoples.getFullName() + " still alive?");
                    if (answerIsAlive().equals(randomFamousPeoples.getIsAlive())) {
                        System.out.println("You are right");
                        System.out.println(randomFamousPeoples.toString());
                        winCounter++;
                        uniqueCounter = randomFamousPeoples.hashCode();
                    } else {
                        System.out.println("You wrong! Try again.");
                        uniqueCounter = randomFamousPeoples.hashCode();
                    }
                } else {
                    System.out.println("You wrong! Try again.");
                    uniqueCounter = randomFamousPeoples.hashCode();
                }
            }
        } while (winCounter < 3);
        System.out.println("YOU WIN!");
    }

    private int answerDOB() {
        Scanner input = new Scanner(System.in);
        int dob = input.nextInt();
        return dob;
    }

    private String answerIsAlive() {
        Scanner input = new Scanner(System.in);
        String isAlive = input.next().toLowerCase();
        return isAlive;
    }
}

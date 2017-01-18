package com.akotuyk.runners.homework.lesson17;

import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 16.01.2017.
 */

public class HomeTask17Runner {

    public static void main(String[] arg) throws IOException {
        System.out.println("Welcome to my Phone-book app");
        HomeTask17Runner homeTask17Runner = new HomeTask17Runner();
        homeTask17Runner.menuText();
    }

    public void menuText() throws IOException {
        System.out.println("Here what you can do:\n" +
                "(FIRST) You can look through the categories for the contact you are looking for\n" +
                "(SECOND) You can create new category for contacts\n" +
                "(SECOND) You can create new category for contacts ....\n");
//        Structure.createSetCollection();



    }

//    public void runner() throws IOException {
//        System.out.println("Here are the categories you have:");
//        System.out.println(Structure.getHSet());
//        System.out.println("Would you like to create new category? (yes/no)");
//        System.out.println("Or you'd like to look through some category? (look)");
//        MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
//        try {
//            switch (menuInput) {
//                case YES:
//                    System.out.println("Please, enter new category name:");
//                    Structure.setAddToSetCollection(MenuScanner());
//                    runner();
//                    break;
//                case LOOK:
//                    break;
//                case NO:
//                    escFunction();
//                    break;
//                default:
//                    System.out.println("You entered the WRONG value. Please, try again.");
//                    runner();
//                    break;
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("Please, enter correct value. You entered the WRONG VALUE. Try again.");
//            runner();
//        }
//    }

    private String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

    private void escFunction() throws IOException {
        System.out.println("Do you want to out? (yes/no)");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case NO:
                    menuText();
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

//    public void runner() {
//        int winCounter = 0;
//        int uniqueCounter = 0;
//        do {
//            FamousPeoples randomFamousPeoples = FamousPeoples.getRandom();
//            if (!(uniqueCounter == randomFamousPeoples.hashCode())) {
//                System.out.println();  // easier to read process with it. Thats all.
//                System.out.println("What is the " + randomFamousPeoples.getFullName() + " age?");
//                if (answerDOB() == (2017 - randomFamousPeoples.getDOB())) {
//                    System.out.println("You are correct!");
//                    System.out.println("Is " + randomFamousPeoples.getFullName() + " still alive?");
//                    if (answerIsAlive().equals(randomFamousPeoples.getIsAlive())) {
//                        System.out.println("You are right");
//                        System.out.println(randomFamousPeoples.toString());
//                        winCounter++;
//                        uniqueCounter = randomFamousPeoples.hashCode();
//                    } else {
//                        System.out.println("You wrong! Try again.");
//                        uniqueCounter = randomFamousPeoples.hashCode();
//                    }
//                } else {
//                    System.out.println("You wrong! Try again.");
//                    uniqueCounter = randomFamousPeoples.hashCode();
//                }
//            }
//        } while (winCounter < 3);
//        System.out.println("YOU WIN!");
//    }
//
//    private int answerDOB() {
//        Scanner input = new Scanner(System.in);
//        int dob = input.nextInt();
//        return dob;
//    }
//
//    private String answerIsAlive() {
//        Scanner input = new Scanner(System.in);
//        String isAlive = input.next().toLowerCase();
//        return isAlive;
//    }

}

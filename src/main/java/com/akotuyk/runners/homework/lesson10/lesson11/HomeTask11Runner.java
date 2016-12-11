package com.akotuyk.runners.homework.lesson10.lesson11;

import com.akotuyk.app.homework.lesson11.StringConverter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 11.12.2016.
 */
public class HomeTask11Runner {

    public static void main(String[] arg) {
        System.out.println("Welcome to my array parser app!");
        HomeTask11Runner homeTask11Runner = new HomeTask11Runner();
        homeTask11Runner.menuText();
    }

    public void menuText() {
        System.out.println("You can choose the number of action:\n" +
                "(1) to input any quantity of numbers separated by semicolons and to sort them;\n" +
                "(2) to input an array with different symbols and to get only letters from it;\n" +
                "(3) to input a string and to mark some key word that will separate this string;\n" +
                "(4) Enigma script;\n" +
                "(0) exit.\n" +
                "What do you choose? : ");
        menuSelection();
    }

    public void menuSelection() {
        StringConverter stringConverter = new StringConverter();
        switch (Scanner()) {
            case "1":
                System.out.println("You choose to input any quantity of numbers separated by semicolons and to sort them.");
                System.out.println("Please enter any numbers separated by semicolons:");
                stringConverter.intArray(Scanner());
                System.out.println("You entered next values: "
                        + Arrays.toString(stringConverter.getIntArray()));
                System.out.println("Would you like to sort them in ascending or descending order? Press 1 or 2:");
                sortMethodsSelection();
                escFunction();
                break;
            case "2":
                System.out.println("You choose to input an array with different symbols and to get only letters from it.");
                System.out.println("Please enter anything separated by semicolons:");
//                System.out.println("Here is your filtered string: " +
//                        stringConverter.stringGetOnlyLetters2(Scanner()));
                escFunction();
                break;
            case "3":
                System.out.println("You choose to input a string and to mark some key word that will separate this string.");
                System.out.println("Please, enter the string you want to split, then the keyword: ");
                String[] a1 =  stringConverter.splitByKeywordString(Scanner(),Scanner());
                System.out.println(a1);
                System.out.println(Arrays.toString(a1));
                escFunction();
                break;
            case "4":
                System.out.println("You choose an Enigma script;");
                break;
            case "0":
                System.out.println("Bye!");
                break;
            default:
                System.out.println("You entered the WRONG value. Please, try again.");
                menuSelection();
                break;
        }
    }

    public void sortMethodsSelection() {
        StringConverter stringConverter = new StringConverter();
        switch (Scanner()) {
            case "1":
                System.out.println(Arrays.toString(stringConverter.arraySortAscending(stringConverter.getIntArray())));
                break;
            case "2":
                System.out.println(Arrays.toString(stringConverter.arraySortDescending(stringConverter.getIntArray())));
                break;
            default:
                System.out.println("You entered the WRONG value. Please, try again.");
                sortMethodsSelection();
                break;
        }
    }

    public String Scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void escFunction() {
        System.out.println("Do you want to out? (yes/no)");
        Scanner input = new Scanner(System.in);
        switch (input.next()) {
            case "no":
                menuText();
                break;
            case "yes":
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                escFunction();
                break;
        }
    }
}

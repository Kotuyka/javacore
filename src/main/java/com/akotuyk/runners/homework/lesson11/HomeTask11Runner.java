package com.akotuyk.runners.homework.lesson11;

import com.akotuyk.app.homework.lesson11.DecodeEncodeMethods;
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
                "(4) decoding strings with Enigma and Caesar scripts;\n" +
                "(0) exit.\n" +
                "What do you choose? : ");
        menuSelection();
    }

    public void menuSelection() {
        StringConverter stringConverter = new StringConverter();
        switch (scanner()) {
            case "1":
                System.out.println("You choose to input any quantity of numbers separated by semicolons and to sort them.");
                System.out.println("Please enter any numbers separated by semicolons:");
                stringConverter.intArray(scanner());
                System.out.println("You entered next values: "
                        + Arrays.toString(stringConverter.getIntArray()));
                System.out.println("Would you like to sort them in ascending or descending order? Press 1 or 2:");
                sortMethodsSelection();
                escFunction();
                break;
            case "2":
                System.out.println("You choose to input an array with different symbols and to get only letters from it.");
                System.out.println("Please, enter the string you want to get letters from and press 'Enter', \n" +
                        "then enter the keyword or symbol you want to split it with: ");
                System.out.println("Here is your filtered string: " +
                        Arrays.toString(stringConverter.stringGetOnlyLetters(scanner(), scanner())));
                escFunction();
                break;
            case "3":
                System.out.println("You choose to input a string and to mark some key word that will separate this string.");
                System.out.println("Please, enter the string you want to split and press 'Enter', then enter the keyword: ");
                printArray(stringConverter.splitByKeywordString(scanner(), scanner()));
                escFunction();
                break;
            case "4":
                System.out.println("decoding strings with Enigma and Caesar scripts");
                System.out.println("Press (1) if you want to decode 'r4feka5h5mejaghqra666' with Enigma script;\n" +
                                  "Press (2) if you want to decode 'vlrxafaxfq' with Caesar script.");
                decodeMethodsSelection();
                escFunction();
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

    public String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void sortMethodsSelection() {
        StringConverter stringConverter = new StringConverter();
        switch (scanner()) {
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
    
        public void decodeMethodsSelection() {
        DecodeEncodeMethods decodeEncodeMethods = new DecodeEncodeMethods();
        switch (scanner()) {
            case "1":
                System.out.println(decodeEncodeMethods.enigmaMethod("r4feka5h5mejaghqra666"));
                break;
            case "2":
                decodeEncodeMethods.caesarMethod("vlrxafaxfq");
                break;
            default:
                System.out.println("You entered the WRONG value. Please, try again.");
                decodeMethodsSelection();
                break;
        }
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



    public void printArray(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

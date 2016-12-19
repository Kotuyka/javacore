package com.akotuyk.runners.homework.lesson12;

import com.akotuyk.app.homework.lesson12.Reader;
import com.akotuyk.app.homework.lesson12.SortArrayMethods;
import com.akotuyk.app.homework.lesson12.Writer;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 18.12.2016.
 */
public class HomeTask12Runner {
    public static void main(String[] arg) throws IOException {
        System.out.println("Welcome to my Input/Output stream parser app!");
        HomeTask12Runner homeTask12Runner = new HomeTask12Runner();
        homeTask12Runner.menuText();
    }

    public void menuText() throws IOException {
        System.out.println("You can choose the number of action:\n" +
                "(1) to read a numerical array (separated by semicolons) from the file and to sort it into another file;\n" +
                "(2) to read words in column and check if it is a palindrome;\n" +
                "(3) to enter a file name, to read it and to save into the another, after 'exit' input;\n" +
                "(4) to create properties file;\n" +
                "(0) exit.\n" +
                "(9) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        menuSelection();
    }

    public void menuSelection() throws IOException {
        Reader reader = new Reader();
        Writer writer = new Writer();
        switch (scanner()) {
            case "1":
                System.out.println("So we get next an array from the file: ");
                reader.setIntValueArray();
                printArray(reader.getIntValueArray());
                System.out.println("Now, choose the way you want to sort the array before writhing it into file: ");
                sortMethodSelection(reader.getIntValueArray());
                escFunction();
                break;
            case "2":
                System.out.println("Now we'll read the file and chek it for palindrome");
                reader.setLine();
                System.out.println("So, we have next strings in file: ");
                printStringArray(reader.getLine());
                writer.stringFileWriter(reader.getLine());
                System.out.println("And we checked if there were palondromes and wrote answers to PalindromeWriter file.");
                escFunction();
                break;
            case "3":
                System.out.println("Enter the name of the file you want to save to: ");
                String fileName = scanner();
                writer.stringWriterToFile(fileName);
                System.out.println("We done with it. All your lines were saved.");
                escFunction();
                break;
            case "4":
                System.out.println("You choose to create config.properties file.");
                System.out.println("Enter the line you want to set as properties value in the next format: \n" +
                        "database1,localhost1");
                writer.writerToPropertyFile();
                System.out.println("We done with it. All your config properties were saved.");
                escFunction();
                break;
            case "0":
                System.out.println("Bye!");
                break;
            case "9":
                MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                mainRunnerForHomeTasks.textMenu();
                break;
            default:
                System.out.println("You entered the WRONG value. Please, try again.");
                menuSelection();
                break;
        }
    }

    public int[] sortMethodSelection(int[] array) throws IOException {
        System.out.println("You can choose the method of array sorts:\n" +
                "(1) bubble Sort From Low To Higher;\n" +
                "(2) bubble Sort From Higher ToLow;\n" +
                "(3) selection Sort From Low To Higher;\n" +
                "(4) selection Sort From Higher To Low;\n" +
                "(0) do not sort this array.\n" +
                "What do you choose? : ");
        SortArrayMethods sortArrayMethods = new SortArrayMethods();
        sortArrayMethods.setSortedIntArray(array);
        switch (scanner()) {
            case "1":
                sortArrayMethods.bubbleSortFromLowToHigher();
                break;
            case "2":
                sortArrayMethods.bubbleSortFromHigherToLow();
                break;
            case "3":
                sortArrayMethods.selectionSortFromLowToHigher();
                break;
            case "4":
                sortArrayMethods.selectionSortFromHigherToLow();
                break;
            case "0":
                System.out.println("We wouldn't sort this array.");
                break;
            default:
                System.out.println("You entered the WRONG value. Please, try again.");
                menuSelection();
                break;
        }
        System.out.println("Here what we'll wright to the outputFile: ");
        printArray(sortArrayMethods.getSortedIntArray());
        Writer writer = new Writer();
        writer.intValueFileWriter(sortArrayMethods.getSortedIntArray());
        return sortArrayMethods.getSortedIntArray();
    }

    public String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public void escFunction() throws IOException {
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

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public void printStringArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].toString() + ", ");
        }
        System.out.println();
    }
}

package com.akotuyk.runners.homework.lesson7;

import com.akotuyk.app.homework.lesson7.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 27.11.2016.
 */
public class LoopsArraysRunner {
    public static int[] intArray;
    public static int[][] intTwoDimensionalArray;

    public static void main(String[] args) {
        System.out.println("Welcome to my ArrayApp. You can choose the number of action:");
        menu();}

    public static void menu() {
        System.out.println("You can choose the number of action:\n"+
                "(a) even array from 2 to 20;\n"+
                "(b) odd array from 1 to 99;\n"+
                "(c) an array with 15 random numbers from 0 to 9;\n"+
                "(d) an array with 15 random numbers from 0 to 999;\n"+
                "(e) a two-dimensional array [8][5] with random numbers from 10 to 99.;\n"+
                "(f) ;\n"+
                "(g) *** a two-dimensional array [8][5] with random numbers from 1 to 999;\n"+
                "(h) *** to enter a series of numbers to determine their amount;\n"+
                "(q) to exit.\n"+
                "What do you choose? : ");
        choose();}

    public static String scaner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the letter: ");
        String answer = input.next();
        return answer;}

    public static void choose() {
        //try {
            String menuInput = scaner();
            if (menuInput.equals("a")) {
                System.out.println("You choose (a) even array from 2 to 20.\n" +
                        "We need are calculating...");
                intArray = ExerciseA.evenArray();
                System.out.println("An even array in line is: ");
                for (int i = 0; i < intArray.length; i++) {
                    System.out.print(intArray[i]);
                    System.out.print(" ");}
                System.out.println(" ");
                System.out.println("An even array in column is: ");
                for (int i = 0; i < intArray.length; i++) {
                    System.out.println(intArray[i]);}
                System.out.println("We done with (a).");
                escFunction();}

        else if (menuInput.equals("b")) {
            System.out.println("You choose (b) odd array from 1 to 99.\n" +
                    "We need are calculating...");
            intArray = ExerciseB.oddArray();
            System.out.println("An odd array in line is: ");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i]);
                System.out.print(" ");}
            System.out.println(" ");
            System.out.println("An odd line of array in reverse is: ");
            for (int i = intArray.length - 1; i >= 0; i--) {
                System.out.print(intArray[i]);
                System.out.print(" ");}
            System.out.println(" ");
            System.out.println("We done with (b).");
            escFunction();}

        else if (menuInput.equals("c")) {
            System.out.println("You choose (c) an array with 15 random numbers from 0 to 9.\n" +
                    "We need are calculating...");
            intArray = ExerciseC.randomArray();
            System.out.println("An array with 15 random numbers from 0 to 9 is: ");
            System.out.println(Arrays.toString(intArray));
            System.out.println("The quantity of even numbers in this array is: "+ ExerciseC.countArray());
            System.out.println("We done with (c).");
            escFunction();}

        else if (menuInput.equals("d")) {
            System.out.println("You choose (d) an array with 15 random numbers from 0 to 999.\n" +
                    "We need are calculating...");
            intArray = ExerciseD.randomArray();
            System.out.println("An array with 15 random numbers from 0 to 999 is: ");
            System.out.println(Arrays.toString(intArray));
            System.out.println("The max number in this array is: "+ ExerciseD.maxIntArray());
            System.out.println("The min number in this array is: "+ ExerciseD.minIntArray());
            System.out.println("We done with (d).");
            escFunction();}

        else if (menuInput.equals("e")) {
            System.out.print("You choose (e) an two-dimensional array [8][5] with random numbers from 10 to 99.\n" +
                    "We need are calculating...\n");
            intTwoDimensionalArray = ExerciseE.randomArray();
            System.out.println("A two-dimensional array [8][5] with random numbers from 10 to 99 is: ");
            for (int j = 0; j < intTwoDimensionalArray.length; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(intTwoDimensionalArray[j][k]);
                    System.out.print(" ");}
                System.out.println();}
            System.out.println("We done with (e).");
            escFunction();}

//        else if (menuInput.equals("f")) {
//            System.out.print("You choose (e) an two-dimensional array [8][5] with random numbers from 10 to 99.\n" +
//                    "We need are calculating...\n");

        else if (menuInput.equals("g")) {
            System.out.print("You choose (g) an two-dimensional array [8][5] with random numbers from 1 to 999.\n" +
                    "We need are calculating...\n");
            intTwoDimensionalArray = ExerciseG.randomArray();
            System.out.println("A two-dimensional array [8][5] with random numbers from 1 to 999 is: ");
            for (int j = 0; j < intTwoDimensionalArray.length; j++) {
                int x = j + 1;
                System.out.print("List "+ x + ": ");
                for (int k = 0; k < 5; k++) {
                    if (intTwoDimensionalArray[j][k] < 100){
                            if (intTwoDimensionalArray[j][k] < 10){
                                System.out.print("  " + intTwoDimensionalArray[j][k]);}
                                else {System.out.print(" " + intTwoDimensionalArray[j][k]);}}
                    else {System.out.print(intTwoDimensionalArray[j][k]);}
                    System.out.print(" ");}
                System.out.println();}
            System.out.println("We done with (g).");
            escFunction();}

        else if (menuInput.equals("h")) {
            System.out.println("You choose (h) to enter a series of numbers to determine their amount.");
            intTwoDimensionalArray = ExerciseH.intTwoDimensionalArray2();
            System.out.println("The ammount of your numbers is: " + ExerciseH.sumArray2Elements());
            System.out.println("We done with (g).");
            escFunction();}

//            System.out.println("A two-dimensional array [8][5] with random numbers from 1 to 999 is: ");
//            for (int j = 0; j < intTwoDimensionalArray.length; j++) {
//                int x = j + 1;
//                System.out.print("List "+ x + ": ");
//                for (int k = 0; k < 5; k++) {
//                    if (intTwoDimensionalArray[j][k] < 100){
//                        if (intTwoDimensionalArray[j][k] < 10){
//                            System.out.print("  " + intTwoDimensionalArray[j][k]);}
//                        else {System.out.print(" " + intTwoDimensionalArray[j][k]);}}
//                    else {System.out.print(intTwoDimensionalArray[j][k]);}
//                    System.out.print(" ");}
//                System.out.println();}
//            System.out.println("We done with (g).");
//            escFunction();}












        else if (menuInput.equals("q")) {
                System.out.println("Bye!");
            } else{System.out.println("Is it hard to enter a number? You entered the WRONG VALUE. Correct yourself...");
                menu();}}

//        } catch (InputMismatchException ex) {
//            System.out.println("Is it hard to enter a letter? You entered the WRONG VALUE. Correct yourself...");
//            menu();}}

//    public static void equal(){
//        System.out.println("They are equals");
//        escFunction();}

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

    public static String scanerNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        String likeNumber = input.next();
        if (likeNumber.equals("exit")){
            likeNumber = (int) 1000;}
        if (likeNumber.indexOf()){            // НЕ ПОНИМАЮ ПОЧЕМУ ТУТ ОШИБКА. Вместо выхода, оно переходит на елс, и замыкает цикл. Сначала этого небыло, а потом появилось и я не понимаю почему.
            System.out.println("Bye!");
        } else {System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
            escFunction();}
        return likeNumber;}

}
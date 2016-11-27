package com.akotuyk.runners.classwork;

import java.util.Arrays;
import java.util.Scanner;
public class Lesson7 {

    public static void main(String[] args) {
        array4 ();}

    public static void array4 () {                     // [1, 2, 3]
        int[] array = {1, 2, 3};
            System.out.print(Arrays.toString(array));
        }

    public static void array3 () {          //array2 = array3
        int[] intArray = {1, 2, 3};
        for (int arrElement : intArray){
            System.out.print(arrElement);
        }}

    public static void array2 () {
        int[] intArray = {1, 2, 3};
        for (int i=0; i<intArray.length; i++){
            System.out.print(intArray[i]);
        }}

    public static void array1 () {
        int [] a = new int[scaner()];
        for (int i=0; i<a.length; i++){
            a[i]= scaner();}
        System.out.print(a);
        }

        public static void forLoop2 (int a) {
            int count = 0;
            for (a=0; a<=20; a+=2) {
                count++;}
            System.out.print(count);
        }

    public static void forLoop (int a) {
        for (a=0; a<=10; a++) {
            System.out.print(a);}
    }

    public static void counter (int a, int b) {
        while (a > b) {
            System.out.println(a + " and " + b);
            a--;}
        System.out.println(a + " and " + b);
    }

    public static int scaner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int number = input.nextInt();
        return number;}

//        int a = 1;
//        System.out.println("Original a value " + a);
//        System.out.println("Post-increment a " + a++);
//        System.out.println("After post-increment " + a);
//        System.out.println("Pre-increment a " + ++a);
//        System.out.println("After pre-increment " + a);
}

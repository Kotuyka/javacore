package com.akotuyk.app.homework.lesson7;
import com.akotuyk.runners.homework.lesson7.LoopsArraysRunner;

public class ExerciseH {

//    public static void main(String[] args) {      для вызова метода. Использовал для удобства во время попыток решить задачу
//        intTwoDimensionalArray2 ();}

//    public static int[][] intTwoDimensionalArray2 () {                  код который получился во время попытки решения.
//        int[][] intTwoDimensionalArray = new int[2][2];                 не могу придумать как прервать ввод чисел строкой "ексит"
//        for (int j = 1; j < intTwoDimensionalArray.length; j++) {
//            for (int k = 0; k < intTwoDimensionalArray[j].length; k++) {
//                intTwoDimensionalArray[j][k]=LoopsArraysRunner.scanerNumber();}}
//        System.out.println(Arrays.toString(intTwoDimensionalArray));
//
//        for (int j = 0; j < intTwoDimensionalArray.length; j++) {
//            for (int k = 0; k < 2; k++) {
//                System.out.print(intTwoDimensionalArray[j][k]);
//                System.out.print(" ");}
//            System.out.println();}
//
//
//        int sum = 0;
//        for (int j = 0; j < intTwoDimensionalArray.length; j++) {
//            for (int k = 0; k < intTwoDimensionalArray[j].length; k++) {
//                sum = sum + intTwoDimensionalArray[j][k];}}
//        System.out.println(sum);
//
//        return intTwoDimensionalArray;}

    public static int sumArray2Elements () {
        int sum = 0;
        for (int j = 0; j < LoopsArraysRunner.intTwoDimensionalArray.length; j++) {
            for (int k = 0; k < LoopsArraysRunner.intTwoDimensionalArray[j].length; k++) {
                sum = sum + LoopsArraysRunner.intTwoDimensionalArray[j][k];}}
        return sum;}
}
package com.akotuyk.app.homework.lesson7;

import com.akotuyk.runners.homework.lesson7.LoopsArraysRunner;

import java.util.Arrays;

/**
 * Created by Huly-Buly on 27.11.2016.
 */
public class ExerciseH {

    public static void main(String[] args) {
        intTwoDimensionalArray2 ();}

    public static int[][] intTwoDimensionalArray2 () {
        int[][] intTwoDimensionalArray = new int[2][2];
        for (int j = 1; j < intTwoDimensionalArray.length; j++) {
            for (int k = 0; k < intTwoDimensionalArray[j].length; k++) {
                intTwoDimensionalArray[j][k]=LoopsArraysRunner.scanerNumber();
                System.out.println(intTwoDimensionalArray[j][k]);}}
        System.out.println(Arrays.toString(intTwoDimensionalArray));

        for (int j = 0; j < intTwoDimensionalArray.length; j++) {
            for (int k = 0; k < 2; k++) {
                System.out.print(intTwoDimensionalArray[j][k]);
                System.out.print(" ");}
            System.out.println();}


        int sum = 0;
        for (int j = 0; j < intTwoDimensionalArray.length; j++) {
            for (int k = 0; k < intTwoDimensionalArray[j].length; k++) {
                sum = sum + intTwoDimensionalArray[j][k];}}
        System.out.println(sum);

        return intTwoDimensionalArray;}

    public static int sumArray2Elements () {
        int sum = 0;
        for (int j = 1; j <2; j++) {
            sum = 0;
            for (int k = 0; k <3; k++) {
                sum = sum + LoopsArraysRunner.intTwoDimensionalArray[j][k];}}
        return sum;}


//        for( int[] num : LoopsArraysRunner.intTwoDimensionalArray) {
//            // суммирование каждого элемента массива
//            sum = sum + num;}


//        int[][] intTwoDimensionalArray = new int[2][];
//        int sum =0;

//        }

}
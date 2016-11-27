package com.akotuyk.app.homework.lesson7;

public class ExerciseG {

    public static int[][] randomArray () {
        int[][] intTwoDimensionalArray = new int[8][5];
        for (int j = 0; j <8; j++) {
            for (int k = 0; k <5; k++) {
                intTwoDimensionalArray[j][k]=( (int)((Math.random()*999) + 1));}}
        return intTwoDimensionalArray;}
}

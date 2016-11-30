package com.akotuyk.app.homework.lesson7;

public class ExerciseE {

    public static int[][] randomArray (int a, int b,int c,int d) {
        int[][] intTwoDimensionalArray = new int[a][b];
        for (int j = 0; j <a; j++) {
            for (int k = 0; k <b; k++) {
                intTwoDimensionalArray[j][k]=( (int)((Math.random()*c) + d));}}
        return intTwoDimensionalArray;}
}

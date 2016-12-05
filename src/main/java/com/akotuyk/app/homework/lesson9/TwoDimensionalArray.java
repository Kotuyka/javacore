package com.akotuyk.app.homework.lesson9;

public class TwoDimensionalArray {

    private static int[][] intTwoDimensionalArray;
    private static int maxArrayElement = 0;


    public void intTwoDimensionalArray(int b, int c) {
        this.setRandomTwoDimensionalArray(b, c);
    }

    private int[][] setRandomTwoDimensionalArray(int b, int c) {
        intTwoDimensionalArray = new int[5][8];
        for (int i = 0; i < intTwoDimensionalArray.length; i++) {
            for (int j = 0; j < intTwoDimensionalArray[i].length; j++) {
                intTwoDimensionalArray[i][j] = ((int) ((Math.random() * (b * 2)) + c));
            }
        }
        return intTwoDimensionalArray;
    }

    public int[][] getIntTwoDimensionalArray() {
        return intTwoDimensionalArray;
    }

    private int setMaxElementOfIntTwoDimensionalArray(int[][] TwoDimensionalArray) {
        maxArrayElement = intTwoDimensionalArray[0][0];
        for (int i = 0; i < intTwoDimensionalArray.length; i++) {
            for (int j = 0; j < intTwoDimensionalArray[i].length; j++) {
                if (intTwoDimensionalArray[i][j] > maxArrayElement) {
                    maxArrayElement = intTwoDimensionalArray[i][j];
                }
            }
        }
        return maxArrayElement;
    }

    public int getMaxElementOfIntTwoDimensionalArray() {
        setMaxElementOfIntTwoDimensionalArray(intTwoDimensionalArray);
        return maxArrayElement;
    }


}

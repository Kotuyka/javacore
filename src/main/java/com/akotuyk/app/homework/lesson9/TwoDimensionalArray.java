package com.akotuyk.app.homework.lesson9;

/**
 * Created by Huly-Buly on 04.12.2016.
 */
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
                intTwoDimensionalArray[i][j] = ((int) ((Math.random() * (b*2)) + c));
            }
        }
        return intTwoDimensionalArray;
    }

    public int[][] getIntTwoDimensionalArray(){
        return intTwoDimensionalArray;
    }




//    public void intMaxElementOfIntTwoDimensionalArray(int[][] TwoDimensionalArray) {
//        this.setMaxElementOfIntTwoDimensionalArray(intTwoDimensionalArray);
//    }

    private int setMaxElementOfIntTwoDimensionalArray(int[][] TwoDimensionalArray) {
        for (int i = 0; i < intTwoDimensionalArray.length; i++) {
            for (int j = 0; j < intTwoDimensionalArray[i].length; j++) {
//                for (int k = 1; k < intTwoDimensionalArray[i][j]; k++) {
//                    if (intTwoDimensionalArray[i][j] > intTwoDimensionalArray[i][j+1]){
//                        maxArrayElement = intTwoDimensionalArray[i][j];
//                    }
//                }
                maxArrayElement = intTwoDimensionalArray[i][j];
            }
        }
        return maxArrayElement;
    }

    public int getMaxElementOfIntTwoDimensionalArray(){
        setMaxElementOfIntTwoDimensionalArray(intTwoDimensionalArray);
        return maxArrayElement;
    }


}

package com.akotuyk.app.homework.lesson11;

import java.util.Arrays;

/**
 * Created by Huly-Buly on 11.12.2016.
 */
public class StringConverter {
    private static int[] intArray;

    public void intArray(String a) {
        this.setIntArray(a);
    }

    private int[] setIntArray(String a) {
        arrayParser(a);
        return intArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public int[] arrayParser(String a) {
        StringBuilder builder = new StringBuilder(a);
        String[] arrayString = builder.toString().split(";");
        intArray = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            intArray[i] = Integer.parseInt(arrayString[i]);
        }
        return intArray;
    }

    public int[] arraySortAscending(int[] intArray) {
        Arrays.sort(intArray);
        return intArray;
    }

    public int[] arraySortDescending(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length; j++) {
                if (intArray[j - 1] < intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

//    public String stringGetOnlyLetters(String a) {
//        String plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwx";
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < a.length(); i++) {
//            for (int j = 0; j < plainText.length(); j++) {
//                if (a.charAt(i) == plainText.charAt(j)) {
//                    builder.append(a.charAt(i));
//                }
//            }
//        }
//        String completedString = builder.toString();
//        return completedString;
//    }

//    public String stringGetOnlyLetters2(String a) {
//        StringBuilder builder1 = new StringBuilder(a);
//        String[] splittedStringArray = builder1.toString().split(";");
//        String [] array = new String[splittedStringArray.length];
//        for (int i = 0; i < splittedStringArray.length; i++) {
//            array[i] = splittedStringArray[i];
//        }
//        String plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwx";
//        StringBuilder builder2 = new StringBuilder();
//        for (int i = 0; i < splittedStringArray.length; i++) {
//            for (int j = 0; j < plainText.length(); j++) {
//                if (splittedStringArray[i].equals(plainText.charAt(j))) {
//                    builder2.append(splittedStringArray[i]);
//                }
//            }
//        }
//        return builder2.toString();
//    }

    public String[] splitByKeywordString(String a, String b){
        StringBuilder builder = new StringBuilder(a);
        String[] arrayString = builder.toString().split(b);

//
//        String[] arrayString = builder.toString().split(";");
//        intArray = new int[arrayString.length];
//        for (int i = 0; i < arrayString.length; i++) {
//            intArray[i] = Integer.parseInt(arrayString[i]);
//        }
        return arrayString;
    }


}

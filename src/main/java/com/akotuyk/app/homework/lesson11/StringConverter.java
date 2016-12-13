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

    public String[] stringGetOnlyLetters(String s1, String s2) {
        String plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwx";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (s1.charAt(i) == plainText.charAt(j)) {
                    builder.append(s1.charAt(i));
                }
            }
        }
        String[] completedString = builder.toString().split(s2);
        return completedString;
    }

    public String[] splitByKeywordString(String a, String b) {
        if (a.contains(b)) {
            String[] splitedString = a.split(b);
            return splitedString;
        }
        String[] notSplitedString = a.split("_");
        return notSplitedString;
    }


}

package com.akotuyk.app.homework.lesson11;

import java.util.Arrays;

/**
 * Created by Huly-Buly on 11.12.2016.
 */
public class StringConverter {
    private static int[] intArray;

    public void intArray(String s1, String s2) {
        this.setIntArray(s1, s2);
    }

    private int[] setIntArray(String s1, String s2) {
        arrayParser(s1, s2);
        return intArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public int[] arrayParser(String s1, String s2) {
        StringBuilder builder = new StringBuilder(s1);
        String[] stringArrays = builder.toString().split(s2);
        intArray = new int[stringArrays.length];
        for (int i = 0; i < stringArrays.length; i++) {
            intArray[i] = Integer.parseInt(stringArrays[i]);
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
        String[] onlyLettersString = builder.toString().split(s2);
        return onlyLettersString;
    }

    public String[] splitByKeywordString(String a, String b) {
        if (a.contains(b)) {
            String[] splittedString = a.split(b);
            return splittedString;
        }
        String[] notSplittedString = a.split("_");
        return notSplittedString;
    }


}

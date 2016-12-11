package com.akotuyk.runners.classwork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 09.12.2016.
 */
public class Lesson11 {

    public static void main(String[] args) {
        Lesson11 lesson11 = new Lesson11();
        lesson11.workWithStringBuilderCharIndex();

//         Car car = new Car();

//        System.out.println(car);
//        System.out.println(car.toString());
    }

    public void arrayToString() {
        System.out.println("Enter numbers using semi delimiter");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(" ");
        String[] strArray = new String[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) {
            strArray[i] = String.valueOf(splittedStringArray[i]);
        }
        System.out.println(Arrays.toString(splittedStringArray));
//
//            .replace("]", ""));
    }

    public void workWithStringBuilder() {
        StringBuilder builder = new StringBuilder("start");
        int startInclusive = 2;
        int enrExclusice = 4;
        builder.delete(startInclusive, enrExclusice);
        System.out.println(builder);
        System.out.println(builder.toString());
    }

    public void workWithStringBuilderIndexOffset() {
        StringBuilder builder = new StringBuilder("start");
        int indexOffset = 3;
        builder.insert(indexOffset, "some sub string");
        System.out.print(builder.toString());
    }

    public void workWithStringBuilderReplace() {
        StringBuilder builder = new StringBuilder("start");
        int startInclusive = 1;
        int endExclusive = 2;
        builder.replace(startInclusive, endExclusive, "replace");
        System.out.print(builder.toString());
    }

    public void workWithStringBuilderCharIndex() {
        StringBuilder builder = new StringBuilder("start");
        int charIndex = 3;
        builder.setCharAt(charIndex, 'a');
        System.out.print(builder.toString());
    }

    public boolean palindromeStringWithStringBuilder() {
        System.out.println("Enter the string that you think is palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String stringGet = inputString.toLowerCase().replaceAll("[^A-Za-z1-9]+", "");
        StringBuilder builder = new StringBuilder(stringGet);
        if (stringGet.equals(builder.reverse().toString())) {
            return true;
        }
        return false;
    }

    public static String stringEncode(String stringToEncode) {
        String plainText = "0123456789";
        String cypherText = "It isfunn!";
        StringBuilder stringbuilder = new StringBuilder(stringToEncode);
        String encodeString = "";
        for (int i = 0; i < stringbuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringbuilder.charAt(i) == plainText.charAt(j)) {
                    stringbuilder.setCharAt(i, cypherText.charAt(j));
                }
            }
        }
        return stringbuilder.toString();
    }

}

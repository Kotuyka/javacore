package com.akotuyk.app.homework.lesson11;

import java.util.Scanner;

/**
 * Created by Huly-Buly on 12.12.2016.
 */
public class DecodeEncodeMethods {
    private static boolean codeIsDecoded = false;
    private static int count = 0;
    private static String decodedString;

    public static String enigmaMethod(String stringToEncode) {
        String plainText = "abc defghijklmnopqrstuvwxyz123456";
        String cypherText = "абвгдежзийклмнопрстуфхцчшщыьэюя .";
        StringBuilder stringbuilder = new StringBuilder(stringToEncode);
        for (int i = 0; i < stringbuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringbuilder.charAt(i) == plainText.charAt(j)) {
                    stringbuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringbuilder.toString();
    }

    public String caesarMethod(String stringToEncode) {
        String plainText = "abcdefghijklmnopqrstuvwx yz";
        StringBuilder stringcypherTextbuilder = new StringBuilder("abcdefghijklmnopqrstuvwxyz ");
        do {
            StringBuilder stringbuilder1 = new StringBuilder(stringToEncode);
            stringcypherTextbuilder.insert((stringcypherTextbuilder.length()), stringcypherTextbuilder.subSequence(0, count)).delete(0, count);
            for (int i = 0; i < stringToEncode.length(); i++) {
                for (int j = 0; j < plainText.length(); j++) {
                    if (stringbuilder1.charAt(i) == plainText.charAt(j)) {
                        stringbuilder1.setCharAt(i, stringcypherTextbuilder.toString().charAt(j));
                        break;
                    }
                }
            }
            System.out.println(stringbuilder1);
            checkForSense(stringbuilder1);
        }
        while (!codeIsDecoded);
        count = 0;
        codeIsDecoded = false;
        return decodedString;
    }

    public void checkForSense(StringBuilder a) {
        System.out.println("Is it have any sense? (yes/no)");
        Scanner input = new Scanner(System.in);
        switch (input.nextLine()) {
            case "no":
                count++;
                break;
            case "yes":
                codeIsDecoded = true;
                decodedString = a.toString();
                break;
            default:
                System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                checkForSense(a);
                break;
        }
    }
}

package com.akotuyk.app.homework.lesson10;

public class MethodsToCheckForPolindrom {

    public boolean reverseStringMethod(String polindrom) {
        String reversePolindrom = "";
        for (int i = polindrom.length() - 1; i >= 0; --i) {
            reversePolindrom += polindrom.charAt(i);
        }
        if (polindrom.toLowerCase().equals(reversePolindrom.toLowerCase())) {
            return true;
        }
        return false;
    }

    public boolean dividedStringMethod(String polindrom) {
        for (int i = 0; i < ((polindrom.length())/2); i++) {
            if (polindrom.toLowerCase().charAt(i) != polindrom.toLowerCase().charAt(polindrom.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean strToArrayMethod(String polindrom) {
        String[] array = polindrom.toLowerCase().split("");
        for (int i = 0; i < ((array.length - 1)); i++) {
            if (!array[i].equals(array[array.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean strToCharMethod(String a) {
        char[] charArray = a.toLowerCase().toCharArray();
        int i1 = 0;
        int i2 = a.length() - 1;
        while (i2 > i1) {
            if (charArray[i1] != charArray[i2]) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

}

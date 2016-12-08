package com.akotuyk.app.homework.lesson10;

public class MethodsToCheckForPolindrom {

    public boolean reverseStringMethod(String polindrom) {
        String reversePolindrom = "";
        for (int i = polindrom.length() - 1; i >= 0; --i){
            reversePolindrom += polindrom.charAt(i);
        }
        if (polindrom.toLowerCase().equals(reversePolindrom.toLowerCase())){
            return true;
        }
        return false;
    }

    public boolean dividedStringMethod(String polindrom) {
        for (int i = 0; i < (polindrom.length() - 1)/2; i++){
            if (polindrom.toLowerCase().charAt(i) != polindrom.toLowerCase().charAt(polindrom.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean dividedArrayMethod(String polindrom) {
        String[] array = polindrom.toLowerCase().split("");
        boolean check = false;
        for (int j = 0; j < ((array.length-1)/2); j++){
            if (array[j].equals(array[array.length - 1])){
                check = true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }

}

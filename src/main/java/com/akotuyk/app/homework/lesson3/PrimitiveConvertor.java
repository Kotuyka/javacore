package com.akotuyk.app.homework.lesson3;

public class PrimitiveConvertor {
    static int intVariable = 12522;
    static float floatVariable = 36.4028f;
    static char charVariable = 'd';

    public void floatToChar() {
        char charVariable2 = (char) floatVariable;
        System.out.println("Input float value is " + floatVariable + ". Output char value is " + charVariable2);
    }

    public void intToChar() {
        char charVariable2 = (char) intVariable;
        System.out.println("Input int value is " + intVariable + ". Output char value is " + charVariable2);
    }

    public void charToInt() {
        int intVariable2 = charVariable;
        System.out.println("Input char value is " + charVariable + ". Output int value is " + intVariable2);
    }
}
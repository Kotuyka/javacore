package main.java.com.KotuykA.app.utils.convertors;
public class PrimitiveConvertor {
    static int intVariable = 12522;
    static float floatVariable = 36.4028f;
    static char charVariable = 'd';

    public static void floatToChar(){
        char charVariable2 = (char) floatVariable;
        System.out.println("Input float value is " + floatVariable + ". Output char value is " + charVariable2);}
    public static void intToChar(){
        char charVariable2 = (char) intVariable;
        System.out.println("Input int value is " + intVariable + ". Output char value is " + charVariable2);}
    public static void charToInt(){
        int intVariable2 = charVariable;
        System.out.println("Input char value is " + charVariable + ". Output int value is " + intVariable2);}
}
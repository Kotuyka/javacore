package com.akotuyk.runners.classwork.lesson16;

/**
 * Created by Huly-Buly on 13.01.2017.
 */
public class Test {
    public static void main(String[] args) {

        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();

        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2);
// Here is the same error, but now it is compile-time error
        String intValue2 = value2.getValue();
    }
}

package com.akotuyk.runners.classwork;

import java.util.Arrays;

/**
 * Created by Huly-Buly on 06.12.2016.
 */
public class Lesson10 {

    public static void main(String[] args) {
        Lesson10 lesson10 = new Lesson10();
        lesson10.arrayToString();
    }

    public void arrayToString() {
        String stringToDisplay = "";
        char[] charArray = {'a', 'b', 'c', 'g', ',', ']'};

        for (int i = 0; i < charArray.length; i++) {
            stringToDisplay += charArray[i];
        }
        System.out.println(stringToDisplay);

        stringToDisplay = Arrays.toString(charArray);

        String a = stringToDisplay.replace(",", "!"); //remove the commas
        System.out.println(a);
        String b = stringToDisplay.replace("[", "!"); //remove the right bracket
        System.out.println(b);
        String c = stringToDisplay.replace("b", "z"); //remove the left bracket
        System.out.println(c);
        String d = stringToDisplay.replace("c", " "); //remove white spaces
        System.out.println(d);
        String e = stringToDisplay.trim(); //trim empty cells at end
        System.out.println(e);

        int aaa = 324234;
        String display2 = String.valueOf(aaa);
        System.out.println(aaa);
        System.out.println(display2);
        int aaa2 = Integer.parseInt(display2);
        System.out.println(aaa2);

        double aab = 543534.5465465;
        String display3 = String.valueOf(aab);
        System.out.println(aab);
        System.out.println(display3);
        double aaa3 = Double.parseDouble(display3);
        System.out.println(aaa3);

        byte abb = 45;
        String display4 = String.valueOf(abb);
        System.out.println(abb);
        System.out.println(display4);
        byte abb2 = Byte.parseByte(display4);
        System.out.println(abb2);

        short bbb = 32767;
        String display5 = String.valueOf(bbb);
        System.out.println(bbb);
        System.out.println(display5);
        short bbb4 = Short.parseShort(display5);
        System.out.println(bbb4);

        long bba = 9223005646456456000L;
        String display6 = String.valueOf(bba);
        System.out.println(bba);
        System.out.println(display6);
        long bba5 = Long.parseLong(display6);
        System.out.println(bba5);

        boolean baa = true;
        String display7 = String.valueOf(baa);
        System.out.println(baa);
        System.out.println(display7);
        boolean baa5 = Boolean.parseBoolean(display7);
        System.out.println(baa5);

        String s = "1,2,3,4,5,6,7";
        String[] filterData = s.split(",");
        String summary = filterData[2];
        int summInt = Integer.parseInt(summary);
        System.out.println(summInt);

        int summary2 = 423432;
        String summStr = String.valueOf(summary2);
        System.out.println(summStr);

        String s1 = "first string";
        String s2 = " and second string";
        s1 += s2;
        System.out.println("Concat string example: " + s1);

        String s3 = "1";
        String s4 = " and 2";
        s3 = s3.concat(s4);
        System.out.println("Another concat string example: " + s3);

    }
}

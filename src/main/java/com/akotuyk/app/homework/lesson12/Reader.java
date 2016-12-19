package com.akotuyk.app.homework.lesson12;

import java.io.*;

/**
 * Created by Huly-Buly on 17.12.2016.
 */
public class Reader {

    private int[] intValueArray;
    private String[] line;

    public int[] getIntValueArray() {
        return intValueArray;
    }
    public int[] setIntValueArray() throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader("D:\\Progect\\javacore\\" +
                "src\\main\\java\\com\\akotuyk\\app\\homework\\lesson12\\inputExercise1.txt"));
        String[] stringArray = reader.readLine().split(";");
        this.intValueArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intValueArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intValueArray;
    }

    public String[] getLine() {
        return line;
    }
    public void setLine() throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader("D:\\Progect\\javacore\\" +
                "src\\main\\java\\com\\akotuyk\\app\\homework\\lesson12\\PalindromeReader.txt"));
        StringBuilder builder = new StringBuilder();
        String tech = null;                  // знаю, что можно вроде без этой переменной. Но без нее не корректно считывает файл
        while ((tech = reader.readLine()) != null) {
            builder.append(tech);
        }
        reader.close();
        this.line = builder.toString().split(";");
    }
}

package com.akotuyk.app.homework.lesson12;

import com.akotuyk.app.homework.lesson10.MethodsToCheckForPolindrom;
import com.akotuyk.runners.homework.lesson12.HomeTask12Runner;

import java.io.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by Huly-Buly on 17.12.2016.
 */
public class Writer {

    public void intValueFileWriter(int[] a) throws IOException {
        String outputString = Arrays.toString(a);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Progect\\javacore\\" +
                "src\\main\\java\\com\\akotuyk\\app\\homework\\lesson12\\outputExercise1.txt")));
        writer.append(outputString);
        writer.close();
    }

    public void stringFileWriter(String[] s) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Progect\\javacore\\" +
                "src\\main\\java\\com\\akotuyk\\app\\homework\\lesson12\\PalindromeWriter.txt")));
        MethodsToCheckForPolindrom methodsToCheckForPolindrom = new MethodsToCheckForPolindrom();
        for (int i = 0; i < s.length; i++) {
            if (methodsToCheckForPolindrom.reverseStringMethod(s[i])) {
                String tech1 = " is palindrome";
                writer.append(s[i]).append(tech1).append("\r\n");
            } else {
                String tech2 = " is NOT palindrome";
                writer.append(s[i]).append(tech2).append("\r\n");
            }
        }
        writer.close();
    }

    public void stringWriterToFile(String s) throws IOException {
        HomeTask12Runner homeTask12Runner = new HomeTask12Runner();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Progect\\javacore\\" +
                "src\\main\\java\\com\\akotuyk\\app\\homework\\lesson12\\" + s + ".txt")));
        System.out.println("Now you can enter strings you want to save, that are separated by 'Enters': ");
        String line;
        do {
            line = homeTask12Runner.scanner();
            if (!line.equals("exit")) {
                writer.append(line).append("\r\n");
            }
        }
        while (!line.equals("exit"));
        writer.close();
    }

    public void writerToPropertyFile() throws FileNotFoundException {
        HomeTask12Runner homeTask12Runner = new HomeTask12Runner();
        Properties prop = new Properties();
        OutputStream output = new FileOutputStream("config.properties");
        InputStream input = new FileInputStream("config.properties");
        String line;
        try {
            prop.setProperty("database", "localhost");
            do {
                line = homeTask12Runner.scanner();
                if (!line.equals("")) {
                    prop.load(input);
                    String[] stringArray = line.split(",");
                    Enumeration<?> e = prop.propertyNames();
                    String key = (String) e.nextElement();
                    String value = prop.getProperty(key);
                    if (prop.getProperty(key).equals(stringArray[0])) {
                        prop.replace(value, stringArray[1]);
                    } else {
                        prop.setProperty(stringArray[0], stringArray[1]);
                    }
                }
            } while (!line.equals(""));
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}



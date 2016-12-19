package com.akotuyk.app.homework.lesson12;

import java.io.*;

/**
 * Created by Huly-Buly on 17.12.2016.
 */
public class PalindromReaderWriter {

    public boolean reversePalindromeMethod() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Progect\\javacore\\" +
                "src\\main\\java\\com\\akotuyk\\app\\homework\\lesson12\\PalindromeReader.txt"));
        String line = reader.readLine();
        String reversePolindrom = "";
        for (int i = line.length() - 1; i >= 0; --i) {
            reversePolindrom += line.charAt(i);
        }
        String reversePolindrom2 = reversePolindrom.replaceAll(" ", "");
        String reversePolindrom3 = reversePolindrom2.replaceAll(",", "");
        String line2 = line.replaceAll(" ", "");
        String line3 = line2.replaceAll(",", "");
        System.out.println(line3.toLowerCase());
        System.out.println(reversePolindrom3.toLowerCase());
        if (line3.toLowerCase().equals(reversePolindrom3.toLowerCase())) {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\output.txt")));
            writer.append(line);
            writer.newLine();
            writer.close();
            return true;
        }
        return false;
    }
}

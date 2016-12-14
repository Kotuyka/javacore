package com.akotuyk.runners.classwork;

import java.io.*;

/**
 * Created by Huly-Buly on 13.12.2016.
 */
public class Lesson12 {

    public static void main(String[] args) throws IOException {
        Lesson12 lesson12 = new Lesson12();
        lesson12.lastEx();
//        int a = 12/0;
//        try {

//        if (lesson12.reversePalindromeMethod()) {
//            System.out.println("String is palindrome");
//        } else {
//            System.out.println("String is NOT palindrome");
//        }

//        } catch (IOException IOe) {
//            System.out.println("We catch it! ");
//        }

        //        for (int i = 0; i < 2; i++) {
////            reader.readLine().equals(2234);
////        }
    }

    public void firstTryBufferReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text ");
        }
    }

    public void firstWriteToFile() throws IOException {
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }

    public boolean reversePalindromeMethod() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"));
        String line = reader.readLine();
        reader.close();

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

    public void lastEx() {
        String currentDir = System.getProperty("user.dir");
        String linuxStyle = "dir/input.txt";
        String windowsStyle = "dir\\input.txt";
        File file = new File(currentDir, linuxStyle);
        System.out.println(file.getAbsolutePath());
        file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());
    }
}

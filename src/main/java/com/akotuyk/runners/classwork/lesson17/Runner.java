package com.akotuyk.runners.classwork.lesson17;

import com.akotuyk.app.classwork.lesson17.ArraySorterGenerics;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 17.01.2017.
 */
public class Runner {

    public static void main(String[] arg) throws IOException {
        Runner runner = new Runner();
//        runner.genericsSort();
        runner.arrayMaker();
    }

    private void genericsSort() {
        System.out.println("We'll sort your array");
        ArraySorterGenerics<Integer> integerBox = new ArraySorterGenerics<Integer>();
        System.out.println(Arrays.toString(integerBox.bubbleSortFromHigherToLow(new Integer[] {25, 5824, 54, 685, 564})));

        ArraySorterGenerics<Double> integerBox2 = new ArraySorterGenerics<Double>();
        System.out.println(Arrays.toString(integerBox2.bubbleSortFromHigherToLow(new Double[]{25.5, 5824.45, 54.52, 685.1, 564.5})));
    }

    private void arrayMaker() {
        System.out.println("Please, enter 3 words:");

//        ArrayList<String> myList = new ArrayList<String>();
//        HashSet myList = new HashSet();
//        myList.add(wordScanner());
//        myList.add(wordScanner());
//        myList.add(wordScanner());

        Map myList = new HashMap();
        myList.put("Tester1", wordScanner());
        myList.put("Tester2", wordScanner());
        myList.put("Tester3", wordScanner());

        int theSize = myList.size();
        System.out.println("ArrayList size is: " + theSize);
        System.out.println(myList.values());
    }

    public void printTwoDimensionalArray(int[][] arr, int a) {
        System.out.println("We created random array[5][8]: ");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println("It's max element is: " + a);
    }


    private String wordScanner() {
        Scanner input = new Scanner(System.in);
        String wordScanner = input.next().toLowerCase();
        return wordScanner;
    }
}

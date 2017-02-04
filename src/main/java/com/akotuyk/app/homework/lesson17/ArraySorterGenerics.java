package com.akotuyk.app.homework.lesson17;

import java.util.Arrays;

/**
 * Created by Kotuyk A on 22.01.2017.
 */

public class ArraySorterGenerics<T extends Number & Comparable> {

    private T[] array;

    public ArraySorterGenerics (T[] t){
        this.array = sort(t);
    }

    private  <T extends Number & Comparable>T[] sort (T[] t) {
        for (int i = 0; i < t.length-1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[j - 1].compareTo(t[j])<=0) {
                    T temp = t[j - 1];
                    t[j - 1] = t[j];
                    t[j] = temp;
                }
            }
        }
        return t;
    }

    public T[] getArray() {
        return array;
    }

//    public static <T extends Number & Comparable> T[] bubbleSortFromHigherToLow(T[] t) {    // as a variant
//        for (int i = 0; i < t.length-1; i++) {
//            for (int j = i + 1; j < t.length; j++) {
//                if (t[j - 1].compareTo(t[j])<=0) {
//                    T temp = t[j - 1];
//                    t[j - 1] = t[j];
//                    t[j] = temp;
//                }
//            }
//        }
//        return t;
//    }

    public String toString() {
        return "{" + Arrays.toString(array) + "}";
    }

}

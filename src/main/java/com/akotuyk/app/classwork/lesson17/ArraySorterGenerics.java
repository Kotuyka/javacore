package com.akotuyk.app.classwork.lesson17;

/**
 * Created by Huly-Buly on 17.01.2017.
 */

public class ArraySorterGenerics<T> {

    public <U extends Comparable, Number> U[] bubbleSortFromHigherToLow(U[] u) {
        for (int i = 0; i < u.length-1; i++) {
            for (int j = i + 1; j < u.length; j++) {
                if (u[j - 1].compareTo(u[j])<=0) {
                    U temp = u[j - 1];
                    u[j - 1] = u[j];
                    u[j] = temp;
                }
            }
        }
        return u;
    }

}

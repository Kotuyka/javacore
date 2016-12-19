package com.akotuyk.app.homework.lesson12;

/**
 * Created by Huly-Buly on 17.12.2016.
 */
public class SortArrayMethods {

    public int[] getSortedIntArray() {
        return sortedIntArray;
    }

    public void setSortedIntArray(int[] sortedIntArray) {
        this.sortedIntArray = sortedIntArray;
    }

    private int[] sortedIntArray;

    public int[] bubbleSortFromLowToHigher() {
        int temp;
        for (int i = 0; i < sortedIntArray.length; i++) {
            for (int j = 1; j < sortedIntArray.length; j++) {
                if (sortedIntArray[j - 1] > sortedIntArray[j]) {
                    temp = sortedIntArray[j - 1];
                    sortedIntArray[j - 1] = sortedIntArray[j];
                    sortedIntArray[j] = temp;
                }
            }
        }
        return sortedIntArray;
    }

    public int[] bubbleSortFromHigherToLow() {
        int temp;
        for (int i = 0; i < sortedIntArray.length; i++) {
            for (int j = 1; j < sortedIntArray.length; j++) {
                if (sortedIntArray[j - 1] < sortedIntArray[j]) {
                    temp = sortedIntArray[j - 1];
                    sortedIntArray[j - 1] = sortedIntArray[j];
                    sortedIntArray[j] = temp;
                }
            }
        }
        return sortedIntArray;
    }

    public int[] selectionSortFromLowToHigher() {
        int min;
        for (int i = 0; i < sortedIntArray.length; i++) {
            min = i;
            for (int j = i + 1; j < sortedIntArray.length; j++) {
                while (sortedIntArray[j] < sortedIntArray[min]) {
                    min = j;
                }
            }
            int temp = sortedIntArray[i];
            sortedIntArray[i] = sortedIntArray[min];
            sortedIntArray[min] = temp;
        }
        return sortedIntArray;
    }

    public int[] selectionSortFromHigherToLow() {
        int min;
        for (int i = 0; i < sortedIntArray.length; i++) {
            min = i;
            for (int j = i + 1; j < sortedIntArray.length; j++) {
                while (sortedIntArray[j] > sortedIntArray[min]) {
                    min = j;
                }
            }
            int temp = sortedIntArray[i];
            sortedIntArray[i] = sortedIntArray[min];
            sortedIntArray[min] = temp;
        }
        return sortedIntArray;
    }
}

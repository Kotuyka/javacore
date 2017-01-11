package com.akotuyk.app.homework.lesson9;

import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by Huly-Buly on 05.12.2016.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class MethodsOfSortsTest {
    @Before
    public void beforeMethod() {
        System.out.println("Test start");
    }

    @After
    public void afterMethod() {
        System.out.println("Test finished");
    }

    MethodsOfSorts methodsOfSorts = new MethodsOfSorts();

    @Test
    public void getIntArray() throws Exception {
        methodsOfSorts.setRandomArray(2, 5,6);
        Assert.assertNotNull(methodsOfSorts.getIntArray());
    }

///////////////////////////////////////////////////////////////////  set random array

    @Test
    public void setRandomArray() throws Exception {
        Assert.assertNotNull(methodsOfSorts.setRandomArray(2, 5,6));
    }

    @Test
    public void setRandomArrayNotEquals() throws Exception {
        Assert.assertThat(new int[]{2, 8, 3}, not(equalTo(methodsOfSorts.setRandomArray(2, 5,6))));
    }

    @Test
    public void setRandomArrayFalse() throws Exception { // NotEquals 2
        Assert.assertFalse(Arrays.equals(new int[]{2, 8, 3}, (methodsOfSorts.setRandomArray(2, 5,6))));
    }


///////////////////////////////////////////////////////////////////  bubble sort from low to higher
    @Test
    public void bubbleSortFromLowToHigherEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertArrayEquals(new int[]{2, 3, 8}, methodsOfSorts.bubbleSortFromLowToHigher(intArray));
    }

    @Test
    public void bubbleSortFromLowToHigherEquals2() throws Exception { // Equals 2
        int[] intArray = {2, 8, 3};
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 8}), Arrays.toString(methodsOfSorts.bubbleSortFromLowToHigher(intArray)));
    }

    @Test
    public void bubbleSortFromLowToHigherTrue() throws Exception { // Equals 3
        int[] intArray = {2, 8, 3};
        Assert.assertTrue(Arrays.equals(new int[]{2, 3, 8}, (methodsOfSorts.bubbleSortFromLowToHigher(intArray))));
    }

    @Test
    public void bubbleSortFromLowToHigherNotEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertThat(new int[]{2, 8, 3}, not(equalTo(methodsOfSorts.bubbleSortFromLowToHigher(intArray))));
    }

    @Test
    public void bubbleSortFromLowToHigherFalse() throws Exception { // NotEquals 2
        int[] intArray = {2, 8, 3};
        Assert.assertFalse(Arrays.equals(new int[]{2, 8, 3}, (methodsOfSorts.bubbleSortFromLowToHigher(intArray))));
    }

    @Test
    public void bubbleSortFromLowToHigherNotNull() throws Exception {
        Assert.assertNotNull(methodsOfSorts.bubbleSortFromLowToHigher(new int[]{2, 8, 3}));
    }

///////////////////////////////////////////////////////////////////  bubble sort from higher to low

    @Test
    public void bubbleSortFromHigherToLowEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertArrayEquals(new int[]{8, 3, 2}, methodsOfSorts.bubbleSortFromHigherToLow(intArray));
    }

    @Test
    public void bubbleSortFromHigherToLowEquals2() throws Exception {  // Equals 2
        int[] intArray = {2, 8, 3};
        Assert.assertEquals(Arrays.toString(new int[]{8, 3, 2}), Arrays.toString(methodsOfSorts.bubbleSortFromHigherToLow(intArray)));
    }

    @Test
    public void bubbleSortFromHigherToLowTrue() throws Exception { // Equals 3
        int[] intArray = {2, 8, 3};
        Assert.assertTrue(Arrays.equals(new int[]{8, 3, 2}, (methodsOfSorts.bubbleSortFromHigherToLow(intArray))));
    }

    @Test
    public void bubbleSortFromHigherToLowNotEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertThat(new int[]{2, 8, 3}, not(equalTo(methodsOfSorts.bubbleSortFromHigherToLow(intArray))));
    }

    @Test
    public void bubbleSortFromHigherToLowFalse() throws Exception { // Not Equals 2
        int[] intArray = {2, 8, 3};
        Assert.assertFalse(Arrays.equals(new int[]{2, 8, 3}, (methodsOfSorts.bubbleSortFromHigherToLow(intArray))));
    }

    @Test
    public void bubbleSortFromHigherToLowNotNull() throws Exception {
        Assert.assertNotNull(methodsOfSorts.bubbleSortFromHigherToLow(new int[]{2, 8, 3}));
    }

///////////////////////////////////////////////////////////////////  selection sort from low to higher

    @Test
    public void selectionSortFromLowToHigherEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertArrayEquals(new int[]{8, 3, 2}, methodsOfSorts.bubbleSortFromHigherToLow(intArray));

    }

    @Test
    public void selectionSortFromLowToHigherEquals2() throws Exception { // Equals 2
        int[] intArray = {2, 8, 3};
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 8}), Arrays.toString(methodsOfSorts.selectionSortFromLowToHigher(intArray)));
    }

    @Test
    public void selectionSortFromLowToHigherTrue() throws Exception { // Equals 3
        int[] intArray = {2, 8, 3};
        Assert.assertTrue(Arrays.equals(new int[]{2, 3, 8}, (methodsOfSorts.selectionSortFromLowToHigher(intArray))));
    }

    @Test
    public void selectionSortFromLowToHigherNotEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertThat(new int[]{2, 8, 3}, not(equalTo(methodsOfSorts.selectionSortFromLowToHigher(intArray))));
    }

    @Test
    public void selectionSortFromLowToHigherFalse() throws Exception { // NotEquals 2
        int[] intArray = {2, 8, 3};
        Assert.assertFalse(Arrays.equals(new int[]{2, 8, 3}, (methodsOfSorts.selectionSortFromLowToHigher(intArray))));
    }

    @Test
    public void selectionSortFromLowToHigherNotNull() throws Exception {
        Assert.assertNotNull(methodsOfSorts.selectionSortFromLowToHigher(new int[]{2, 8, 3}));
    }

//////////////////////////////////////////////////////////////////  selection sort from higher to low

    @Test
    public void selectionSortFromHigherToLowEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertArrayEquals(new int[]{8, 3, 2}, methodsOfSorts.selectionSortFromHigherToLow(intArray));
    }

    @Test
    public void selectionSortFromHigherToLowEquals2() throws Exception {  // Equals 2
        int[] intArray = {2, 8, 3};
        Assert.assertEquals(Arrays.toString(new int[]{8, 3, 2}), Arrays.toString(methodsOfSorts.selectionSortFromHigherToLow(intArray)));
    }

    @Test
    public void selectionSortFromHigherToLowTrue() throws Exception { // Equals 3
        int[] intArray = {2, 8, 3};
        Assert.assertTrue(Arrays.equals(new int[]{8, 3, 2}, (methodsOfSorts.selectionSortFromHigherToLow(intArray))));
    }

    @Test
    public void selectionSortFromHigherToLowNotEquals() throws Exception {
        int[] intArray = {2, 8, 3};
        Assert.assertThat(new int[]{2, 8, 3}, not(equalTo(methodsOfSorts.selectionSortFromHigherToLow(intArray))));
    }

    @Test
    public void selectionSortFromHigherToLowFalse() throws Exception { // Not Equals 2
        int[] intArray = {2, 8, 3};
        Assert.assertFalse(Arrays.equals(new int[]{2, 8, 3}, (methodsOfSorts.selectionSortFromHigherToLow(intArray))));
    }

    @Test
    public void selectionSortFromHigherToLowNotNull() throws Exception {
        Assert.assertNotNull(methodsOfSorts.selectionSortFromHigherToLow(new int[]{2, 8, 3}));
    }

}
package com.akotuyk.app.homework.lesson9;

import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

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

    public MethodsOfSorts methodsOfSorts = new MethodsOfSorts();

    @Test
    public void intArray() throws Exception {
        int a = 10, b = 100, c = 1;
//        Assert.assertEquals(0, methodsOfSorts.intArray(a, b, c), 0);

    }

    @Test
    public void getIntArray() throws Exception {

    }

    @Test
    public void bubbleSortFromLowToHigher() throws Exception {

    }

    @Test
    public void bubbleSortFromHigherToLow() throws Exception {

    }

    @Test
    public void selectionSortFromLowToHigher() throws Exception {

    }

    @Test
    public void selectionSortFromHigherToLow() throws Exception {

    }

}
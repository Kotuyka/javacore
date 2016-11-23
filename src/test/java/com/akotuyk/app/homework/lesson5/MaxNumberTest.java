package com.akotuyk.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    public MaxNumber maxNumber = new MaxNumber();

    @Test
    public void compareNumbersTrueEquals() throws Exception {
        double number1 = 8, number2 = 8;
        Assert.assertFalse(maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersTrue() throws Exception {
        double number1 = 8, number2 = 6;
        Assert.assertTrue(maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersFalse() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertFalse(maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersNotNull() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertNotNull(maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersSameTrue() throws Exception {
        double number1 = 8, number2 = 6;
        Assert.assertSame(true, maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersSameFalse() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertSame(false, maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersNotSameFalse() throws Exception {
        double number1 = 8, number2 = 6;
        Assert.assertNotSame(false, maxNumber.compareNumbers(number1, number2));}
    @Test
    public void compareNumbersNotSameTrue() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertNotSame(true, maxNumber.compareNumbers(number1, number2));}

}
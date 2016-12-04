package com.akotuyk.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class MaxNumberTest {

    @Before
    public void beforeMethod() {
        System.out.println("Test start");
    }

    @After
    public void afterMethod() {
        System.out.println("Test finished");
    }

    public MaxNumber maxNumber = new MaxNumber();

    @Test
    public void compareNumbersTrueEquals() throws Exception {
        double number1 = 8, number2 = 8;
        Assert.assertFalse(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersTrue() throws Exception {
        double number1 = 8, number2 = 6;
        Assert.assertTrue(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersFalse() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertFalse(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersNotNull() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertNotNull(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersSameTrue() throws Exception {
        double number1 = 8, number2 = 6;
        Assert.assertSame(true, maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersSameFalse() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertSame(false, maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersNotSameFalse() throws Exception {
        double number1 = 8, number2 = 6;
        Assert.assertNotSame(false, maxNumber.compareNumbers(number1, number2));
    }

    @Test
    public void compareNumbersNotSameTrue() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertNotSame(true, maxNumber.compareNumbers(number1, number2));
    }

    @Test
    @Ignore("Not ready yet")
    public void compareNumbersIgnore() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertNotSame(true, maxNumber.compareNumbers(number1, number2));
    }

    @Test(timeout = 1000)
    public void compareNumbersWithTimeout() throws Exception {
        double number1 = 6, number2 = 8;
        Assert.assertNotSame(true, maxNumber.compareNumbers(number1, number2));
    }

    // ****************************************************************************
    // пошли тесты CSV, для урока №6

    @Test
    @FileParameters(value = "src/resources/lesson6/maxnumberscsv/MaxNumbersTrue.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxNumberCsvTrueTest(double number1, double number2) {
        Assert.assertTrue(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxnumberscsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxNumberCsvFalseTest(double number1, double number2) {
        Assert.assertFalse(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxnumberscsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxNumberCsvNotNullTest(double number1, double number2) {
        Assert.assertNotNull(maxNumber.compareNumbers(number1, number2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxnumberscsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxNumberCsvNotSameTest(double number1, double number2) {
        Assert.assertNotSame(true, maxNumber.compareNumbers(number1, number2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxnumberscsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxNumberCsvSameTest(double number1, double number2) {
        Assert.assertSame(false, maxNumber.compareNumbers(number1, number2));
    }
}
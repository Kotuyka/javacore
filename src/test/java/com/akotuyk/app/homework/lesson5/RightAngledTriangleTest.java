package com.akotuyk.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class RightAngledTriangleTest {

    public RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();

    @Before
    public void beforeMethod() {
        System.out.println("Test start");
    }

    @After
    public void afterMethod() {
        System.out.println("Test finished");
    }

    @Test
    public void calculatorTrue() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertTrue(rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    public void calculatorFalse() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertFalse(rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    public void calculatorNotNull() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertNotNull(rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    public void calculatorSameTrue() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertSame(true, rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    public void calculatorSameFalse() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertSame(false, rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    public void calculatorNotSameFalse() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertNotSame(false, rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    public void calculatorNotSameTrue() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertNotSame(true, rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    @Ignore("Not ready yet")
    public void calculatorIgnore() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertNotSame(true, rightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test(timeout = 1000)
    public void calculatorWithTimeout() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertNotSame(true, rightAngledTriangle.calculator(side1, side2, side3));
    }

    // ****************************************************************************
    // пошли тесты CSV, для урока №6

    @Test
    @FileParameters(value = "src/resources/lesson6/rightangledtrianglecsv/RightAngledTriangleTrue.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleCsvTrueTest(double side1, double side2, double side3) {
        Assert.assertTrue(RightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/rightangledtrianglecsv/RightAngledTriangleFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleCsvFalseTest(double side1, double side2, double side3) {
        Assert.assertFalse(RightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/rightangledtrianglecsv/RightAngledTriangleFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleCsvNotNullTest(double side1, double side2, double side3) {
        Assert.assertNotNull(RightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/rightangledtrianglecsv/RightAngledTriangleFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleCsvNotSameTest(double side1, double side2, double side3) {
        Assert.assertNotSame(true, RightAngledTriangle.calculator(side1, side2, side3));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/rightangledtrianglecsv/RightAngledTriangleFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleCsvSameTest(double side1, double side2, double side3) {
        Assert.assertSame(false, RightAngledTriangle.calculator(side1, side2, side3));
    }
}
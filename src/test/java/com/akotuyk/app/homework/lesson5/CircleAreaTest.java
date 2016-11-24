package com.akotuyk.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class CircleAreaTest {

    @Before
    public void beforeMethod() {
        System.out.println("Test start"); }

    @After
    public void afterMethod() {
        System.out.println("Test finished"); }

    public CircleArea circleArea = new CircleArea();

    @Test
    public void calculateEquals() throws Exception {
        double PI = 3.14, radius = 5;
        Assert.assertEquals(78.5, circleArea.calculate(PI, radius),0);}
    @Test
    public void calculateEqualsWithDelta() throws Exception {
        double PI = 3.14, radius = 5;
        Assert.assertEquals(79, circleArea.calculate(PI, radius),0.5);}
    @Test
    public void calculateEqualsMinus() throws Exception {
        double PI = 3.14, radius = -5;
        Assert.assertEquals(78.5, circleArea.calculate(PI, radius),0);}
    @Test
    public void calculateEqualsZero() throws Exception {
        double PI = 3.14, radius = 0;
        Assert.assertEquals(0, circleArea.calculate(PI, radius),0);}
    @Test
    public void calculateNotEquals() throws Exception {
        double PI = 3.14, radius = 5;
        Assert.assertNotEquals(78, circleArea.calculate(PI, radius),0);}
    @Test
    public void calculateNotEqualsWithDelta() throws Exception {
        double PI = 3.14, radius = 5;
        Assert.assertNotEquals(80, circleArea.calculate(PI, radius),0.5);}
    @Test
    public void calculateNotEqualsMinus() throws Exception {
        double PI = 3.14, radius = -5;
        Assert.assertNotEquals(-78.5, circleArea.calculate(PI, radius),0);}
    @Test
    public void calculateNotEqualsZero() throws Exception {
        double PI = 3.14, radius = 0;
        Assert.assertNotEquals(1, circleArea.calculate(PI, radius));}


    @Test
    @Ignore("Not ready yet")
    public void calculateFotIgnore() throws Exception {
        double PI = 3.14, radius = 0;
        Assert.assertNotEquals(1, circleArea.calculate(PI, radius));}

    @Test(timeout = 1000)
    public void calculateWithTimeout() throws Exception {
        double PI = 3.14, radius = 0;
        Assert.assertNotEquals(1, circleArea.calculate(PI, radius));}

    // ****************************************************************************
    // пошли тесты CSV, для урока №6

    @Test
    @FileParameters(value = "src/resources/lesson6/CircleAreaCsv/CircleAreaEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void CircleAreaCsvEqualsTest(double PI, double side1, double expo) {
        Assert.assertEquals(expo, CircleArea.calculate(PI,side1), 0);}
    @Test
    @FileParameters(value = "src/resources/lesson6/CircleAreaCsv/CircleAreaNotEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void CircleAreaCsvNotEqualsTest(double PI, double side1, double expo) {
        Assert.assertNotEquals(expo, CircleArea.calculate(PI,side1));}
    @Test
    @FileParameters(value = "src/resources/lesson6/CircleAreaCsv/CircleAreaNotSame.csv", mapper = CsvWithHeaderMapper.class)
    public void CircleAreaCsvNotSameTest(double PI, double side1, double expo) {
        Assert.assertNotSame(expo, CircleArea.calculate(PI,side1));}
    @Test
    @FileParameters(value = "src/resources/lesson6/CircleAreaCsv/CircleAreaNotNull.csv", mapper = CsvWithHeaderMapper.class)
    public void CircleAreaCsvNotNullTest(double PI, double side1, double expo) {
        Assert.assertNotNull(CircleArea.calculate(PI,side1));}
}
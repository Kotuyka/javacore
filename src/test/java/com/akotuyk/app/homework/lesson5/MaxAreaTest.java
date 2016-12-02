package com.akotuyk.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class MaxAreaTest {
    public MaxArea maxArea = new MaxArea();

    @Before
    public void beforeMethod() {
        System.out.println("Test start");
    }

    @After
    public void afterMethod() {
        System.out.println("Test finished");
    }

    @Test
    public void setArea1Equals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(78.5, maxArea.setArea1(PI, number), 0);
    }

    @Test
    public void setArea1EqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(79, maxArea.setArea1(PI, number), 0.5);
    }

    @Test
    public void setArea1NotEquals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(79, maxArea.setArea1(PI, number));
    }

    @Test
    public void setArea1NotEqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(77, maxArea.setArea1(PI, number), 0.5);
    }

    @Test
    public void setArea1EqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertEquals(78.5, maxArea.setArea1(PI, number), 0);
    }

    @Test
    public void setArea1NotEqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(-78.5, maxArea.setArea1(PI, number));
    }

    @Test
    public void setArea1EqualsZero() throws Exception {
        double PI = 3.14, number = 0;
        Assert.assertEquals(0, maxArea.setArea1(PI, number), 0);
    }

    @Test
    public void setArea1NotEqualsZero() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(3.14, maxArea.setArea1(PI, number));
    }

    @Test
    public void setArea1NotNull() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotNull(maxArea.setArea1(PI, number));
    }

    @Test
    public void setArea2Equals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(78.5, maxArea.setArea2(PI, number), 0);
    }

    @Test
    public void setArea2EqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(79, maxArea.setArea2(PI, number), 0.5);
    }

    @Test
    public void setArea2NotEquals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(79, maxArea.setArea2(PI, number));
    }

    @Test
    public void setArea2NotEqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(77, maxArea.setArea2(PI, number), 0.5);
    }

    @Test
    public void setArea2EqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertEquals(78.5, maxArea.setArea2(PI, number), 0);
    }

    @Test
    public void setArea2NotEqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(-78.5, maxArea.setArea2(PI, number));
    }

    @Test
    public void setArea2EqualsZero() throws Exception {
        double PI = 3.14, number = 0;
        Assert.assertEquals(0, maxArea.setArea2(PI, number), 0);
    }

    @Test
    public void setArea2NotEqualsZero() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(3.14, maxArea.setArea2(PI, number));
    }

    @Test
    public void setArea2NotNull() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotNull(maxArea.setArea2(PI, number));
    }

    @Test
    public void compareAreasTrue() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertTrue(maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasFalse() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertFalse(maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasFalse2() throws Exception {
        double area1 = 4;
        double area2 = 4;
        Assert.assertFalse(maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasNotNull() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertNotNull(maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasSameTrue() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertSame(true, maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasSameFalse() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertSame(false, maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasNotSameFalse() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertNotSame(false, maxArea.compareAreas(area1, area2));
    }

    @Test
    public void compareAreasNotSameTrue() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertNotSame(true, maxArea.compareAreas(area1, area2));
    }

    @Test
    @Ignore("Not ready yet")
    public void compareAreasNotSameTrue1() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertNotSame(true, maxArea.compareAreas(area1, area2));
    }

    @Test(timeout = 1000)
    public void compareAreasNotSameTrue2() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertNotSame(true, maxArea.compareAreas(area1, area2));
    }

    // ****************************************************************************
    // пошли тесты CSV, для урока №6

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadiusCsvEqualsTest(double PI, double radius, double expo) {
        Assert.assertEquals(expo, MaxArea.setArea1(PI, radius), 0);
        ;
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusNotEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadiusCsvNotEqualsTest(double PI, double radius, double expo) {
        Assert.assertNotEquals(expo, MaxArea.setArea1(PI, radius), 0);
        ;
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadiusCsvNotNullTest(double PI, double radius, double expo) {
        Assert.assertNotNull(MaxArea.setArea1(PI, radius));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadiusCsvNotSameTest(double PI, double radius, double expo) {
        Assert.assertNotSame(expo, MaxArea.setArea1(PI, radius));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadius2CsvEqualsTest(double PI, double radius, double expo) {
        Assert.assertEquals(expo, MaxArea.setArea2(PI, radius), 0);
        ;
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusNotEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadius2CsvNotEqualsTest(double PI, double radius, double expo) {
        Assert.assertNotEquals(expo, MaxArea.setArea2(PI, radius), 0);
        ;
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadius2CsvNotNullTest(double PI, double radius, double expo) {
        Assert.assertNotNull(MaxArea.setArea2(PI, radius));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaRadiusEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaRadius2CsvNotSameTest(double PI, double radius, double expo) {
        Assert.assertNotSame(expo, MaxArea.setArea2(PI, radius));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxNumbersTrue.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvEqualsTest(double area1, double area2) {
        Assert.assertEquals(true, MaxArea.compareAreas(area1, area2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxAreaNotEquals.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvNotEqualsTest(double area1, double area2) {
        Assert.assertNotEquals(false, MaxArea.compareAreas(area1, area2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxNumbersTrue.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvTrueTest(double area1, double area2) {
        Assert.assertTrue(MaxArea.compareAreas(area1, area2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvFalseTest(double area1, double area2) {
        Assert.assertFalse(MaxArea.compareAreas(area1, area2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvNotNullTest(double area1, double area2) {
        Assert.assertNotNull(MaxArea.compareAreas(area1, area2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvNotSameTest(double area1, double area2) {
        Assert.assertNotSame(true, MaxArea.compareAreas(area1, area2));
    }

    @Test
    @FileParameters(value = "src/resources/lesson6/maxareacsv/MaxNumbersFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void MaxAreaCsvSameTest(double area1, double area2) {
        Assert.assertSame(false, MaxArea.compareAreas(area1, area2));
    }

}
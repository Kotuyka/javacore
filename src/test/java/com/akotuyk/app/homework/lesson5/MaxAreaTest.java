package com.akotuyk.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MaxAreaTest {
    public MaxArea maxArea = new MaxArea();

    @Test
    public void setArea1Equals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(78.5, maxArea.setArea1(PI, number), 0);}
    @Test
    public void setArea1EqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(79, maxArea.setArea1(PI, number), 0.5);}
    @Test
    public void setArea1NotEquals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(79, maxArea.setArea1(PI, number));}
    @Test
    public void setArea1NotEqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(77, maxArea.setArea1(PI, number), 0.5);}
    @Test
    public void setArea1EqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertEquals(78.5, maxArea.setArea1(PI, number), 0);}
    @Test
    public void setArea1NotEqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(-78.5, maxArea.setArea1(PI, number));}
    @Test
    public void setArea1EqualsZero() throws Exception {
        double PI = 3.14, number = 0;
        Assert.assertEquals(0, maxArea.setArea1(PI, number), 0);}
    @Test
    public void setArea1NotEqualsZero() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(3.14, maxArea.setArea1(PI, number));}
    @Test
    public void setArea1NotNull() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotNull(maxArea.setArea1(PI, number));}

    @Test
    public void setArea2Equals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(78.5, maxArea.setArea2(PI, number), 0);}
    @Test
    public void setArea2EqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertEquals(79, maxArea.setArea2(PI, number), 0.5);}
    @Test
    public void setArea2NotEquals() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(79, maxArea.setArea2(PI, number));}
    @Test
    public void setArea2NotEqualsWithDelta() throws Exception {
        double PI = 3.14, number = 5;
        Assert.assertNotEquals(77, maxArea.setArea2(PI, number), 0.5);}
    @Test
    public void setArea2EqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertEquals(78.5, maxArea.setArea2(PI, number), 0);}
    @Test
    public void setArea2NotEqualsMinus() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(-78.5, maxArea.setArea2(PI, number));}
    @Test
    public void setArea2EqualsZero() throws Exception {
        double PI = 3.14, number = 0;
        Assert.assertEquals(0, maxArea.setArea2(PI, number), 0);}
    @Test
    public void setArea2NotEqualsZero() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotEquals(3.14, maxArea.setArea2(PI, number));}
    @Test
    public void setArea2NotNull() throws Exception {
        double PI = 3.14, number = -5;
        Assert.assertNotNull(maxArea.setArea2(PI, number));}

    @Test
    public void compareAreasTrue() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertTrue(maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasFalse() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertFalse(maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasFalse2() throws Exception {
        double area1 = 4;
        double area2 = 4;
        Assert.assertFalse(maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasNotNull() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertNotNull(maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasSameTrue() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertSame(true, maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasSameFalse() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertSame(false, maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasNotSameFalse() throws Exception {
        double area1 = 5;
        double area2 = 4;
        Assert.assertNotSame(false, maxArea.compareAreas(area1, area2));}
    @Test
    public void compareAreasNotSameTrue() throws Exception {
        double area1 = 4;
        double area2 = 5;
        Assert.assertNotSame(true, maxArea.compareAreas(area1, area2));}
}
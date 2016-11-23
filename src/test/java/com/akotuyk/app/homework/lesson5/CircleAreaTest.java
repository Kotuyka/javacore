package com.akotuyk.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class CircleAreaTest {

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

}
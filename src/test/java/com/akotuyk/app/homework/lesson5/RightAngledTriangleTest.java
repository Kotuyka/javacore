package java.com.akotuyk.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class RightAngledTriangleTest {
    public RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();

    @Test
    public void calculatorTrue() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertTrue(rightAngledTriangle.calculator(side1, side2, side3));}
    @Test
    public void calculatorFalse() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertFalse(rightAngledTriangle.calculator(side1, side2, side3));}
    @Test
    public void calculatorNotNull() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertNotNull(rightAngledTriangle.calculator(side1, side2, side3));}
    @Test
    public void calculatorSameTrue() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertSame(true, rightAngledTriangle.calculator(side1, side2, side3));}
    @Test
    public void calculatorSameFalse() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertSame(false, rightAngledTriangle.calculator(side1, side2, side3));}
    @Test
    public void calculatorNotSameFalse() throws Exception {
        double side1 = 6, side2 = 8, side3 = 10;
        Assert.assertNotSame(false, rightAngledTriangle.calculator(side1, side2, side3));}
    @Test
    public void calculatorNotSameTrue() throws Exception {
        double side1 = 8, side2 = 8, side3 = 10;
        Assert.assertNotSame(true, rightAngledTriangle.calculator(side1, side2, side3));}
}
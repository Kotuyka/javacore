package java.com.akotuyk.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {

    public EvenOrOdd evenOrOdd = new EvenOrOdd();

    @Test
    public void isEvenEqualsFalse() throws Exception {
        double number = 5;
        Assert.assertEquals(false, evenOrOdd.isEven(number));}
    @Test
    public void isEvenEqualsTrue() throws Exception {
        double number = 4;
        Assert.assertEquals(true, evenOrOdd.isEven(number));}
    @Test
    public void isEvenEqualsTrueMinus() throws Exception {
        double number = -4;
        Assert.assertEquals(true, evenOrOdd.isEven(number));}
    @Test
    public void isEvenEqualsFalseMinus() throws Exception {
        double number = -3;
        Assert.assertEquals(false, evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotEqualsTrue() throws Exception {
        double number = 5;
        Assert.assertNotEquals(true, evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotEqualsFalse() throws Exception {
        double number = 4;
        Assert.assertNotEquals(false, evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotEqualsFalseMinus() throws Exception {
        double number = -4;
        Assert.assertNotEquals(false, evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotEqualsTrueMinus() throws Exception {
        double number = -3;
        Assert.assertNotEquals(true, evenOrOdd.isEven(number));}


    @Test
    public void isEvenTrue() throws Exception {
        double number = 4;
        Assert.assertTrue(evenOrOdd.isEven(number));}
    @Test
    public void isEvenFalse() throws Exception {
        double number = 5;
        Assert.assertFalse(evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotNull() throws Exception {
        double number = 5;
        Assert.assertNotNull(evenOrOdd.isEven(number));}
    @Test
    public void isEvenSameTrue() throws Exception {
        double number = 4;
        Assert.assertSame(true, evenOrOdd.isEven(number));}
    @Test
    public void isEvenSameFalse() throws Exception {
        double number = 5;
        Assert.assertSame(false, evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotSameFalse() throws Exception {
        double number = 4;
        Assert.assertNotSame(false, evenOrOdd.isEven(number));}
    @Test
    public void isEvenNotSameTrue() throws Exception {
        double number = 5;
        Assert.assertNotSame(true, evenOrOdd.isEven(number));}

}


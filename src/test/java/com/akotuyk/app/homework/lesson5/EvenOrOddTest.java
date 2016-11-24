package com.akotuyk.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class EvenOrOddTest {

    @Before
    public void beforeMethod() {
        System.out.println("Test start"); }

    @After
    public void afterMethod() {
        System.out.println("Test finished"); }

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

    @Test
    @Ignore("Not ready yet")
    public void isEvenForIgnore() throws Exception {
        double number = 5;
        Assert.assertNotSame(true, evenOrOdd.isEven(number));}

    @Test(timeout = 1000)
    public void isEvenWithTimeout() throws Exception {
        double number = 5;
        Assert.assertNotSame(true, evenOrOdd.isEven(number));}

    // ****************************************************************************
    // пошли тесты CSV, для урока №6

    @Test
    @FileParameters(value = "src/resources/lesson6/EvenOrOddCsv/EvenOrOddTrue.csv", mapper = CsvWithHeaderMapper.class)
    public void EvenOrOddCsvTrueTest(double number){
        Assert.assertTrue(EvenOrOdd.isEven(number));}

    @Test
    @FileParameters(value = "src/resources/lesson6/EvenOrOddCsv/EvenOrOddFalse.csv", mapper = CsvWithHeaderMapper.class)
    public void EvenOrOddCsvFalseTest(double number){
        Assert.assertFalse(EvenOrOdd.isEven(number));}

    @Test
    @FileParameters(value = "src/resources/lesson6/EvenOrOddCsv/EvenOrOddNotNull.csv", mapper = CsvWithHeaderMapper.class)
    public void EvenOrOddCsvNotNullTest(double number){
        Assert.assertNotNull(EvenOrOdd.isEven(number));}

    @Test
    @FileParameters(value = "src/resources/lesson6/EvenOrOddCsv/EvenOrOddNotSame.csv", mapper = CsvWithHeaderMapper.class)
    public void EvenOrOddCsvNotSameTest(double number){
        Assert.assertNotSame(false, EvenOrOdd.isEven(number));}

    @Test
    @FileParameters(value = "src/resources/lesson6/EvenOrOddCsv/EvenOrOddSame.csv", mapper = CsvWithHeaderMapper.class)
    public void EvenOrOddCsvSameTest(double number){
        Assert.assertSame(true, EvenOrOdd.isEven(number));}
}


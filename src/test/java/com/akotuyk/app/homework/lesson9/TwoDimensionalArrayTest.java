package com.akotuyk.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by Huly-Buly on 12.01.2017.
 */
public class TwoDimensionalArrayTest {

    TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

///////////////////////////////////////////////////////////////////  set random two dimensional array

    @Test
    public void setRandomTwoDimensionalArrayNotNull() throws Exception {
        Assert.assertNotNull(twoDimensionalArray.setRandomTwoDimensionalArray(2, 100));
    }

    @Test
    public void setRandomTwoDimensionalArrayNotEqual() throws Exception {
        Assert.assertThat(new int[][]{{5, 4, 3}, {5, 6, 7}}, not(equalTo(twoDimensionalArray.setRandomTwoDimensionalArray(2, 100))));
    }

    @Test
    public void setRandomTwoDimensionalArrayFalse() throws Exception { // NotEquals 2
        Assert.assertFalse(Arrays.equals(new int[][]{{5, 4, 3}, {5, 6, 7}}, (twoDimensionalArray.setRandomTwoDimensionalArray(2, 100))));
    }

///////////////////////////////////////////////////////////////////  get int two dimensional array

    @Test
    public void getIntTwoDimensionalArrayNotNull() throws Exception {
        twoDimensionalArray.setRandomTwoDimensionalArray(2, 100);
        Assert.assertNotNull(twoDimensionalArray.getIntTwoDimensionalArray());
    }

///////////////////////////////////////////////////////////////////  get max element of int two dimensional array

    @Test
    public void getMaxElementOfIntTwoDimensionalArrayEquals() throws Exception {
        int[][] intArray = {{990, 150, 450}, {1000, 200, 500}};
        Assert.assertEquals(1000, twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(intArray));
    }

    @Test
    public void getMaxElementOfIntTwoDimensionalArrayEquals2() throws Exception { // Equals 2
        int[][] intArray = {{990, 150, 450}, {1000, 200, 500}};
        Assert.assertThat(1000, equalTo(twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(intArray)));
    }

    @Test
    public void getMaxElementOfIntTwoDimensionalArrayTrue() throws Exception {
        int[][] intArray = {{990, 150, 450}, {1000, 200, 500}};
        Assert.assertTrue(twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(intArray) > 999);
    }

    @Test
    public void getMaxElementOfIntTwoDimensionalArrayNotEquals() throws Exception {
        int[][] intArray = {{990, 150, 450}, {1000, 200, 500}};
        Assert.assertThat(990, not(equalTo(twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(intArray))));
    }

    @Test
    public void getMaxElementOfIntTwoDimensionalArrayFalse() throws Exception {
        int[][] intArray = {{990, 150, 450}, {1000, 200, 500}};
        Assert.assertFalse(twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(intArray) < 1000);
    }

    @Test
    public void getMaxElementOfIntTwoDimensionalArrayNotNull() throws Exception {
        Assert.assertNotNull(twoDimensionalArray.getMaxElementOfIntTwoDimensionalArray(new int[][]{{990, 150, 450}, {1000, 200, 500}}));
    }

///////////////////////////////////////////////////////////////////  get max element of int two dimensional array

    @Test
    public void getRandomUniqueResultsNotNull() throws Exception {
        Assert.assertNotNull(twoDimensionalArray.getRandomUniqueResults(2, 5));
    }

    @Test
    public void getRandomUniqueResultsNotSame() throws Exception {
        Assert.assertNotSame(new int[][]{{100}, {10, 20, 30}}, twoDimensionalArray.getRandomUniqueResults(2, 3));
    }

    @Test
    public void getRandomUniqueResultsTrue() throws Exception {
        int[][] array = twoDimensionalArray.getRandomUniqueResults(2, 3);
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 100 || array[i][j] <= 0) {
                    flag++;
                }
            }
        }
        Assert.assertTrue(flag == 0);
    }

    @Test
    public void getRandomUniqueResultsFalse() throws Exception {
        int[][] array = twoDimensionalArray.getRandomUniqueResults(2, 3);
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 100 || array[i][j] <= 0) {
                    flag++;
                }
            }
        }
        Assert.assertFalse(flag > 0);
    }

}
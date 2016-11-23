package java.com.akotuyk.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Huly-Buly on 22.11.2016.
 */

@RunWith(JUnitParamsRunner.class)
public class CircleAreaTestCsv {
    @Test
    @FileParameters(value = "src/test/resources/CircleAreaCSV.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(double side1, double side2, double side3) {
        Assert.assertTrue(true, java.com.akotuyk.app.homework.lesson5.RightAngledTriangle.calculator());
    } //make sure that variables are in same order and types as in csv file

}

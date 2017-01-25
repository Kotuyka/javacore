package com.akotuyk.runners.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Huly-Buly on 20.01.2017.
 */

public class test {
    FirefoxDriver wd;
    private String baseUrl = "http://rozetka.com.ua";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "D:\\Progect\\javacore\\src\\resources\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        wd.get(baseUrl);
        WebElement element = wd.findElement(By.id("last_64"));
        wd.findElement(By.xpath("//title"));
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

package com.akotuyk.runners.homework;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Huly-Buly on 20.01.2017.
 */

public class test {
    FirefoxDriver wd;

    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        wd.get("http://www.sebuilder.com/");
        new Actions(wd).moveToElement(wd.findElement(By.id("header"))).build().perform();
        wd.get("https://www.google.com.ua/search?q=kit+center&ie=utf-8&oe=utf-8&gws_rd=cr&ei=il2CWJK7LqXp6ASvvZbgCA");
        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("html"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[4]/div/div/div/div/a"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[5]/div/div/div"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[3]/div/div/div"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.id("slim_appbar"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.id("hdtbSum"))).build().perform();
        wd.findElement(By.id("hdtbSum")).click();
        new Actions(wd).moveToElement(wd.findElement(By.id("hdtb-tls"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.id("rhscol"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("h3.r"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.id("rhscol"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.linkText("Kit Center"))).build().perform();
        wd.findElement(By.linkText("Kit Center")).click();
        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("div.sfbgg"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[3]/div/div/div/div/cite/b[2]"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[2]/div/div/div/span"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.linkText("Kit.center | DOU"))).build().perform();
        wd.findElement(By.linkText("Kit.center | DOU")).click();
        new Actions(wd).moveToElement(wd.findElement(By.id("res"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[4]/div/div/div/span"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[5]/div/div/div/div/a"))).build().perform();
        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='srg']/div[5]/div/div/div/div"))).build().perform();
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

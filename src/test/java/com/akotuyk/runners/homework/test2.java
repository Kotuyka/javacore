package com.akotuyk.runners.homework;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Huly-Buly on 20.01.2017.
 */
public class test2 {
    FirefoxDriver wd;

    @Test
    public void test() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        wd.get("http://www.sebuilder.com/");
    }
}

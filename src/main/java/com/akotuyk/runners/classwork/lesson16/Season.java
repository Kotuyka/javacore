package com.akotuyk.runners.classwork.lesson16;

/**
 * Created by Huly-Buly on 13.01.2017.
 */
public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public static void main(String args[]) {

        Season season = Season.SPRING;

        if (season == Season.SPRING)

//enum uses "==" because it compile-time checked

            season = Season.SUMMER;

        System.out.println(season);
    }
}

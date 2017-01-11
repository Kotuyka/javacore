package com.akotuyk.runners.classwork.lesson15;

/**
 * Created by Huly-Buly on 10.01.2017.
 */
public class runner {
    public static void main(String[] args) {
        Mentor mentor = new Mentor("Vasya", "KPI");
        System.out.println(mentor);

        System.out.println(mentor.lessonFinishedForOverload("I made it!"));
    }
}

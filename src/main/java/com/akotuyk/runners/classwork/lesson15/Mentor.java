package com.akotuyk.runners.classwork.lesson15;

/**
 * Created by Huly-Buly on 10.01.2017.
 */
public class Mentor extends Teacher {

    private String university;

    public Mentor(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String lessonFinished() {
        return "I overrided it";
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "university='" + university + '\'' +
                '}' + "Teacher{" +
                "name='" + getName() + '\'' +
                '}';
    }

    public String lessonFinishedForOverload(String s) {
        return "5";
    }
}

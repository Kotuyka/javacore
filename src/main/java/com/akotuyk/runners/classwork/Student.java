package com.akotuyk.runners.classwork;

/**
 * Created by Huly-Buly on 20.12.2016.
 */
public class Student extends Person {

    private String university;
    private String response = "Ehh, what was the question?";

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getResponse(String question) {
        return response;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + "\n" +
                "university='" + university + '\'' + "\n" + "question: " + response;
    }
}

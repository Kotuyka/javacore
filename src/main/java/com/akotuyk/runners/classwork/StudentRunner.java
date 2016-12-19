package com.akotuyk.runners.classwork;

import com.akotuyk.app.classwork.Student;

/**
 * Created by Huly-Buly on 15.12.2016.
 */
public class StudentRunner {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Mishka");
        student1.setAge(25);
        student1.setGender("Male");

        Student student2 = new Student();
        student2.setName("Marishka");
        student2.setAge(46);
        student2.setGender("FeMale");

        System.out.println(student1.toString ());
        System.out.println(student2.toString ());
    }


}

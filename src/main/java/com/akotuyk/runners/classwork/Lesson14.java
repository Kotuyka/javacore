package com.akotuyk.runners.classwork;

/**
 * Created by Huly-Buly on 20.12.2016.
 */
public class Lesson14 {

    public static void main(String[] args) {
        Student student1 = new Student("Max", "KPI");
        Student student2 = new Student("Masha", "Poplavskogo");
        Student student3 = new Student("Taras", "KNEY");
        Student student4 = new Student("Dasha", "Bogomoltsa");

        StringBuilder builder1 = new StringBuilder();
        String ineTheEnd1 = builder1.append(student1).append(student2).append(student3).append(student4).toString();
        System.out.println(ineTheEnd1);


        Person student5 = new Student("Max", "KPI");
        Person student6 = new Student("Masha", "Poplavskogo");
        Person student7 = new Student("Taras", "KNEY");
        Person student8 = new Student("Dasha", "Bogomoltsa");

        StringBuilder builder2 = new StringBuilder();
        String ineTheEnd2 = builder2.append(student5).append(student6).append(student7).append(student8).toString();
        System.out.println(ineTheEnd2);
    }
}

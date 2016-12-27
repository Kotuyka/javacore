package com.akotuyk.runners.classwork;

/**
 * Created by Huly-Buly on 20.12.2016.
 */
public class Teacher extends Person {

    private int mark;
    private int officeNumber = 5;

    public Teacher(String name, int mark) {
        super(name);
        this.mark = mark;;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public String getNamePerson() {
        Person person = new Person(getName());
        return person.getName();
    }

}

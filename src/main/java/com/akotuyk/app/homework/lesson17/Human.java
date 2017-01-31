package com.akotuyk.app.homework.lesson17;

/**
 * Created by Huly-Buly on 26.01.2017.
 */
public class Human {

    private String name;
    private String surname;
    private String department;
    private String position;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String role) {
        this.department = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String salary) {
        this.position = salary;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return "\nName = " + getName() + "; Surname = " + getSurname() +"; Department = " + getDepartment()
                + "; Position = " + getPosition();
    }

}

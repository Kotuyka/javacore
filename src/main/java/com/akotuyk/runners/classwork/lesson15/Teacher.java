package com.akotuyk.runners.classwork.lesson15;

/**
 * Created by Huly-Buly on 10.01.2017.
 */
public class Teacher {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Teacher (String name){
        this.name = name;
    }

    public String lessonFinished(){
        return "Do not forget to make homework!";
    }

    public String lessonFinishedForOverload(){
        return "Do not forget to make homework!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        return name != null ? name.equals(teacher.name) : teacher.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
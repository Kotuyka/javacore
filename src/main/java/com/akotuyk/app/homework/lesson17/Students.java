package com.akotuyk.app.homework.lesson17;

/**
 * Created by Kotuyk A on 24.01.2017.
 */

public class Students extends Human{

    @Override
    public String toString() {
        return "\nName = " + getName() + "; Surname = " + getSurname() +"; Department = " + getDepartment() +
                "; Position = " + getPosition()+ "; Course = " + getCourse();
    }
}

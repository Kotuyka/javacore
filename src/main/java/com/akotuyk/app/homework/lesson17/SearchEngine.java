package com.akotuyk.app.homework.lesson17;

import java.util.List;

/**
 * Created by Huly-Buly on 24.01.2017.
 */
public class SearchEngine<T> {

    public boolean nameEmployeeSearch(List<Employee> t, String name) {
        for (int i = 0; i < t.size(); i++) {
            Employee tech = t.get(i);
            if (tech.getName() != null && tech.getName().contains(name)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean surnameEmployeeSearch(List<Employee> t, String surname) {
        for (int i = 0; i < t.size(); i++) {
            Employee tech = t.get(i);
            if (tech.getSurname() != null && tech.getSurname().contains(surname)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean departmentEmployeeSearch(List<Employee> t, String department) {
        for (int i = 0; i < t.size(); i++) {
            Employee tech = t.get(i);
            if (tech.getDepartment() != null && tech.getDepartment().contains(department)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean nameStudentsSearch(List<Students> t, String name) {
        for (int i = 0; i < t.size(); i++) {
            Students tech = t.get(i);
            if (tech.getName() != null && tech.getName().contains(name)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean surnameStudentsSearch(List<Students> t, String surname) {
        for (int i = 0; i < t.size(); i++) {
            Students tech = t.get(i);
            if (tech.getSurname() != null && tech.getSurname().contains(surname)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean departmentStudentsSearch(List<Students> t, String department) {
        for (int i = 0; i < t.size(); i++) {
            Students tech = t.get(i);
            if (tech.getDepartment() != null && tech.getDepartment().contains(department)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }

}

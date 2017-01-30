package com.akotuyk.app.homework.lesson17;

import java.util.List;

/**
 * Created by Huly-Buly on 24.01.2017.
 */
public class SearchEngine<T> {

    public <T extends Human> boolean uniqSearch(List<T> t, String subOfSearch, String search) {
        if (t.get(0) instanceof Employee) {
            System.out.println("Понял что сотрудники");
            for (int i = 0; i < t.size(); i++) {
                if (subOfSearch == "name") {
                    if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "surname") {
                    if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "department") {
                    if (t.get(i).getDepartment() != null && t.get(i).getDepartment().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
            }
            return false;
        }
        if (t.get(0) instanceof Students) {
            System.out.println("Понял что студент");
            for (int i = 0; i < t.size(); i++) {
                if (subOfSearch == "name") {
                    if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "surname") {
                    if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "department") {
                    if (t.get(i).getDepartment() != null && t.get(i).getDepartment().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "department") {
                    if (t.get(i).getDepartment() != null && t.get(i).getDepartment().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "course") {
                    if (t.get(i).getCourse() != null && t.get(i).getCourse().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
            }
            return false;
        }
        System.out.println("Решил что ни студент ни работник!");
        return false;
    }

    public <T extends Human> boolean generalSearch(List<T> t, String search) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                System.out.println(t.get(i));
                return true;
            }
            if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                System.out.println(t.get(i));
                return true;
            }
        }
        return false;
    }


//    public boolean nameEmployeeSearch(List<Employee> t, String name) {
//        for (int i = 0; i < t.size(); i++) {
//            Employee tech = t.get(i);
//            if (tech.getName() != null && tech.getName().contains(name)) {
//                System.out.println(t.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean surnameEmployeeSearch(List<Employee> t, String surname) {
//        for (int i = 0; i < t.size(); i++) {
//            Employee tech = t.get(i);
//            if (tech.getSurname() != null && tech.getSurname().contains(surname)) {
//                System.out.println(t.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean departmentEmployeeSearch(List<Employee> t, String department) {
//        for (int i = 0; i < t.size(); i++) {
//            Employee tech = t.get(i);
//            if (tech.getDepartment() != null && tech.getDepartment().contains(department)) {
//                System.out.println(t.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean nameStudentsSearch(List<Students> t, String name) {
//        for (int i = 0; i < t.size(); i++) {
//            Students tech = t.get(i);
//            if (tech.getName() != null && tech.getName().contains(name)) {
//                System.out.println(t.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean surnameStudentsSearch(List<Students> t, String surname) {
//        for (int i = 0; i < t.size(); i++) {
//            Students tech = t.get(i);
//            if (tech.getSurname() != null && tech.getSurname().contains(surname)) {
//                System.out.println(t.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean departmentStudentsSearch(List<Students> t, String department) {
//        for (int i = 0; i < t.size(); i++) {
//            Students tech = t.get(i);
//            if (tech.getDepartment() != null && tech.getDepartment().contains(department)) {
//                System.out.println(t.get(i));
//                return true;
//            }
//        }
//        return false;
//    }

}

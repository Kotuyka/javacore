package com.akotuyk.app.homework.lesson17;

import java.util.List;

/**
 * Created by Huly-Buly on 24.01.2017.
 */
public class SearchEngine<T> {

    public <T extends Human> boolean uniqueSearch(List<T> t, String subOfSearch, String search) {
        if (t.get(0) instanceof Employee) {               // check if T objects in List extends Employee class
            for (int i = 0; i < t.size(); i++) {
                if (subOfSearch == "name") {              // check for the place of searches (we are searching in names)
                    if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "surname") {           // check for the place of searches (we are searching in surnames)
                    if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "department") {        // check for the place of searches (we are searching in departments)
                    if (t.get(i).getDepartment() != null && t.get(i).getDepartment().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
            }
            return false;
        }
        if (t.get(0) instanceof Students) {              // check if T objects in List extends Students class
            for (int i = 0; i < t.size(); i++) {
                if (subOfSearch == "name") {             // check for the place of searches (we are searching in names)
                    if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "surname") {        // check for the place of searches (we are searching in surnames)
                    if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "department") {       // check for the place of searches (we are searching in departments)
                    if (t.get(i).getDepartment() != null && t.get(i).getDepartment().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
                if (subOfSearch == "course") {          // check for the place of searches (we are searching in courses)
                    if (t.get(i).getCourse() != null && t.get(i).getCourse().contains(search)) {
                        System.out.println(t.get(i));
                        return true;
                    }
                }
            }
            return false;
        }
        return false;                                   // if method think he got not Students or Employee class
    }

    public <T extends Human> boolean generalSearch(List<T> t, String search) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                System.out.println("Name = " + t.get(i).getName()+ "; Surname = "+ t.get(i).getSurname()+ ".");
                return true;
            }
            if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                System.out.println("Name = " + t.get(i).getName()+ "; Surname = "+ t.get(i).getSurname()+ ".");
                return true;
            }
        }
        return false;                 // if there is no searchable Surname or Name in List<T> t
    }
}

package com.akotuyk.app.homework.lesson17;

import java.util.List;

/**
 * Created by Kotuyk A on 24.01.2017.
 */

public class SearchEngine<T> {

    public <T extends Human> boolean uniqueSearch(List<T> t, String subOfSearch, String search) {
        for (int i = 0; i < t.size(); i++) {
            if (subOfSearch.equals("name")) {     // check for the place of searches (we are searching in names)
                if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                    System.out.println(t.get(i));
                    return true;
                }
            }
            if (subOfSearch.equals("surname")) {     // check for the place of searches (we are searching in surnames)
                if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                    System.out.println(t.get(i));
                    return true;
                }
            }
            if (subOfSearch.equals("department")) {  // check for the place of searches (we are searching in departments)
                if (t.get(i).getDepartment() != null && t.get(i).getDepartment().contains(search)) {
                    System.out.println(t.get(i));
                    return true;
                }
            }
            if (subOfSearch.equals("course") & t.get(0) instanceof Students) {  // check for the place of searches (we are searching in courses) and the class
                if (t.get(i).getCourse() != null && t.get(i).getCourse().contains(search)) {
                    System.out.println(t.get(i));
                    return true;
                }
            }
        }
        return false;     // if method think there is no suitable students or employees
    }

    public <T extends Human> boolean generalSearch(List<T> t, String search) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSurname() != null && t.get(i).getSurname().contains(search)) {
                System.out.println("Name = " + t.get(i).getName() + "; Surname = " + t.get(i).getSurname() + ".");
                return true;
            }
            if (t.get(i).getName() != null && t.get(i).getName().contains(search)) {
                System.out.println("Name = " + t.get(i).getName() + "; Surname = " + t.get(i).getSurname() + ".");
                return true;
            }
        }
        return false;                 // if there is no searchable Surname or Name in List<T> t
    }
}

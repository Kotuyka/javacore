package com.akotuyk.app.homework.lesson17;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huly-Buly on 02.02.2017.
 */

public class SearchEngineTest {

    SearchEngine<Employee> searchEngineEmployee = new SearchEngine<>();
    SearchEngine<Students> searchEngineStudents = new SearchEngine<>();

    @Test
    public void uniqueSearchEmployee1() throws Exception {
        String search = "egov";
        String subOfSearch = "surname";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertEquals(true, searchEngineEmployee.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchEmployee2() throws Exception {
        String search = "egov";
        String subOfSearch = "surname";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertTrue(searchEngineEmployee.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchEmployee3() throws Exception {
        String search = "egoz";
        String subOfSearch = "surname";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertNotEquals(true, searchEngineEmployee.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchEmployee4() throws Exception {
        String search = "egoz";
        String subOfSearch = "surname";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertFalse(searchEngineEmployee.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchEmployee5() throws Exception {
        String search = "egoz";
        String subOfSearch = "surname";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertNotNull(searchEngineEmployee.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchStudents1() throws Exception {
        String search = "egov";
        String subOfSearch = "surname";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertEquals(true, searchEngineStudents.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchStudents2() throws Exception {
        String search = "egov";
        String subOfSearch = "surname";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertTrue(searchEngineStudents.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchStudents3() throws Exception {
        String search = "egoz";
        String subOfSearch = "surname";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertNotEquals(true, searchEngineStudents.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchStudents4() throws Exception {
        String search = "egoz";
        String subOfSearch = "surname";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertFalse(searchEngineStudents.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void uniqueSearchStudents5() throws Exception {
        String search = "egoz";
        String subOfSearch = "surname";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertNotNull(searchEngineStudents.uniqueSearch(empList, subOfSearch, search));
    }

    @Test
    public void generalSearchEmployee1() throws Exception {
        String search = "egov";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertEquals(true, searchEngineEmployee.generalSearch(empList, search));
    }

    @Test
    public void generalSearchEmployee2() throws Exception {
        String search = "egov";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertTrue(searchEngineEmployee.generalSearch(empList, search));
    }

    @Test
    public void generalSearchEmployee3() throws Exception {
        String search = "egoz";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertNotEquals(true, searchEngineEmployee.generalSearch(empList, search));
    }

    @Test
    public void generalSearchEmployee4() throws Exception {
        String search = "egoz";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertFalse(searchEngineEmployee.generalSearch(empList, search));
    }

    @Test
    public void generalSearchEmployee5() throws Exception {
        String search = "egoz";
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        empList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        empList.add(emp2);
        Assert.assertNotNull(searchEngineEmployee.generalSearch(empList, search));
    }

    @Test
    public void generalSearchStudents1() throws Exception {
        String search = "egov";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertEquals(true, searchEngineStudents.generalSearch(empList, search));
    }

    @Test
    public void generalSearchStudents2() throws Exception {
        String search = "egov";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertTrue(searchEngineStudents.generalSearch(empList, search));
    }

    @Test
    public void generalSearchStudents3() throws Exception {
        String search = "egoz";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertNotEquals(true, searchEngineStudents.generalSearch(empList, search));
    }

    @Test
    public void generalSearchStudents4() throws Exception {
        String search = "egoz";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertFalse(searchEngineStudents.generalSearch(empList, search));
    }

    @Test
    public void generalSearchStudents5() throws Exception {
        String search = "egoz";
        List<Students> empList = new ArrayList<>();
        Students emp1 = new Students();
        emp1.setName("Ivan");
        emp1.setSurname("Ivanov");
        emp1.setDepartment("finance");
        emp1.setPosition("Head of department");
        emp1.setCourse("3");
        empList.add(emp1);
        Students emp2 = new Students();
        emp2.setName("Olga");
        emp2.setSurname("Olegovna");
        emp2.setDepartment("prostitute");
        emp2.setPosition("professor");
        emp2.setCourse("5");
        empList.add(emp2);
        Assert.assertNotNull(searchEngineStudents.generalSearch(empList, search));
    }


}
package com.akotuyk.app.homework.lesson17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Huly-Buly on 02.02.2017.
 */
public class HumanTest {

    private Human employee = new Employee();
    private Human students = new Students();


    @Before
    public void setUp() throws Exception {
        this.employee.setName("Ivan");
        this.employee.setSurname("Ivanov");
        this.employee.setDepartment("finance");
        this.employee.setPosition("Head of department");

        this.students.setName("Olga");
        this.students.setSurname("Olegovna");
        this.students.setDepartment("prostitute");
        this.students.setPosition("professor");
        this.students.setCourse("3");
    }

    @Test
    public void getNameEmployee() throws Exception {
        Assert.assertEquals("Ivan", employee.getName());
    }

    @Test
    public void getNameStudents() throws Exception {
        Assert.assertEquals("Olga", students.getName());
    }

    @Test
    public void setNameEmployee() throws Exception {
        employee.setName("Francisco");
        Assert.assertEquals("Francisco", employee.getName());
    }

    @Test
    public void setNameStudents() throws Exception {
        students.setName("Garsia");
        Assert.assertEquals("Garsia", students.getName());
    }

    @Test
    public void getSurnameEmployee() throws Exception {
        Assert.assertEquals("Ivanov", employee.getSurname());
    }

    @Test
    public void getSurnameStudents() throws Exception {
        Assert.assertEquals("Olegovna", students.getSurname());
    }

    @Test
    public void setSurnameEmployee() throws Exception {
        employee.setSurname("Iriska");
        Assert.assertEquals("Iriska", employee.getSurname());
    }

    @Test
    public void setSurnameStudents() throws Exception {
        students.setSurname("Vajna");
        Assert.assertEquals("Vajna", students.getSurname());
    }

    @Test
    public void getDepartmentEmployee() throws Exception {
        Assert.assertEquals("finance", employee.getDepartment());
    }

    @Test
    public void getDepartmentStudents() throws Exception {
        Assert.assertEquals("prostitute", students.getDepartment());
    }

    @Test
    public void setDepartmentEmployee() throws Exception {
        employee.setDepartment("Bank");
        Assert.assertEquals("Bank", employee.getDepartment());
    }

    @Test
    public void setDepartmentStudents() throws Exception {
        students.setDepartment("Master");
        Assert.assertEquals("Master", students.getDepartment());
    }

    @Test
    public void getPositionEmployee() throws Exception {
        Assert.assertEquals("Head of department", employee.getPosition());
    }

    @Test
    public void getPositionStudents() throws Exception {
        Assert.assertEquals("professor", students.getPosition());
    }

    @Test
    public void setPositionEmployee() throws Exception {
        employee.setPosition("Economist");
        Assert.assertEquals("Economist", employee.getPosition());
    }

    @Test
    public void setPositionStudents() throws Exception {
        students.setPosition("bachelor");
        Assert.assertEquals("bachelor", students.getPosition());
    }

    @Test
    public void getCourseStudents() throws Exception {
        Assert.assertEquals("3", students.getCourse());
    }

    @Test
    public void setCourseStudents() throws Exception {
        students.setCourse("5");
        Assert.assertEquals("5", students.getCourse());
    }

}
package com.akotuyk.app.homework.lesson17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 24.01.2017.
 */

public class ReadCSVWithScanner {

    private List<Employee> listEmployee;
    private List<Students> listStudents;

    public void setEmployeeCSVreader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Employee> empList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Employee emp = new Employee();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    emp.setName(data);
                else if (index == 1)
                    emp.setSurname(data);
                else if (index == 2)
                    emp.setDepartment(data);
                else if (index == 3)
                    emp.setPosition(data);
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            index = 0;
            empList.add(emp);
        }
        reader.close();
        this.listEmployee = empList;
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setStudentsCSVreader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Students> empList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Students emp = new Students();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    emp.setName(data);
                else if (index == 1)
                    emp.setSurname(data);
                else if (index == 2)
                    emp.setDepartment(data);
                else if (index == 3)
                    emp.setPosition(data);
                else if (index == 4)
                    emp.setCourse((data));
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            index = 0;
            empList.add(emp);
        }
        reader.close();
        this.listStudents = empList;
    }

    public List<Students> getListStudents() {
        return listStudents;
    }
}

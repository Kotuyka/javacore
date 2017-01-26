package com.akotuyk.runners.homework.lesson17;

import com.akotuyk.app.classwork.Student;
import com.akotuyk.app.homework.lesson17.*;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.io.IOException;

/**
 * Created by Huly-Buly on 16.01.2017.
 */

public class HomeTask17Runner {

    public static void main(String[] arg) throws IOException {
        HomeTask17Runner homeTask17Runner = new HomeTask17Runner();
//        homeTask17Runner.genericsSort();
//        homeTask17Runner.exercise3();
        homeTask17Runner.mainMenuText();

    }

    private void genericsSort() {                           // Homework exercise 1 is done
        System.out.println("We'll sort your array");
        ArraySorterGenerics<Integer> integerBox = new ArraySorterGenerics<Integer>(new Integer[]{25, 5824, 54, 685, 564});
        System.out.println(integerBox);

        ArraySorterGenerics<Double> integerBox2 = new ArraySorterGenerics<Double>(new Double[]{25.5, 5824.45, 54.52, 685.1, 564.5});
        System.out.println(integerBox2);

//        ArraySorterGenerics<String> integerBox3 = new ArraySorterGenerics<String>(new String[]{25.5, 5824.45, 54.52, 685.1, 564.5});   Все ок.Вызывает ошибку еще на этапе компиляции
//        System.out.println(integerBox3);
//
    }

//    private void exercise3() {                                                           // Homework exercise 3 is done
//        System.out.println("I'll check you string for duplicates and sort it");
//        System.out.println("I'll check you string for duplicates");
//        DuplicatesCheck DuplicatesCheck = new DuplicatesCheck();
//        DuplicatesCheck.checkForDuplicates();
//    }

    public void mainMenuText() throws IOException {
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) general search\n" +
                "(SECOND) search by employee\n" +
                "(THIRD) search by students\n" +
                "(ZERO) exit\n" +
                "(NINTH) to go back to the MAIN runner\n" +
                "What do you choose? : ");
        menu();
    }

    public void menu() throws IOException {
        Scanners scanners = new Scanners();
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanners.MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose general search.");
                    searchGeneralMenu();
                    escFunction();
                    break;
                case SECOND:
                    System.out.println("You choose an employee search.");
                    secondMenuText("Employee");
                    escFunction();
                    break;
                case THIRD:
                    System.out.println("You choose Поиск студентов.");
                    secondMenuText("Students");
                    escFunction();
                    break;
                case NINTH:
                    MainRunnerForHomeTasks mainRunnerForHomeTasks = new MainRunnerForHomeTasks();
                    mainRunnerForHomeTasks.textMenu();
                    break;
                case ZERO:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("You entered the WRONG value. Please, try again.");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please, enter correct value. You entered the WRONG VALUE. Try again.");
            menu();
        }
    }


    public void escFunction() {
        Scanners scanners = new Scanners();
        System.out.println("Do you want to out? (yes/no)");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanners.MenuScanner());
            switch (menuInput) {
                case NO:
                    mainMenuText();
                    break;
                case YES:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
                    escFunction();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Is it hard to enter a yes/no? You entered the WRONG VALUE. Correct yourself...");
            escFunction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void secondMenuText(String s) throws IOException {
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) search by name\n" +
                "(SECOND) search by surname\n" +
                "(THIRD) search by department\n" +
                "(ZERO) exit.\n" +
                "(NINTH) to go back to the MAINmenu runner.\n" +
                "What do you choose? : ");
        if (s.equals("Employee")) {
            searchEmployeeMenu();
        } else {
            searchStudentMenu();
        }

    }

    public void searchEmployeeMenu() throws IOException {
        Scanners scanners = new Scanners();
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for understanding what is in the CSV
        System.out.println(readCSVWithScanner.getListStudents());  // tech string for understanding what is in the CSV
        SearchEngine<Employee> searcher = new SearchEngine<Employee>();
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanners.MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose search by name.");
                    if (!searcher.nameEmployeeSearch(readCSVWithScanner.getListEmployee(), scanners.stringScanner())) {
                        System.out.println("There is no person with such name in employees.");
                    }
                    break;
                case SECOND:
                    System.out.println("You choose search by surname.");
                    if (!searcher.surnameEmployeeSearch(readCSVWithScanner.getListEmployee(), scanners.stringScanner())) {
                        System.out.println("There is no person with such surname in employees.");
                    }
                    break;
                case THIRD:
                    System.out.println("You choose search by department.");
                    if (!searcher.departmentEmployeeSearch(readCSVWithScanner.getListEmployee(), scanners.stringScanner())) {
                        System.out.println("There is no person with such department in employees.");
                    }
                    break;
                case NINTH:
                    menu();
                    break;
                case ZERO:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("You entered the WRONG value. Please, try again.");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please, enter correct value. You entered the WRONG VALUE. Try again.");
            menu();
        }
    }

    public void searchStudentMenu() throws IOException {
        Scanners scanners = new Scanners();
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for understanding what is in the CSV
        System.out.println(readCSVWithScanner.getListStudents());  // tech string for understanding what is in the CSV
        SearchEngine<Student> searcher = new SearchEngine<Student>();
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanners.MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose search by name.");
                    if (!searcher.nameStudentsSearch(readCSVWithScanner.getListStudents(), scanners.stringScanner())) {
                        System.out.println("There is no person with such name in students.");
                    }
                    break;
                case SECOND:
                    System.out.println("You choose search by surname.");
                    if (!searcher.surnameStudentsSearch(readCSVWithScanner.getListStudents(), scanners.stringScanner())) {
                        System.out.println("There is no person with such surname in students.");
                    }
                    break;
                case THIRD:
                    System.out.println("You choose search by department.");
                    if (!searcher.departmentStudentsSearch(readCSVWithScanner.getListStudents(), scanners.stringScanner())) {
                        System.out.println("There is no person with such department in students.");
                    }
                    break;
                case NINTH:
                    menu();
                    break;
                case ZERO:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("You entered the WRONG value. Please, try again.");
                    menu();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please, enter correct value. You entered the WRONG VALUE. Try again.");
            menu();
        }
    }

    public void searchGeneralMenu() throws IOException {
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for understanding what is in the CSV
        System.out.println(readCSVWithScanner.getListStudents());  // tech string for understanding what is in the CSV
        SearchEngine<Employee> searcherEmployee = new SearchEngine<Employee>();
        SearchEngine<Students> searcherStudents = new SearchEngine<Students>();
        System.out.println("Please enter name or surname you want to search");
        Scanners scanners = new Scanners();
        String request = scanners.stringScanner();
        if (!searcherEmployee.surnameEmployeeSearch(readCSVWithScanner.getListEmployee(), request)) {
            if (!searcherStudents.surnameStudentsSearch(readCSVWithScanner.getListStudents(), request)) {
                if (!searcherEmployee.nameEmployeeSearch(readCSVWithScanner.getListEmployee(), request)) {
                    if (!searcherStudents.nameStudentsSearch(readCSVWithScanner.getListStudents(), request)) {
                        System.out.println("There is no such person in university.");
                    }
                }
            }
        }
    }
}

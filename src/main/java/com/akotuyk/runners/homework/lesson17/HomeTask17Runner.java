package com.akotuyk.runners.homework.lesson17;

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
                "(FIRST) search by students and employee\n" +
                "(SECOND) general search\n" +
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
                    System.out.println("You chose search by students and employee.");
                    secondMenuText();
                    escFunction();
                    break;
                case SECOND:
                    System.out.println("You chose general search.");
                    searchGeneralMenu();
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

    public void secondMenuText() throws IOException {
        System.out.println("You can choose the number of next actions:\n" +
                "(FIRST) Employee search by name\n" +
                "(SECOND) Employee search by surname\n" +
                "(THIRD) Employee search by department\n" +
                "(FOURTH) Students search by name\n" +
                "(FIFTH) Students search by surname\n" +
                "(SIXTH) Students search by department\n" +
                "(SEVENTH) Students search by course\n" +
                "(ZERO) exit.\n" +
                "(NINTH) to go back to the MAINmenu runner.\n" +
                "What do you choose? : ");
        searchMenu();
    }

    public void searchMenu() throws IOException {
        Scanners scanners = new Scanners();
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
//        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for understanding what is in the Employee CSV
//        System.out.println(readCSVWithScanner.getListStudents());  // tech string for understanding what is in the Students CSV

        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(scanners.MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose search by Employee name.");
                    System.out.println("Please enter the name of employee you are looking for:");
                    SearchEngine<Employee> searcherEmployee1 = new SearchEngine<>();
                    if (!searcherEmployee1.uniqueSearch(readCSVWithScanner.getListEmployee(), "name", scanners.stringScanner())) {
                        System.out.println("There is no person with such name in employees.");
                    }
                    break;
                case SECOND:
                    System.out.println("You choose search by Employee surname.");
                    System.out.println("Please enter the surname of employee you are looking for:");
                    SearchEngine<Employee> searcherEmployee2 = new SearchEngine<>();
                    if (!searcherEmployee2.uniqueSearch(readCSVWithScanner.getListEmployee(), "surname", scanners.stringScanner())) {
                        System.out.println("There is no person with such surname in employees.");
                    }
                    break;
                case THIRD:
                    System.out.println("You choose search by Employee department.");
                    System.out.println("Please enter name of the employee department you are looking for:");
                    SearchEngine<Employee> searcherEmployee3 = new SearchEngine<>();
                    if (!searcherEmployee3.uniqueSearch(readCSVWithScanner.getListEmployee(), "department", scanners.stringScanner())) {
                        System.out.println("There is no person with such department in employees.");
                    }
                    break;
                case FOURTH:
                    System.out.println("You choose search by Students name.");
                    System.out.println("Please enter the name of students you are looking for:");
                    SearchEngine<Students> searcherStudents1 = new SearchEngine<>();
                    if (!searcherStudents1.uniqueSearch(readCSVWithScanner.getListStudents(), "name", scanners.stringScanner())) {
                        System.out.println("There is no person with such name in students.");
                    }
                    break;
                case FIFTH:
                    System.out.println("You choose search by Students surname.");
                    System.out.println("Please enter the surname of students you are looking for:");
                    SearchEngine<Students> searcherStudents2 = new SearchEngine<>();
                    if (!searcherStudents2.uniqueSearch(readCSVWithScanner.getListStudents(), "surname", scanners.stringScanner())) {
                        System.out.println("There is no person with such surname in students.");
                    }
                    break;
                case SIXTH:
                    System.out.println("You choose search by Students department.");
                    System.out.println("Please enter name of the students department you are looking for:");
                    SearchEngine<Students> searcherStudents3 = new SearchEngine<>();
                    if (!searcherStudents3.uniqueSearch(readCSVWithScanner.getListStudents(), "department", scanners.stringScanner())) {
                        System.out.println("There is no person with such department in students.");
                    }
                    break;
                case SEVENTH:
                    System.out.println("You choose search by Students course.");
                    System.out.println("Please enter the number of the course you are looking for:");
                    SearchEngine<Students> searcherStudents4 = new SearchEngine<>();
                    if (!searcherStudents4.uniqueSearch(readCSVWithScanner.getListStudents(), "course", scanners.stringScanner())) {
                        System.out.println("There is no person with such course in students.");
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
        SearchEngine<Human> searcherHuman = new SearchEngine<>();
        System.out.println("Please enter name or surname you want to search: ");
        Scanners scanners = new Scanners();
        String request = scanners.stringScanner();
        if (!searcherHuman.generalSearch(readCSVWithScanner.getListEmployee(), request)) {
            if (!searcherHuman.generalSearch(readCSVWithScanner.getListStudents(), request)) {
                System.out.println("There is no such person in university.");
            }
        }
    }


}

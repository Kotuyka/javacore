package com.akotuyk.runners.homework.lesson17;

import com.akotuyk.app.homework.lesson17.ArraySorterGenerics;
import com.akotuyk.app.homework.lesson17.Employee;
import com.akotuyk.app.homework.lesson17.ReadCSVWithScanner;
import com.akotuyk.app.homework.lesson17.SearchEngine;
import com.akotuyk.runners.homework.MainRunnerForHomeTasks;
import com.akotuyk.runners.homework.MenuNumbersAndAnswers;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Huly-Buly on 16.01.2017.
 */

public class HomeTask17Runner {

    public static void main(String[] arg) throws IOException {
        HomeTask17Runner homeTask17Runner = new HomeTask17Runner();
//        homeTask17Runner.genericsSort();
        homeTask17Runner.menuText();

    }

    private void genericsSort() {
        System.out.println("We'll sort your array");
        ArraySorterGenerics<Integer> integerBox = new ArraySorterGenerics<Integer>(new Integer[]{25, 5824, 54, 685, 564});
        System.out.println(integerBox);

        ArraySorterGenerics<Double> integerBox2 = new ArraySorterGenerics<Double>(new Double[]{25.5, 5824.45, 54.52, 685.1, 564.5});
        System.out.println(integerBox2);

//        ArraySorterGenerics<String> integerBox3 = new ArraySorterGenerics<String>(new String[]{25.5, 5824.45, 54.52, 685.1, 564.5});   Все ок.
//        System.out.println(integerBox3);                                                                                              Вызывает ошибку еще на этапе компиляции
    }

    public void menuText() throws IOException {
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) Поиск по всем карточкам\n" +
                "(SECOND) Поиск по сотрудникам\n" +
                "(THIRD) Поиск студентов\n;\n" +
                "(ZERO) exit.\n" +
                "(NINTH) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        menu();
    }

    public void menu() throws IOException {
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose Поиск по всем карточкам.");
                    escFunction();
                    break;
                case SECOND:
                    System.out.println("You choose Поиск сотрудников.");
                    searchMenuText("Employee");
                    escFunction();
                    break;
                case THIRD:
                    System.out.println("You choose Поиск студентов.");
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
    }}

    private String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

    private String stringScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next();
        return menuInput;
    }

    public void escFunction() {
        System.out.println("Do you want to out? (yes/no)");
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case NO:
                    menuText();
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

    public void searchMenuText(String s) throws IOException {
        System.out.println("You can choose the number of action:\n" +
                "(FIRST) Поиск по имени\n" +
                "(SECOND) Поиск по фамилии\n" +
                "(THIRD) Поиск по факультету\n;\n" +
                "(ZERO) exit.\n" +
                "(NINTH) to go back to the MAIN runner.\n" +
                "What do you choose? : ");
        if (s.equals("Employee")){
            searchEmployeeMenu();
        } else {
            searchStudentMenu();
        }

    }

    public void searchEmployeeMenu() throws IOException {
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for check
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
        System.out.println(readCSVWithScanner.getListStudents());  // tech string for check
        System.out.println(readCSVWithScanner.getListStudents().get(1));
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose Поиск по имени.");
                    escFunction();
                    break;
                case SECOND:
                    System.out.println("You choose Поиск по фамилии.");
                    SearchEngine<Employee> searcher = new SearchEngine<Employee>();
                    searcher.nameEmployeeSearch(readCSVWithScanner.getListEmployee(), stringScanner());
                    escFunction();
                    break;
                case THIRD:
                    System.out.println("You choose Поиск по факультету.");
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
        }}

    public void searchStudentMenu() throws IOException {
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for check
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
        System.out.println(readCSVWithScanner.getListStudents());  // tech string for check
        System.out.println(readCSVWithScanner.getListStudents().get(1));
        try {
            MenuNumbersAndAnswers menuInput = MenuNumbersAndAnswers.valueOf(MenuScanner());
            switch (menuInput) {
                case FIRST:
                    System.out.println("You choose Поиск по имени.");
                    escFunction();
                    break;
                case SECOND:
                    System.out.println("You choose Поиск по фамилии.");
                    SearchEngine<Employee> searcher = new SearchEngine<Employee>();
                    searcher.nameEmployeeSearch(readCSVWithScanner.getListEmployee(), stringScanner());
                    escFunction();
                    break;
                case THIRD:
                    System.out.println("You choose Поиск по факультету.");
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
        }}


    private void csvReader() throws IOException {
        ReadCSVWithScanner readCSVWithScanner = new ReadCSVWithScanner();
        readCSVWithScanner.setEmployeeCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Employees.csv");
        System.out.println(readCSVWithScanner.getListEmployee());  // tech string for check
        readCSVWithScanner.setStudentsCSVreader("D:\\Progect\\javacore\\src\\resources\\lesson17\\Students.csv");
        System.out.println(readCSVWithScanner.getListStudents());  // tech string for check
    }

}

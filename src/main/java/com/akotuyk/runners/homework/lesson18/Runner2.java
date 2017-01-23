package com.akotuyk.runners.homework.lesson18;

import java.util.*;

/**
 * Created by Huly-Buly on 19.01.2017.
 */

// Вообще не тем путем пошел. Закончу с 17м заданием и дойду до этого.

public class Runner2 {
    public static Map names;
    public static Map categories;


    public static void main(String []args){
        System.out.println("Создаем пустую Категорию");
        setCategories();

        System.out.println("Создаем пустую коллекцию с именами");
        setNames();

        mainMenuText();  // Запустили текстовое меню.
        mainMenu();      //Пункт 1 плана выполнен.
    }

    public static void mainMenuText(){
        System.out.println("Здесь выводим текст основного меню");
        System.out.println("Типа, что пользователь должен ввести имя категории, что его интересует.");
        System.out.println("Если такой категории нет в справочнике, то новая категори будет создана");
    }

    public static void mainMenu(){
        System.out.println("\t" + categories);  //Печатаем какие категории есть
        System.out.println("Пожалуйста, введите название категории");
        categoriesCheck();
        contactsMenuText();
        contactsActions();
    }

    public static void categoriesCheck(){
        System.out.println("Дообавляем категорию");
        String categoryName = MenuScanner();
        addCategories(categoryName);
        System.out.println("Указанная категория соддержир следующие контакты: ");
        System.out.println(categories.get(categoryName));
    }

    public static void contactsMenuText(){
        System.out.println("Здесь выводим текст раздела контактов");
        System.out.println("Типа, что пользователь может сделать след:\n" +
                "(первое) внести изменения в имя контакта;\n" +
                "(второе) внести изменения в тел. контакта;\n" +
                "(третье) добавить новую запись в выбранную категорию;\n" +
                "(четвертое) вернуться к выбору категорий.\n" +
                "(пятое) выйти из программы.\n" +
                "Что он выбирает?");
    }

    public static void contactsActions(){
        Scanner input = new Scanner(System.in);
        switch (input.next()) {
            case "1":
                System.out.println("Выбрал внести изменения в имя контакта.");
                // catName.put()
                break;
            case "2":
                System.out.println("Выбрал внести изменения в тел. контакта.");
                break;
            case "3":
                System.out.println("Выбрал добавить новую запись в категорию.");
                System.out.println("Введи имя контакта");
                String name = MenuScanner();
                System.out.println("Введи номер контакта");
                String number = MenuScanner();
                setNames();
                addNames(name, number);
                System.out.println("В какую категорию хотите внести новый контакт?");
//                addCategories(MenuScanner(), names);
                mainMenu();
                // categories.get(catName).put(names);
                break;
            case "4":
                System.out.println("Выбрал вернуться к выбору категорий.");
                mainMenu();
                break;
            case "5":
                System.out.println("Выбрал выйти. Пока!");
                break;
            default:
                System.out.println("You entered the WRONG VALUE. Correct yourself...");
                break;
        }

    }

    public static void setNames(){
        names = new HashMap();
    }
    public static void setCategories(){
//        categories = new HashSet();
    }

    public static void addNames(String s1, String s2){
        names.put(s1, s2);
    }
    public static void addCategories(String categoryName){
//        categories.put(categoryName,);
    }

    private static String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }

}

package com.akotuyk.runners.homework.lesson18;

import java.util.*;

/**
 * Created by Huly-Buly on 18.01.2017.
 */
public class tech {
    public static Map categories;
    public static ArrayList<Map> listNames;
    public static Map line;

    public static void main(String[] args) {
        tech tech = new tech();
        tech.newCategoriesCreator();
        tech.runner();
    }
    public void newCategoriesCreator(){
        this.categories = new HashMap();
    }
    public void newListNamesCreator(){
        this.listNames = new ArrayList();
    }
    public void newLinesCreator(){
        this.line = new HashMap();
    }

    public void runner(){
        System.out.println("Проверяем какие катеогрии есть");
        System.out.println("\t" + categories);  //Печатаем какие категории есть
        System.out.println("Пожалуйста, введите название категории");
        categoriesCheck();
        System.out.println("Запускаем меню ячеек");
        contactsMenuText();
        contactsActions();
    }

    private String MenuScanner() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.next().toUpperCase();
        return menuInput;
    }
    public void categoriesCheck(){
        String categoryName = MenuScanner();
        if (!categories.containsKey(categoryName)){
            System.out.println("Такую категорию не нашло, добавляем новую");
            newListNamesCreator();
            categories.put(categoryName, listNames);
        }
        System.out.println("Указанная категория соддержир следующие контакты: ");
        System.out.println(categories.get(categoryName));
    }
    public static void contactsMenuText(){
        System.out.println("Типа, что пользователь может сделать след:\n" +
                "(первое) внести изменения в имя контакта;\n" +
                "(второе) внести изменения в тел. контакта;\n" +
                "(третье) добавить новую запись в выбранную категорию;\n" +
                "(четвертое) вернуться к выбору категорий.\n" +
                "(пятое) выйти из программы.\n" +
                "Что он выбирает?");
    }
    public void contactsActions(){
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
                newLinesCreator();
                line.put(name, number);
                System.out.println("В какую категорию хотите внести новый контакт?");
//                categories.get(MenuScanner()).add(line);
                runner();
                // categories.get(catName).put(names);
                break;
            case "4":
                System.out.println("Выбрал вернуться к выбору категорий.");
                runner();
                break;
            case "5":
                System.out.println("Выбрал выйти. Пока!");
                break;
            default:
                System.out.println("You entered the WRONG VALUE. Correct yourself...");
                break;
        }

    }
}

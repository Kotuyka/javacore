package com.akotuyk.app.homework.lesson18;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Huly-Buly on 18.01.2017.
 */
public class Structure {

    private static Collection hSet;


//    public <T extends TextArea> Collections addElementToSet(T t) {
//        for (int i = 0; i < u.length - 1; i++) {
//            for (int j = i + 1; j < u.length; j++) {
//                if (u[j - 1].compareTo(u[j]) <= 0) {
//                    U temp = u[j - 1];
//                    u[j - 1] = u[j];
//                    u[j] = temp;
//                }
//            }
//        }
//        return u;
//    }


    public static Collection setSet() {
        // Создание коллекции
        hSet = new HashSet();
        return hSet;
    }
//    public static void setAddToSetCollection(String category) {
//        // Добавление в коллекцию
//        hSet.add(category);
//    }
//    public static Collection getHSet() {
//        // Получение значения из коллекции
//        return hSet;
//    }

    public static Map setMap(String name, int phoneNumber) {
//        // Создаем новывй экземпляр МАРа
        Map map = new HashMap();
        map.put(name, phoneNumber);
        return map;
    }

}

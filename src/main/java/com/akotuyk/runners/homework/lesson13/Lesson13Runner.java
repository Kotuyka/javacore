package com.akotuyk.runners.homework.lesson13;

import com.akotuyk.app.homework.lesson13.Human;
import com.akotuyk.app.homework.lesson13.WhiteCollar;

/**
 * Created by Huly-Buly on 27.12.2016.
 */
public class Lesson13Runner {

    public static void main(String[] args) {

        Human Human = new Human(25, "Igor");
        System.out.println(Human.toString());

        WhiteCollar WhiteCollar = new WhiteCollar(2, "Igor", "Moya Persha-Firma, two");
        System.out.println(WhiteCollar.toString());
    }

}

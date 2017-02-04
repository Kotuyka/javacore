package com.akotuyk.app.homework.lesson17;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Kotuyk A on 26.01.2017.
 */
public class DuplicatesCheck {

        public void checkForDuplicates() {
        Scanner sc = new Scanner(System.in);
        String tech;
        TreeSet<String> wordsList = new TreeSet<>();
        do {
            tech = sc.nextLine();
            wordsList.add(tech);
        }
        while (!tech.equals(""));
        for (String resultative : wordsList) {
            System.out.println(resultative);
        }
    }
}


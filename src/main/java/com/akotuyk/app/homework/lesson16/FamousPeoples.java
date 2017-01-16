package com.akotuyk.app.homework.lesson16;

/**
 * Created by Huly-Buly on 16.01.2017.
 */
public enum FamousPeoples {
    Musk(1971, "Elon Musk", "yes"), Berners_Lee(1955, "Tim Berners-Lee", "yes"), Jobs(1955, "Steve Jobs", "no"),
    Gates(1955, "Bill Gates", "yes"), Einstein(1879, "Albert Einstein", "no"), Trump(1946, "Donald John Trump", "yes"),
    Jolie(1975, "Angelina Jolie Pitt", "yes"), Dawkins(1941, "Richard Dawkins", "yes"), Hawking(1972, "Stephen Hawking", "yes");

    private int DOB;

    private String fullName, isAlive;

    FamousPeoples(int DOB, String fullName, String isAlive) {
        this.DOB = DOB;
        this.fullName = fullName;
        this.isAlive = isAlive;
    }

    public int getDOB() {
        return DOB;
    }
    public String getFullName() {
        return fullName;
    }
    public String getIsAlive() {
        return isAlive;
    }

    @Override
    public String toString() {
        return "Full name: " + fullName + ";\n" +
                "Date of birth: " + DOB + ";\n" +
                "Is still alive: " + isAlive + ".";
    }

    public static FamousPeoples getRandom() {
            return values()[(int) (Math.random() * values().length)];
    }
}

package com.akotuyk.runners.classwork.lesson16;

/**
 * Created by Huly-Buly on 13.01.2017.
 */
public enum Holidays {
    NEW_YEAR(1, "December", "New Year"), CHRISTMAS(7, "January", "Christmas"), EASTER(25, "April", "Easters");

    private int date;
    private String month, name;
    private Holidays(int date, String month, String name){
        this.date = date;
        this.month = month;
        this.name = name;
    }

    public int getDate(){
        return date;
    }

    public String getMonth(){ return month; }

    public String getName(){ return name; }

    @Override
    public String toString() {
        return getName() + " holiday is on " +
                getMonth() + ", " + getDate();
    }
}

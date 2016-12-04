package com.akotuyk.app.homework.lesson5;

public class RightAngledTriangle {

    public boolean calculator(double side1, double side2, double side3) {
        return (((Math.pow(side1, 2))) + (Math.pow(side2, 2)) == (Math.pow(side3, 2))) ||
                ((Math.pow(side2, 2)) + (Math.pow(side3, 2)) == (Math.pow(side1, 2))) ||
                ((Math.pow(side2, 2)) + (Math.pow(side3, 2)) == (Math.pow(side1, 2)));
    }

}

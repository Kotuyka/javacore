package com.akotuyk.app.homework.lesson5;

public class MaxArea {

    public static double setArea1(double PI, double radius) {
        double area1 = PI*(Math.pow(radius, 2));
        return area1;}

    public static double setArea2(double PI, double radius) {
        double area2 = PI*(Math.pow(radius, 2));
        return area2;}

    public static boolean compareAreas(double area1, double area2){
        if (area1 > area2){
            return true;}
        if (area1 < area2){
            return false;}
        else {return false;}
    }}

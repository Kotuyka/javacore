package com.akotuyk.app.homework.lesson7;
import com.akotuyk.runners.homework.lesson7.LoopsArraysRunner;

public class ExerciseH {
    private static int x;

    static int setX(int a) {
        x = x + a;
        return x;}

    public static int clearX(int a) {     // если этого не сделать, то вызвав этот пункт меню второй раз,
        x = 0;                           // значение переменной изначально уже будет равно сумме предыдущих
        return x;}                      // операций в этом пункте

    public static int getX() {
        return x;}

    public static void check (String answer){
        try {
            if (!answer.equals("exit")){
                int inputNumber = Integer.parseInt(answer);
                setX(inputNumber);
                LoopsArraysRunner.scanerForH();
            } else if(answer.equals("exit")){
            } else {}
        } catch (NumberFormatException ex) {
            System.out.println("So, you entered not a number. Try agan.");
            LoopsArraysRunner.scanerForH();}
    }

}
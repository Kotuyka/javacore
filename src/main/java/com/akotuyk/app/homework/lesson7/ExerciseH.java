//package com.akotuyk.app.homework.lesson7;
//
//public class ExerciseH {
//    private static int x;
//
//    static int setX(int a) {
//        x = x + a;
//        return x;
//    }
//
//    public static int clearX(int a) {     // если этого не сделать, то вызвав этот пункт меню второй раз,
//        x = 0;                           // значение переменной изначально уже будет равно сумме предыдущих
//        return x;                       // операций в этом пункте
//    }
//
////    public static int getX() {
////        return x;
////    }
////
////    public int check(String answer) {
////        int sum = 0;
////        boolean compare;
////
////
////
////        switch (answer){
////            case "Exit":
////                break;
////            case Integer.parseInt(answer):
////
////        }
////        do {
////            compare = false;
////            try {
////                if (answer.equals("Exit")) {
////                    compare = true;
////                } else {
////                    int inputNumber = Integer.parseInt(answer);
////                    sum = sum + inputNumber;
////                }
////            } catch (Exception e) {
////                System.out.println("So, you entered not a number.");
////            }
////        } while (!compare);
////        return sum;
//    }

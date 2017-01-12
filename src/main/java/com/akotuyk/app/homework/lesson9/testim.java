package com.akotuyk.app.homework.lesson9;

import java.util.Arrays;

public class testim {

    private int[][] twoDimentionsArray = new int[15][2];      // задаем "конечный" массив с будующими парами чисел
    private static int[] workingArray = new int[2];                 // задаем "рабочий" массив с вариантами чисел
    private static int[] techArray = new int[2];            // задаем "технический" массив для обратного варианта рабочего массива
    private static int multiplikatorNumber1 = 0;            // инициализируем произвольную переменную №1
    private static int multiplikatorNumber2 = 0;            // инициализируем произвольную переменную №2
    private static int checkDouble = 0;                     // инициализируем счетчик повторения массивов (рабочего или тех) в конечный

    public static void main(String[] args) {                                  // запускаем программу
        System.out.println("Statrt of the multiplikation table examples:");
        testim multiplikationTable = new testim();
        multiplikationTable.start();
    }

    public void start() {
        for (int i = 0; i < twoDimentionsArray.length; i++) {
            do {
                checkDouble = 0;           // устанавливем счетчик 0. Если он не 0, значит раб.или тех. массив входят в
                                            // конечный массив, это повторение и нам нужно будет еще раз задать случ. числа.
                                            // Эту переменную МОЖЕТ увеличивать метод checkForTheSameArrays в конце цикла.
                getRandomNumbers(8, 2);                                     // получаем(задаем) 2 случайных числа
                setWorkingArray(multiplikatorNumber1, multiplikatorNumber2);            // иниц-ем "рабочий" массив
                System.out.println("The WorkingArray is: " + Arrays.toString(workingArray));
                setTechArray(multiplikatorNumber1, multiplikatorNumber2);               // иниц-ем "технический" массив
                System.out.println("The TechArray is: " + Arrays.toString(techArray));
                checkForTheSameArrays(twoDimentionsArray, workingArray, techArray);   // проверяем вхождение тех. или раб-го
                                                                                        // массива в конечный массив
                System.out.println("MUST STOP HERE ");

                for (int j = 0; j < twoDimentionsArray.length; j++) {                    // просто что бы проследить как
                    for (int k = 0; k < twoDimentionsArray[j].length; k++) {             // заполняется конечный массив
                        System.out.print(twoDimentionsArray[j][k]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            } while (checkDouble != 0);
            System.out.println("Tast for student number: " + (i + 1));
            System.out.println("multiplikatorNumber1= " + multiplikatorNumber1 + "\n"
                                + "multiplikatorNumber2= " + multiplikatorNumber2);
            System.out.println("The multiplication result is: " + (multiplikatorNumber1 * multiplikatorNumber2));
            twoDimentionsArray[i] = workingArray;

        }
    }

    public void getRandomNumbers(int a, int b) {
        multiplikatorNumber1 = ((int) ((Math.random() * a) + b));
        multiplikatorNumber2 = ((int) ((Math.random() * a) + b));
    }

    public void setWorkingArray(int a, int b) {
        workingArray[0] = a;
        workingArray[1] = b;
    }

    public void setTechArray(int a, int b) {
        techArray[0] = b;
        techArray[1] = a;
    }

    public void checkForTheSameArrays(int[][] a, int[] b, int[] c) {                // когда цикл проходит второй раз
        for (int i = 0; i < a.length; i++) {                                        // 1у массиву конечного присваивается
            System.out.println("Проверяем элементы масива: " + Arrays.toString(a[i]));  // технический массив, вместо того
            while (a[i] == b || a[i] == c) {                                                // что бы идти по уже созданным масивами добавлять новый следующему элементу конечного массива. Цикл закрывается в бессконечный.
                checkDouble++;
            }
        }
    }

}

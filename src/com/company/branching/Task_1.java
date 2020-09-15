package com.company.branching;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

public class Task_1 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусную меру двух углов: ");
        a = in.nextInt();
        b = in.nextInt();

        if (180 - a - b > 0 && a > 0 && b > 0)
            System.out.println("Существует");
        else
            System.out.println("Не существует");

        if ((180 - a - b > 0 && a > 0 && b > 0) && (a == 90 || b == 90 || (180 - a - b) == 90))
            System.out.println("Прямоугольный");
    }
}

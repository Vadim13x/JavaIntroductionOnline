package com.company.branching;

import java.util.Scanner;

/**
 *  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
 *  пройдет ли кирпич через отверстие.
 */
public class Task_4 {
    public static void main(String[] args) {
        double a, b, x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a, b: ");
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Input x, y, z: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        if     ((x <= a) && (y <= b) || (y <= a) && (x <= b) ||
                (x <= a) && (z <= b) || (z <= a) && (x <= b) ||
                (y <= a) && (z <= b) || (z <= a) && (y <= b))
            System.out.println("The brick will go through the hole");
        else
            System.out.println("The brick won't go through the hole");
    }
}

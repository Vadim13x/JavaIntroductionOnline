package com.company.branching;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 *F(x) = x2 = x²-3x+9, если x<=3
 *F(x) = 1/(x³ + 6), если x>3
 */

public class Task_5 {
    public static void main(String[] args) {
        double x, f;
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        x = in.nextDouble();
        if (x <= 3)
        {
            f = (x*x) - (3*x) + 9;
            System.out.println(f);
        }
        else
        {
            f = 1 / ((x*x*x) + 6);
            System.out.println(f);
        }
    }
}

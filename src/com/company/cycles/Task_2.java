package com.company.cycles;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x,x>2  y=-x,x<=2
 */
public class Task_2 {
    public static void main(String[] args) {
        double a, b, x, y, h;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a, b: ");
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Input h: ");
        h = in.nextDouble();
        for (x = a; x <= b; x += h)
        {
            if (x > 2) {
                y = x;
                System.out.println("y = " + y);
            }
            else
            {
                y = -x;
                System.out.println("y = " + y);
            }
        }
    }
}

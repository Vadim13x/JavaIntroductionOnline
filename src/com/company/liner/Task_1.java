package com.company.liner;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */
public class Task_1 {

    public static void main(String[] args) {
        double a, b, c, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Input variables a, b, c: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);

    }
}

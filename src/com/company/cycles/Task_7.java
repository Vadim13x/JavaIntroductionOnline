package com.company.cycles;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
public class Task_7 {
    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Input m, n: ");
        m = in.nextInt();
        n = in.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println("Dividers of number " + i);
            for (int k = 2; k < i; k++) {
                if (i % k == 0)
                    System.out.println(k);
            }
        }

    }
}

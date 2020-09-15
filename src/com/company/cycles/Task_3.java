package com.company.cycles;
/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task_3 {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        for (int i = 0; i <= 100; i++)
        {
            sum += (i*i);
        }
        System.out.println(sum);
    }
}

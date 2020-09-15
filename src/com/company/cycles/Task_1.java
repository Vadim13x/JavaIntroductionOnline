package com.company.cycles;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

public class Task_1 {
    public static void main(String[] args) {
        int n, sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        n = in.nextInt();
        if (n > 0)
        {
            sum = 0;
            int i = 1;
            while (i != n)
            {
             sum += i;
             i++;
            }
            System.out.println(sum + n);
        }
        else
            System.out.println("Wrong format of the number");
    }
}

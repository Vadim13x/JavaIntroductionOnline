package com.company.branching;

import java.util.Scanner;
/**
 * Найти max{min(a, b), min(c, d)}.
 */
public class Task_2 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a, b, c, d: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        System.out.println(max(min(a, b), min(c, d)));
    }
        private static int min(int a, int b){
        if (a > b)
            return b;
        else return a;
    }

    private static int max(int a, int b){
        if (a > b)
            return a;
        else return b;
    }
}

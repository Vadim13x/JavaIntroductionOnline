package com.company.cycles;

import java.math.BigInteger;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task_4 {
    public static void main(String[] args) {
        int n = 200;
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
        {
            BigInteger a = BigInteger.valueOf(i);
            result = result.multiply(a.multiply(a)) ;
        }
        System.out.println(result);
    }
}

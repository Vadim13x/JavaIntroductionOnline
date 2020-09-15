package com.company.liner;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * (b+√(b²+4ac))/2a - a³с + b⁻ ²
 */
public class Task_2 {
    public static void main(String[] args){
        double a, b, c, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Input variables a, b, c: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        result = ((b + Math.sqrt(b*b + 4*a*c))/ 2*a) - (a*a*a*c) + (1/(b*b));
        System.out.println(result);
    }
}

package com.company.liner;

import java.util.Scanner;
/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * ((sin x + cos y) / (cos x - sin y)) * tg xy
 */
public class Task_3 {
    public static void main(String[] args) {
        double x, y, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Input variables x, y: ");
        x = in.nextDouble();
        y = in.nextDouble();
        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(result);
    }
}

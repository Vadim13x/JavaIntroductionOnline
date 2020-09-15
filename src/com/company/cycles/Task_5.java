package com.company.cycles;
/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * aₙ = 1/2^n + 1/3^n
 */
public class Task_5 {
    public static void main(String[] args) {
        double e = 0.0000001;
        double sum = 0;
        for (int n = 0; ; n++)
        {
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (Math.abs(a) >= e)
                sum += a;
            else
                break;
        }
        System.out.println(sum);
    }
}

package com.company.liner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task_4 {
    public static void main(String[] args) {
        double r = 123.456;
        int x = (int) r;
        double y = (r - x) * 1000;
        double z = y + ((double) x / 1000);
        System.out.printf("%.3f", z);

    }
}

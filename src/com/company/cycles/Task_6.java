package com.company.cycles;
/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task_6 {

    public static void main(String[] args) {

        int x = 128;

        for (int i = 0; i <= x; i++) {

            char c = (char) i;

            System.out.println(i + " соответствует символу " + c);

        }
    }
}

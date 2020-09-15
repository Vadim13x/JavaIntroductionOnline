package com.company.liner;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */
public class Task_5 {
    public static void main(String[] args) {
        int seconds, h, m, s;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд: ");
        seconds = in.nextInt();
        h = seconds / 3600;
        m = (seconds % 3600) / 60;
        s = (seconds % 3600) % 60;
        System.out.println(h + "ч " + m + "мин" + s + "с");
    }
}

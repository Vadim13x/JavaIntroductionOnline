package com.company.cycles;
/**
 * Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.
 */
public class Task_8 {
    public static void main(String[] args) {

        int a = 2567899;
        int b = 57942;

        while (a > 0) {
        int d = a % 10;
        a = a / 10;
        int c = b;
        while (c > 0){
            if (c % 10 == d) {
                System.out.println(d + " ");
                break;
            }
            c = c / 10;
        }
        }
    }
}


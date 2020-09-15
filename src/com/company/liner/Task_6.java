package com.company.liner;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами
 * (х, у) принадлежит закрашенной области, и false — в противном случае:
 * Область - graph.png(com.company.liner)
 */
public class Task_6 {
    public static void main(String[] args) {
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Input coordinates x, y: ");
        x = in.nextDouble();
        y = in.nextDouble();
        boolean z = ((x >= -4 && x <= 4) && (y <= 0 && y >= -3)) || ((x >= -2 && x <=2) && (y >= 0 && x <= 4))  ;
        System.out.println(z);
    }
}

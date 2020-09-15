package com.company.branching;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        Scanner in = new Scanner(System.in);
        System.out.println("Input coordinates of point A: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        System.out.println("Input coordinates of point B: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        System.out.println("Input coordinates of point C: ");
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        if (((x3 - x1) * (y2 - y1)) == ((x2 - x1) * (y3 - y1)))
            System.out.println("Points are on the one line");
        else
            System.out.println("Points aren't on the one line");
    }
}

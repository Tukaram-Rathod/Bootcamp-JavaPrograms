package com.bridgelabz.BRP.day1;
/*
 * @Author: Tukaram Rathod
 * purpose:Write a program Distance.java that takes two integer command-line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 * formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.
 **/
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double x ,y,distance;

        System.out.println("Enter Arguments x,y : ");
        x = cs.nextDouble();
        y = cs.nextDouble();

        distance = Math.sqrt(x*x + y*y);
        System.out.println(distance);
    }
}

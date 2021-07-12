package com.bridgelabz.BRP.day2;
/*
 * @Author: Tukaram Rathod
 * Purpose: 4.Write a program Trig.java to illustrate various trigonometric functions in the Math
 * library, such as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an
 * angle (in degrees), converts to radians, and then performs various trigonometric
 * calculations.
 */
import java.util.Scanner;
public class Trig {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double a,b;

        System.out.println("Enter Angle in Degree : ");
        a = cs.nextDouble();

        b = Math.toRadians(a);
        System.out.println("Sin"+a+" is : "+Math.sin(b));
        System.out.println("Cos"+a+" is : "+Math.cos(b));
        System.out.println("Tan"+a+" is : "+Math.tan(b));
    }
}

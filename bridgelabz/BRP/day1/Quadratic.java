package com.bridgelabz.BRP.day1;

import java.util.Scanner;

/*
 * @Author: Tukaram Rathod
 *  purpose:3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 *  Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 *  can be found using a formula
 *  delta = b*b - 4*a*c
 *  Root 1 of x = (-b + sqrt(delta))/(2*a)
 *  Root 2 of x = (-b - sqrt(delta))/(2*a)
 *  Take a, b and c as input values to find the roots of x.
 */
public class Quadratic {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double a,b,c,x =0,y = 0;
        double delta=0,equation1,equation2;

        System.out.println("Enter value of a,b,c: ");
        a=cs.nextInt();
        b=cs.nextInt();
        c=cs.nextInt();

        delta = b*b - 4*a*c;

        y = (-b + Math.sqrt(delta))/(2*a);
        x = (-b - Math.sqrt(delta))/(2*a);

        equation1 = a * y * y + b*y + c;
        equation2 = a * x * x + b*x + c;
        System.out.println(equation1);
        System.out.println(equation2);
    }
}

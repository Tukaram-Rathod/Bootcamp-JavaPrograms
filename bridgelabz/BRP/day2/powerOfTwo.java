package com.bridgelabz.BRP.day2;
/*
 * @Author: Tukaram Rathod
 * Purpose: 6. Write a program PowerOf2.java that takes a command-line argument n and prints a
 * table of the powers of 2 that are less than or equal to 2^n.
 */
import java.util.Scanner;
public class powerOfTwo {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n,i=1;

        System.out.println("Enter value for n : ");
        n = cs.nextInt();

        System.out.println("power of 2^"+n+" is: "+(Math.pow(2,n)));
        System.out.println();
        System.out.println("Printing all till Power Value "+n);

        while (i<=n){//
            System.out.println("Power of 2^"+i+" is: "+(Math.pow(2,i)));
            i = i + 1;
        }
    }
}

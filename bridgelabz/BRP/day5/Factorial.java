package com.bridgelabz.BRP.day5;
/*
 * @Author: Tukaram Rathod
 * Purpose: 4.To MathFunction.java add a Static function that takes one integer command line
 * input n and outputs n! = 1 * 2 * ... * n. Write a function that has the following
 * signature:
 * public static long factorial(int n)
 */
import com.bridgelabz.BRP.day5.MathFunction.MathFunction;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        MathFunction.factorial(num);
    }
}

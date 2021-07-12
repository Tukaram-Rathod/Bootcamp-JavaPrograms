package com.bridgelabz.BRP.day5;
/*
 * @Author: Tukaram Rathod
 * Purpose: 5. To MathFunction.java add a static method to return futureValue that computes the
 * amount of money you will have if you invest C dollars today at the compound interest
 * rate of r per period, in T periods. The formula for the future value is given by C*(1 +
 * r)^T.
 */
import com.bridgelabz.BRP.day5.MathFunction.MathFunction;
import java.util.Scanner;
public class FutureCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dollar : ");
        int C = sc.nextInt();
        System.out.println("Enter Rate : ");
        int r = sc.nextInt();
        System.out.println("Enter Time Period : ");
        int T = sc.nextInt();
        double futureAmount = C * (1 + r )^T;
        MathFunction.futureValue(futureAmount);
    }
}

package com.bridgelabz.BRP.day5;

import com.bridgelabz.BRP.day5.MathFunction.MathFunction;

import java.util.Scanner;

/*
 * @Author: Tukaram Rathod
 * Purpose: 1. To MathFunction.java add a static method to return presentValue that computes
 * the amount of money that would have to be invested now, at the compound interest
 * rate r per period, to obtain a cash flow of C in T periods. The formula for the present
 * value is given by C/(1 + r)^T.
 */
public class PresentCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dollar : ");
        int C = sc.nextInt();
        System.out.println("Enter Rate : ");
        int r = sc.nextInt();
        System.out.println("Enter Time Period : ");
        int T = sc.nextInt();
        double presentAmount = C / (1 + r )^T;
        MathFunction.presentValue(presentAmount);
    }
}

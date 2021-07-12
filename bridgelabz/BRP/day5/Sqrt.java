package com.bridgelabz.BRP.day5;
/*
 * @Author: Tukaram Rathod
 * Purpose: 2. To MathFunction.java add a static method sqrt() that takes a double argument and
 * returns the square root of that number. Use Newton's method (see Sqrt.java) to
 * compute the result. Also write overloaded version in which user specifies the error
 * tolerance epsilon. Here are the functions.
 */
import com.bridgelabz.BRP.day5.MathFunction.MathFunction;
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        MathFunction mathFunction = new MathFunction();
        Scanner sc = new Scanner(System.in);
        int c;
        double result;
        System.out.println("Enter Value : ");
        c = sc.nextInt();
        if (c > 0){
            result = mathFunction.findSquareRootUsingNewtonMethod(c);
            System.out.println("Square Root of " + c + " using Newtons Law is " + result);
        }
        else
            System.out.println("Enter Positive Number : ");
    }
}

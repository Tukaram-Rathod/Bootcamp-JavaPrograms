package com.bridgelabz.BRP.day5.MathFunction;
/*
 * @Author: Tukaram Rathod
 * Purpose: 1. Create MathFunction.java class and write following static methods that are done
 * part of week 1
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MathFunction {
    /*
   a. To return an harmonic number
    */
    public static void harmonicSeries(int num) {
        for (int i = 1 ; i <= num ; i++){
            if (i == num)
                System.out.print(" 1/" +i);
            else
                System.out.print(" 1/" +i+ " + " );
        }
    }
    /*
    b. To return a sin of an angle
     */
    public static void isSin(double sin) {
        double radian = Math.toRadians(sin);
        double sinValue = Math.sin(radian);
        System.out.println("sin(" +sin+ ") =" +sinValue);
    }
    /*
    c. To return cosine of an angle
     */
    public static void isCosine(double cosine) {
        double radian = Math.toRadians(cosine);
        double cosValue = Math.sin(radian);
        System.out.println("sin(" +cosine+ ") =" +cosValue);
    }
    /*
    d. To return Binary of a number
     */
    public static void Binary(int decimal) {
        int binary=0,reminder,temp=1;
        while (decimal!=0){
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("Binary number is : "+binary);
    }
    /*
     * Purpose: method for finding prime number or not
     * take num input from user
     * returns true if prime else not prime
     */
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i < num; i++){
            if (num % 2 == 0)
                return false;
        }
        return true;
    }
    /*
    return factorial number
     */
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1;i<=num; i++){
            fact *=i;
        }
        System.out.println("The factorial of the number is: "+fact);
        return fact;
    }
    /*
    futureValue that computes the amount of money
     */
    public static void futureValue(double futureAmount) {
        System.out.println("Your Future Value is : "+futureAmount);
    }
    /*
    presentValue that computes the amount of money
    */
    public static void presentValue(double presentAmount) {
        System.out.println("Your Present Value is : "+presentAmount);
    }
    /*
     Return max and min value
     */
    public static int minMax() {
        Integer[] num = { 30, 44, 57, 25, 89 };
        int minValue = Collections.min(Arrays.asList(num));
        int maxValue = Collections.max(Arrays.asList(num));
        System.out.println("Minimum number of array is : "
                + minValue);

        System.out.println("Maximum number of array is : "
                + maxValue);
        return 0;
    }
    /*
     * Purpose: method for finding square root using newton's law
     * c input from user
     * returns the square root
     */
    public double findSquareRootUsingNewtonMethod(int c) {
        double t, epsilon;
        t = c;
        epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t){
            t = (c / t + t) / 2.0;
        }
        return t;
    }
    /*
     * Slope Formula - Three points are collinear if the slopes formed by three points are
     * equal. Assume point A(x1, y1), B(x2, y2) and c(x3, y3). Then
     * Slope AB = (y2-y1)/(x2-x1), Slope BC = (y3-y2)/(x3-x2) and so on
     * If Collinear then Slope AB = Slope BC = Slope AC
     */
    public static String isCollinear(int x1,int x2,int x3,int y1,int y2,int y3){
        //Calculating the area of triangle and check that 3 points are Colinear or not
        int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 -y2);
        if (a==0)
            System.out.println("Yes points are Collinear");
        else
            System.out.println("No points are not Collinear");
        return "";
    }
}

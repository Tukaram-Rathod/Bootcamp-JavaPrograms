package com.bridgelabz.BRP.day3;
/*
 * @Author: Tukaram Rathod
 * Purpose: 4. Write two programs Sin.java and Cos.java that compute sin x and cos x using the
 * Taylor series expansions as shown below...
 * Note - Convert angle x to an angle between -2 PI and 2 PI using following logic
 * x = x % (2 * Math.PI);
 */
import java.util.Scanner;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
public class TaylorSeries {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter Angle in Degree : ");
        float x = cs.nextInt();
        cal_sin(x);
        cal_cos(x);
    }
    static void cal_sin(float x)
    {
        float accuracy = (float) 0.0001, denominator, sinx, sinval;
        // Converting degrees to radian
        x = x * (float)(3.142 / 180.0);
        float x1 = x;
        // maps the sum along the series
        sinx = x;
        // holds the actual value of sin(n)
        sinval = (float)sin(x);
        int i = 1;
        do
        {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * x * x / denominator;
            sinx = sinx + x1;
            i = i + 1;
        } while (accuracy <= sinval - sinx);
        System.out.println(sinx);
    }
    static void cal_cos(float x){
        float accuracy = (float) 0.0001, denominator, cosx, cosval;
        // Converting degrees to radian
        x = x * (float)(3.142 / 180.0);
        float x1 = x;
        // maps the sum along the series
        cosx = x;
        // holds the actual value of sin(n)
        cosval = (float)cos(x);
        int i = 1;
        do
        {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * x * x / denominator;
            cosx = cosx + x1;
            i = i + 1;
        } while (accuracy <= cosval - cosx);
        System.out.println(cosx);
    }
}

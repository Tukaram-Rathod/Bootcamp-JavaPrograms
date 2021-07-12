package com.bridgelabz.BRP.day2;
/*
 * @Author: Tukaram Rathod
 * Purpose: 7. Write a program HarmonicNumber.java that takes a command-line argument n
 * and prints the nth harmonic number. Harmonic Number is of the form.
 */
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter value for n : ");
        int n = cs.nextInt();
        double result = nthHarmonic(n);
        if (n>0)
            System.out.println("The harmonic Value for the number is : "+result);
        else
            System.out.println("The number should be non Negative . ");
    }
    public static double nthHarmonic(int n){
        double val = 0.0;
        for (int i=1;i<=n;i++){
            val = val + (1.0/i);
        }
        return val;
    }
}

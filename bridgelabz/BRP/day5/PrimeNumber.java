package com.bridgelabz.BRP.day5;
/*
 * @Author: Tukaram Rathod
 * Purpose: 3. To MathFunction.java add a function isPrime() that takes an integer argument N
 * and returns true or false depending on whether N is prime.
 */
import com.bridgelabz.BRP.day5.MathFunction.MathFunction;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Check Prime Number : ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++){
            if (MathFunction.isPrime(i))
                System.out.println(i + " ");
        }
    }
}

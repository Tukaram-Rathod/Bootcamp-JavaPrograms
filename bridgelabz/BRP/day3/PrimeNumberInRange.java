package com.bridgelabz.BRP.day3;
/*
 * @Author: Tukaram Rathod
 * Purpose: 1. Write a program that takes a range of number as input and outputs the Prime
 * Numbers in that range.
 */
import java.util.Scanner;
public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int start, end, count;
        System.out.println("Enter Starting Number : ");
        start = cs.nextInt();
        System.out.println("Enter Ending Number : ");
        end = cs.nextInt();
        System.out.println("Prime Number Between " +start+" and "+end+ " are : ");
        for (int i=start;i<=end;i++){
            // checking number prime or not
            count =0;
            for (int j = 1; j <= i; j++){
                if (i %j == 0)
                    count = count+1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}

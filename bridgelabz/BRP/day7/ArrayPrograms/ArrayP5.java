package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:5.Write a program to find the sum of negative and positive integers.
 */
import java.util.Scanner;
public class ArrayP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size = sc.nextInt();
        double arr[] = new double[size];
        double sum_pos = 0.0, sum_neg = 0.0;
        int i = 0, j = 0;
        System.out.println("Enter the Element of the array:\n");
        while (i < size) {
            arr[i] = sc.nextDouble();
            i++;
        }
        while (j < size) {
            if (arr[j] > 0)
                sum_pos += arr[j];
            else
                sum_neg += arr[j];
            j++;
        }
        System.out.println("sum of positive number : " + sum_pos);
        System.out.print("\nsum of Negative number : " + sum_neg);

    }
}
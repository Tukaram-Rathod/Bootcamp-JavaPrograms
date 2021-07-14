package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:6.Write a program to find the sum of N numbers in an array
 */
import java.util.Scanner;
public class ArrayP6{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        double arr[ ]=new double[size];
        double sum=0.0;
        int i=0,j=0;
        System.out.println("Enter the Element of the array:");
        while(i<size)
        {
        arr[i]=sc.nextDouble();
        i++;
        }
        while(j<size)
        {
        sum+=arr[j];
        j++;
        }
        System.out.println("sum of "+size+" number : "+sum);
        sc.close();
        }
}

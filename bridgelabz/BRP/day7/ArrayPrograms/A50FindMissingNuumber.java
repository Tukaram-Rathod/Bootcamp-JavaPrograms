package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:50.Write a Program to Find missing numbers in an array.
 */
import java.util.Scanner;
public class A50FindMissingNuumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        int size2=size+1;
        int miss=(size2*(size2+1))/2;
        System.out.println("Missing Number is: "+Math.abs(miss-sum));
    }
}

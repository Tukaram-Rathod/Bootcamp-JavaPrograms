package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:48.Write a program to find Maximum the difference between two elements in an array.
 */
import java.util.Scanner;
public class A48FindMaximumBtw2Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j;
        size=sc.nextInt();
        int arr[ ]=new int[size];

        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int Max_diff=Integer.MIN_VALUE;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(Math.abs(arr[j]-arr[i])>Max_diff)
                {
                    Max_diff=Math.abs(arr[j]-arr[i]);
                }
            }}
        System.out.print("Maximum difference between two Element is "+Max_diff);
    }
}

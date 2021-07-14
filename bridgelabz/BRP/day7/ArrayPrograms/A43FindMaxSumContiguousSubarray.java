package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:43.Write a Program to Find the Max sum contiguous subarray.
 */
import java.util.Scanner;
public class A43FindMaxSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j,p;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int Maximum_Sum=0;
        for(i=0;i<size;i++)
        {
            for(j=i;j<size;j++)
            {
                int sum=0;
                for(p=i;p<j;p++)
                {
                    sum+=arr[p];
                }
                if(sum>=Maximum_Sum)
                {
                    Maximum_Sum=sum;
                }
            }
        }
        System.out.println("Maximum sum of Contiguous Subarray is "+Maximum_Sum);

    }
}

package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:16.Write a program to print the frequency of all numbers in an array.
 */
import java.util.Scanner;
public class A16Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j;
        int max=Integer.MIN_VALUE;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
            if(arr[j]>=max)
                max=arr[j];
        }
        int freq[]=new int[max+1];
        for(j=0;j<size;j++)
            freq[arr[j]]++;
        for(j=0;j<freq.length;j++)
        {
            if(freq[j]!=0)
                System.out.println("occurs "+j+" "+freq[j]+ " times");
        }
    }
}

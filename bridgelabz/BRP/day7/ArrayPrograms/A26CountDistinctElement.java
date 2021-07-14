package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:26.Write a program to count distinct elements of an array
 */
import java.util.Scanner;
public class A26CountDistinctElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j,count=0;
        int max=Integer.MIN_VALUE;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
            if(arr[j]>=max)
                max=arr[j];
        }
        int[] freq =new int[max+1];
        for(j=0;j<size;j++)
            freq[arr[j]]++;
        for(j=0;j<freq.length;j++)
        {
            if(freq[j]==1)
                count++;
        }
        System.out.println("Numbers of distinct elements are "+count);
    }
}

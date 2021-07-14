package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:10.Write a program to find the 2nd largest element in the array
 */
import java.util.Scanner;
public class ArrayP10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        int i=0,max=Integer.MIN_VALUE,sec_max=Integer.MIN_VALUE,j=0;
        System.out.println("Enter the Element of the array:");
        while(j<size)
        {
            arr[j]=sc.nextInt();
            j++;
        }
        while(i<size)
        {
            if(arr[i]>=max)
            {
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>=sec_max)
                sec_max=arr[i];
            i++;
        }
        System.out.println("The 2nd largest element of array: "+sec_max);
    }
}

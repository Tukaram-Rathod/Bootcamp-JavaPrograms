package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:7.Write a program to find the smallest element in the array
 */
import java.util.Scanner;
public class ArrayP7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        int i=0,min=Integer.MAX_VALUE,j=0;
        System.out.println("Enter the Element of the array:");
        while(j<size)
        {
            arr[j]=sc.nextInt();
            j++;
        }
        while(i<size)
        {
            if(arr[i]<=min)
                min=arr[i];
            i++;

        }
        System.out.println("The smallest element of array: "+min);
    }
}

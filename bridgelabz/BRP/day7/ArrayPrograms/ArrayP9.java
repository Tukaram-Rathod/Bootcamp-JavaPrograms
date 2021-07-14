package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:9.Write a program to find the 2nd smallest element in the array
 */
import java.util.Scanner;
public class ArrayP9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int[] arr =new int[size];
        int i=0,min=Integer.MAX_VALUE,sec_min=Integer.MAX_VALUE,j=0;
        System.out.println("Enter the Element of the array:");
        while(j<size)
        {
            arr[j]=sc.nextInt();
            j++;
        }
        while(i<size)
        {
            if(arr[i]<=min)
            {
                sec_min=min;
                min=arr[i];
            }
            else if(arr[i]<=sec_min)
                sec_min=arr[i];
            i++;
        }
        System.out.println("The 2nd smallest element of array: "+sec_min);
    }
}

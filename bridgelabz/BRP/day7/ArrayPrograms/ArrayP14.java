package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:14.Write a program to print array elements in reverse order using the swapping method.
 */
import java.util.Scanner;

public class ArrayP14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int[] arr =new int[size];
        int j=0,i,temp,k,temp2;
        System.out.println("Enter the Element of the array:");
        while(j<size)
        {
            arr[j]=sc.nextInt();
            j++;
        }
        temp=size;
        while(temp>=0)
        {
            for(k=0;k<temp-1;k++)
            {
                temp2=arr[k];
                arr[k]=arr[k+1];
                arr[k+1]=temp2;
            }
            temp--;
        }
        System.out.println("After reversing array is :");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

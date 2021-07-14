package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
* @Author: Tukaram Rathod
 * Purpose:15.Write a program to separate even and odd numbers in an array.
 */
import java.util.Scanner;
public class A15EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int[] arr =new int[size];
        int i,j=0;
        System.out.println("Enter the Element of the array:");
        while(j<size)
        {
            arr[j]=sc.nextInt();
            j++;
        }
        System.out.println("Odd numbers are:");
        for(i=0;i<size;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println("\nEven numbers are:");
        for(i=0;i<size;i++){
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

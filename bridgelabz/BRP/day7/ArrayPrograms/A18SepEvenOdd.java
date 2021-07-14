package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:18.Write a program to separate even and odd position numbers in an array.
 */
import java.util.Scanner;
public class A18SepEvenOdd {
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

        System.out.println("Even position numbers are:");
        for(i=0;i<size;i++)
        {
            if(i%2!=0)
                System.out.print(arr[i]+" ");
        }

        System.out.println("\nOdd position numbers are:");
        for(i=0;i<size;i++){
            if(i%2==0)
                System.out.print(arr[i]+" ");
        }
    }
}

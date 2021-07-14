package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:13.Write a program to print array elements in reverse order.
 */
import java.util.Scanner;

public class ArrayP13 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int[] arr =new int[size];
        int j;
        System.out.println("Enter the Element of Array :");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
        }
        System.out.println("Reverse Array -> :");
        for(int i=size-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }
    }
}

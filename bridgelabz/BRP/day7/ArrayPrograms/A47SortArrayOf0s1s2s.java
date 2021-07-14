package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:47.Write a Program to sort an array of 0s, 1s, and 2s.
 */
import java.util.Scanner;
public class A47SortArrayOf0s1s2s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j;
        size=sc.nextInt();
        int[] arr =new int[size];

        System.out.println("Enter the Element of the array(only 0s, 1s, and 2s):");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
                if(arr[i]>=arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }}
        System.out.print("After segregate 0s, 1s and 2s in an Array, Array is:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

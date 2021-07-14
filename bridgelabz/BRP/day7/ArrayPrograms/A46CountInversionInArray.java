package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:46.Write a Program to Count inversions in an array.
 */
import java.util.Scanner;
public class A46CountInversionInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.print("All the inversions are:");
        for(i=0;i<size-1;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    System.out.print("("+arr[i]+","+arr[j]+")");
                    count++;
                }
            }}
        if(count==0)
            System.out.print("(0)");
        else if(count==1)
            System.out.print("\nNumber of Inversions is "+count);
        else
            System.out.print("\nNumber of Inversions are "+count);
    }
}

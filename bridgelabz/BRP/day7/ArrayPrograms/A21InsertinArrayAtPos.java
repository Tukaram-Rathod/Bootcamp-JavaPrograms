package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:21.Write a program to insert an element into an array at a specified position
 */
import java.util.Scanner;
public class A21InsertinArrayAtPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i;
        size=sc.nextInt();
        int arr[ ]=new int[size+1];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele;
        System.out.print("\nEnter the element:");
        ele=sc.nextInt();
        System.out.print("Enter the position:");
        int pos;
        pos=sc.nextInt();
        System.out.print("\nBefore inserting array elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=size-1;i>=pos-1;i--)
            arr[i+1]=arr[i];
        arr[pos-1]=ele;
        System.out.print("\nAfter inserting array elements are:");
        for(i=0;i<size+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

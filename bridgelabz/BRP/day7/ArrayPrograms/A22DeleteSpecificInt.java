package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:22.Write a program to delete a specified integer in an array
 */
import java.util.Scanner;
public class A22DeleteSpecificInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,temp=0,pos=0;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele;
        System.out.print("\nEnter the element to be deleted:");
        ele=sc.nextInt();

        System.out.print("\nBefore deleting array elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(i=0;i<size;i++)
        {
            if(arr[i]==ele)
            {
                pos=i;
                temp=1;
            }
        }
        pos+=1;
        if(temp==1)
        {
            for(i=pos-1;i<size-1;i++)
                arr[i] = arr[i+1];
        }
        System.out.print("\nAfter deleting array elements are:");
        for(i=0;i<size-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

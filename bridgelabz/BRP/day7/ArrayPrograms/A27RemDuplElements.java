package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:27.Write a program to remove duplicate elements in an array
 */
import java.util.Scanner;
public class A27RemDuplElements {
    static void sort_arr(int arr[],int size)
    {
        int i,j,temp;
        //Sort the array
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int i,size,j=0;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
        }
        sort_arr(arr,size);
        j=0;
        //Remove duplicate element
        for(i=0;i<size-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[size-1];
        System.out.print("After removing duplicate element array is ");
        for(i=0;i<j;i++)
            System.out.print(arr[i]+" ");
    }
}

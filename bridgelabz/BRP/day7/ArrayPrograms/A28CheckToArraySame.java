package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:28.Write a program to check if two arrays are the same or not.
 */
import java.util.Scanner;
public class A28CheckToArraySame {
    static void sort_arr(int[] arr, int size)
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
    static int check_equals(int[] arr, int[] arr2, int size, int size2)
    {
        sort_arr(arr,size);
        sort_arr(arr2,size2);

        int i;
        if(size!=size2)
            return 0;

        for(i=0;i<size;i++)
        {
            if(arr[i]!=arr2[i])
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j=0;
        size=sc.nextInt();
        System.out.println("Enter the size of the 2nd array:");
        int size2=sc.nextInt();

        int[] arr =new int[size];
        int[] arr2 =new int[size2];
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
        }

        System.out.println("Enter the Element of the array:");
        for(j=0;j<size2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        if(check_equals(arr,arr2,size,size)==0)
            System.out.println("Not same....");
        else
            System.out.println("same....");
    }
}

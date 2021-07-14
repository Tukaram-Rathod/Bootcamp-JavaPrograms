package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:38.Write a Program to Move all zeros to the Start of an Array.
 */
import java.util.Scanner;
public class A38MoveAllZeroToStartOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=size-1;

        for(i=size-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[c]=arr[i];
                c--;
            }
        }
        for(i=c;i>=0;i--){
            arr[c]=0;
            c--;
        }
        System.out.println("After Move all zeros to Start, Array is:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:29.Write a program to check if two arrays are disjoint or not.
 */
import java.util.Scanner;
public class A29CheckToArrayDisjoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j=0;
        size=sc.nextInt();
        System.out.println("Enter the size of the 2nd array:");
        int size2=sc.nextInt();

        int arr[ ]=new int[size];
        int arr2[ ]=new int[size2];
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
        int count=0;
        for(int i=0;i<size;i++)
        {
            for(j=0;j<size2;j++)
            {
                if(arr[i]==arr2[j]){
                    count++;
                }
            }
        }
        if(count>=1)
            System.out.println("Arrays are not disjoint.");
        else
            System.out.println("Array are disjoint.");
    }
}

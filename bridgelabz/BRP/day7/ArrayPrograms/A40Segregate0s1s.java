package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:40.Write a Program to Segregate 0s and 1s in an array.
 */
import java.util.Scanner;
public class A40Segregate0s1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        System.out.println("Enter the Element of the array(only 0s and 1s):");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;

        for(i=0;i<size;i++)
        {
            if(arr[i]==0)
            {
                c++;
            }
        }
        for(i=0;i<c;i++){
            arr[i]=0;
        }
        for(i=c;i<size;i++){
            arr[i]=1;
        }
        System.out.println("After segregate 0s and 1s in an Array, Array is:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

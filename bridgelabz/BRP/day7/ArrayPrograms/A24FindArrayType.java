package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:24.Write a program to find the array type
 */
import java.util.Scanner;
public class A24FindArrayType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int i,odd_type=0,even_type=0,size;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("\nArray elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]%2==0)
                even_type++;
            else
                odd_type++;
        }
        if(even_type==size)
            System.out.println("\nEven type array");
        else if(odd_type==size)
            System.out.println("\nodd type array");
        else
            System.out.println("\nMixed array");
    }
}

package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:17. Write a program to print the most occurring elements.
 */
import java.util.Scanner;
public class A17MostOccuring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j;
        int max=Integer.MIN_VALUE;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
            if(arr[j]>=max)
                max=arr[j];
        }
        int[] freq =new int[max+1];
        for(j=0;j<size;j++)
            freq[arr[j]]++;

        int most_oc=0,most_v=0;
        for(j=0;j<size;j++)
        {
            if(freq[arr[j]]>most_oc)
            {
                most_oc=freq[arr[j]];
                most_v=arr[j];
            }
        }
        System.out.println( "The Most occurring Number "+most_v+" occurs "+most_oc+" times.");
    }
}

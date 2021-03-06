package com.bridgelabz.BRP.day3;
/*
 * @Author: Tukaram Rathod
 * Purpose:2. Given an array with 100 integers containing 1 to 100 and among them one number is
 * repeated twice. Write the Logic to find out the repeated number.
 */
import java.util.Scanner;
public class RepeatNumber {
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

        int list_oc=9999,list_v=9999;
        for(j=0;j<size;j++)
        {
            if(freq[arr[j]]<list_oc)
            {
                list_oc=freq[arr[j]];
                list_v=arr[j];
            }
        }
        System.out.println( "The list occurring Number "+list_v+" occurs "+list_oc+" times.");
    }
}



package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:44.Write a Program to Find a pair with maximum product in an array.
 */
import java.util.Scanner;
public class A44FindPairMaximumProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int First_element=arr[0], Second_element=arr[1],product,Max_Product=First_element*Second_element;

        for(i=0;i<size-1;i++)
        {

            for(j=i+1;j<size;j++)
            {
                product=arr[i]*arr[j];
                if(Math.abs(product)>Math.abs(Max_Product))
                {
                    Max_Product=product;
                    First_element=arr[i];
                    Second_element=arr[j];
                }
            }
        }
        System.out.println("Pair of Maximum Product is ("+First_element+","+Second_element+")");
        System.out.println("Maximum Product of 2 numbers is "+Max_Product);
    }
}

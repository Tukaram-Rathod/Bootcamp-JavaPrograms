package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:45.Write a Program to Find the maximum product of 3 numbers in an array.
 */
import java.util.Scanner;
public class A45FindMaximumProductOf3Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j,k;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int First_element=arr[0], Second_element=arr[1],third_element=arr[2],product,Max_Product=First_element*Second_element*third_element;

        for(i=0;i<size-2;i++)
        {

            for(j=i+1;j<size-1;j++)
            {
                for(k=j+1;k<size;k++)
                {
                    product=arr[i]*arr[j]*arr[k];
                    if(Math.abs(product)>=Math.abs(Max_Product))
                    {
                        Max_Product=product;
                        First_element=arr[i];
                        Second_element=arr[j];
                        third_element=arr[k];
                    }
                }
            }}
        System.out.println("Maximum Product of 3 numbers pair is ("+First_element+","+Second_element+","+third_element+")");
        System.out.println("Maximum Product of 3 numbers is "+Max_Product);

    }
}

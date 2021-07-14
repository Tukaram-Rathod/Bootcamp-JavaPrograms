package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:41.Write a Program to Find the median of two sorted arrays of different sizes.
 */
import java.util.Scanner;
public class A41FindMedianTwoSortedArrayOfDifferentSize {
    static void Find_median(int[] arr, int[] arr2, int size, int size2)
    {
        int m_size=size+size2;
        int[] merge_arr =new int[m_size];
        int i=0,k=0,j=0;
        while(k<m_size)
        {
            if(i<size)
            {
                merge_arr[k]=arr[i];
                i++;
                k++;
            }
            if(j<size2)
            {
                merge_arr[k]=arr2[j];
                j++;
                k++;
            }}

        if(m_size%2==1)
        {
            double median=merge_arr[m_size/2];
            System.out.println("Median= "+median);
        }
        else
        {
            double median=(merge_arr[m_size/2]+(merge_arr[(m_size/2)-1]))/2.0;
            System.out.println("Median= "+median);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j;
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

        Find_median(arr,arr2,size,size2);
    }
}

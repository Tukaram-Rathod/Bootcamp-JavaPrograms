package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:11.Write a program to Print the Average of Numbers in array at an even position
 */
import java.util.Scanner;
public class ArrayP11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size;
        size=sc.nextInt();
        int[] arr =new int[size];
        int j,sum=0,cout=0;
        double avg;
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
            if((j+1)%2==0){
                sum+=arr[j];
                cout++;
            }
        }
        avg=(double)sum/(double)cout;
        System.out.println("Average of Numbers in array at even position is "+avg);
        sc.close();
    }
}

package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:4.Write a program to input a string through the keyboard and print the same.
 */
import java.util.Scanner;
public class Arrayp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,i=0,j;
        System.out.println("Enter the size of the array:");
        size=sc.nextInt();
        char[] arr =new char[size];
        System.out.println("Enter the String:");
        for(j=0;j<size;j++){
            char c=sc.next().charAt(0);
            arr[j]=c;
        }
        while(i<size)
        {
            System.out.print(arr[i]);
            i++;
        }
    }
}

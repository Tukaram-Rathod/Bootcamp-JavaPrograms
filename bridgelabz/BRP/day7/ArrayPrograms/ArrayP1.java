package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:1.Write a program to print the marks obtained by a student in five tests.
 */
public class ArrayP1 {
    public static void main(String[] args) {
        int arr[ ]={95,88,77,45,69},i=0;
        System.out.print("Marks obtained by a student in five tests are:");
        while(i<5)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}



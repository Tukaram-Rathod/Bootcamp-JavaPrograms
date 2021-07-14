package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:3.Write a program to print a string using an array.
 */
public class Arrayp3 {
    public static void main(String[] args) {
        char[] arr ={'c','s','i','n','f','o','3','6','0','.','c','o','m'};
        int i=0;
        int len=arr.length;//Calculating size of the string
        while(i<len)
        {
            System.out.print(arr[i]);
            i++;
        }
    }
}

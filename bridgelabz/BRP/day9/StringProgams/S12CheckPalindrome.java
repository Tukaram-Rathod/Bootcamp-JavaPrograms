package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:13.Java Program to determine whether a given string is palindrome
 */
import java.util.Scanner;
public class S12CheckPalindrome {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = cs.nextLine();

        boolean flag = true;
        string = string.toLowerCase();

        for (int i=0;i<string.length()/2;i++){
            if (string.charAt(i)!= string.charAt(string.length()-i-1)){
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("String is Palindrome ");
        else
            System.out.println("String is Not Palindrome ");
    }
}

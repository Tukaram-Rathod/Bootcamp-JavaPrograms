package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:16.Java Program to find Reverse of the string
 */
import java.util.Scanner;
public class S15ReverseString {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = cs.nextLine();

        String reverseStr = " ";

        for (int i = str.length()-1;i>0;i--){
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println("Originak string : "+str);
        System.out.println("Reverse of given string : "+reverseStr);
    }
}

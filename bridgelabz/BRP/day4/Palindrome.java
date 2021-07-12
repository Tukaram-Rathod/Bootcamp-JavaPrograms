package com.bridgelabz.BRP.day4;
/*
* @Author: Tukaram Rathod
* Purpose: b.to check if the given String is palindrome or not? and return boolean value.
* Palindrome are those String whose reverse is equal to original. Do not use String
* Functions.
 */
import java.util.Scanner;
import com.bridgelabz.BRP.day4.Utility.Utility;
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Utility.checkPalindrome(str);
    }
}

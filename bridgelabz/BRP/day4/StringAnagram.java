package com.bridgelabz.BRP.day4;
/*
 * @Author: Tukaram Rathod
 * Purpose:a. to check if the given two strings are an Anagram and return boolean value. One
 * string is an anagram of another if the second is simply a rearrangement of the
 * first. For example, 'heart' and 'earth' are anagrams…
 */
import java.util.Scanner;
import com.bridgelabz.BRP.day4.Utility.Utility;
public class StringAnagram {
    public static void main(String[] args) {
        System.out.println("Enter First String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("Enter Second String: ");
        String str2 = scan.next();
        Utility.checkAnagram(str,str2);
    }
}

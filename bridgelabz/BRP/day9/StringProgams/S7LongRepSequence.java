package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:8.Java Program to find the longest repeating sequence in a string
 */
import java.util.Scanner;
public class S7LongRepSequence {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = cs.nextLine();

        String lrs="";

        int n = str.length();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                String x = lcp(str.substring(i,n),str.substring(j,n));
                if (x.length() > lrs.length())
                    lrs=x;
            }
        }
        System.out.println("Longest repeating sequence: "+lrs);
    }
    private static String lcp(String substring, String substring1) {
        int n = Math.min(substring.length(),substring1.length());
        for (int i=0; i<n;i++){
            if (substring.charAt(i)!= substring1.charAt(i)){
                return substring.substring(0,i);
            }
        }
        return substring.substring(0,n);
    }
}

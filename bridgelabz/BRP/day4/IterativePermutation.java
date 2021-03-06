package com.bridgelabz.BRP.day4;
/*
 * @Author: Tukaram Rathod
 * Purpose: c. to return all permutation of a String using Iterative method
 */
import java.util.Scanner;
public class IterativePermutation {
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        String str1;
        System.out.println("Enter your String : ");
        str1 = cs.nextLine();
        printPermutn(str1,"");
    }
}

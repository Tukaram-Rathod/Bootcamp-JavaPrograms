package com.bridgelabz.BRP.day4;
/*
 * @Author: Tukaram Rathod
 * Purpose:d. to return all permutation of a String using Recursion method
 */
import java.util.Scanner;
public class RecursionPermutation {
    // Utility function to swap two characters in a character array
    private static void swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] ch, int currentIndex)
    {
        if (currentIndex == ch.length - 1) {
            System.out.println(String.valueOf(ch));
        }
        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        String str1;
        System.out.println("Enter your String : ");
        str1 = cs.nextLine();
        permutations(str1.toCharArray(), 0);
    }
}

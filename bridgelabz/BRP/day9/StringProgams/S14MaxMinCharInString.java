package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:15.Java Program to find maximum and minimum occurring character in a string
 */
import java.util.Scanner;
public class S14MaxMinCharInString {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String str = cs.nextLine();

        int[] freq = new int[str.length()];
        char minChar = str.charAt(0),maxChar = str.charAt(0);

        int i,j,min,max;

        char string[] = str.toCharArray();

        for (i=0;i<string.length;i++){
            freq[i]=1;
            for (j = i+1;j<string.length;j++){
                if (string[i] == string[j] && string[i]!=' ' && string[i]!= '0'){
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        min = max = freq[0];
        for (i=0;i< freq.length;i++){
            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if (min > freq[i] && freq[i]!='0'){
                min = freq[i];
                minChar = string[i];
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if (max < freq[i]){
                max = freq[i];
                maxChar = string[i];
            }
        }
        System.out.println("Minimum occuring character:"+minChar);
        System.out.println("Minimum occuring character:"+maxChar);
    }


}

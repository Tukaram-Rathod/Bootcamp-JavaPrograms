package day0.StringProgams;

import java.util.Scanner;
/*
Java Program to Count the Total Number of Punctuation Characters Exists in a String
 */
public class S2CountPunctuations {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter String");
        String string = cs.nextLine();

        int count=0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='!' || string.charAt(i)=='.' || string.charAt(i)=='\'' || string.charAt(i)=='_' ||
                 string.charAt(i)=='\"' || string.charAt(i)=='?' ||string.charAt(i)==';')
                count++;
        }
        System.out.println("Total Number of Punctuation exists in the String is:" +count);
    }
}

package day0.StringProgams;

import java.util.Locale;
import java.util.Scanner;
/*
4) Java Program to count the total number of vowels and consonants in a string
 */
public class S3CountvowelsAndConsonants {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int vCount=0,cCount=0;
        System.out.println("Enter String");
        String string = cs.nextLine();

        string =string.toLowerCase();

        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' ||
                    string.charAt(i)=='u' )
                vCount++;
            else if (string.charAt(i) >='a' && string.charAt(i)<='z')
                cCount++;
        }
        System.out.println("Total Number of vowels is: " +vCount);
        System.out.println("Total Number of consonants is: " +cCount);
    }
}

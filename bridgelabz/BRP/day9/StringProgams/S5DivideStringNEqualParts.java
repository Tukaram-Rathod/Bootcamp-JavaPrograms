package day0.StringProgams;

import java.util.Scanner;
/*
6) Java Program to divide a string in 'N' equal parts.
 */
public class S5DivideStringNEqualParts {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = cs.nextLine();

        int len = string1.length();
        int n ,temp = 0;

        System.out.println("Enter the nth value ");
        n = cs.nextInt();

        int chars = len/n;
        String[] equalStr = new String[n];

        if (len % n!=0)
            System.out.println("string cannot be divided into "+ n + " Equal parts.");
        else {
            for (int i=0;i<len;i=i+chars){
                String part = string1.substring(i,i+chars);
                equalStr[temp] = part;
                temp++;
            }
            System.out.println(n + " equal parts of given string are ");

            for (int i =0;i< equalStr.length;i++)
                System.out.println(equalStr[i]);
        }
    }
}

package day0.StringProgams;

import java.util.Scanner;
/*
1) Java Program to count the total number of characters in a string
 */
public class S1CountChar {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter String");
        String string = cs.nextLine();

        int count=0;
        for (int i=0;i< string.length();i++){
            if (string.charAt(i)!=' ')
                count++;
        }
        System.out.println("Total Number of Characters in String:" +count);
    }
}

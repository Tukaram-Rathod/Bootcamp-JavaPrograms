package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:12.Java Program to replace the spaces of a string with a specific character
 */
import java.util.Scanner;
public class S11RepSpaceWithChar {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = cs.nextLine();
        System.out.println("Enter the Character for replacement ");
        char ch = cs.next().charAt(0);

        string = string.replace(' ',ch);

        System.out.println("String after replacing spaces with given character:");
        System.out.println(string);
    }

}

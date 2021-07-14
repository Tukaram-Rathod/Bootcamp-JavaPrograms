package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:14.Java Program to determine whether one string is a rotation of another
 */
import java.util.Scanner;
public class S13CheckStringRotationAnotherString {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String string1 = cs.nextLine();
        System.out.println("Enter the 2nd String:");
        String string2 = cs.nextLine();

        if (string1.length()!=string2.length())
            System.out.println("Second String is not a rotation of first string");
        else {
            string1 =string1.concat(string1);
            if (string1.indexOf(string2)!=-1)
                System.out.println("2nd String is Rotation of 1st String");
            else
                System.out.println("2nd String is Not a Rotation of 1st String");
        }
    }
}

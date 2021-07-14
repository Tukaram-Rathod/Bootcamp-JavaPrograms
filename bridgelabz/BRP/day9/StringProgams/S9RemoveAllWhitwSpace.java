package com.bridgelabz.BRP.day9.StringProgams;
/*
 * @Author: Tukaram Rathod
 * Purpose:10.Java Program to remove all the white spaces from a string
 */
import java.util.Scanner;
public class S9RemoveAllWhitwSpace {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = cs.nextLine();

        str = str.replaceAll("\\s+","");
        System.out.println("String after removing all the white spaces : "+str);
    }
}

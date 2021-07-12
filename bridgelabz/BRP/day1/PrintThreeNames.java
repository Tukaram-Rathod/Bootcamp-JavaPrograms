package com.bridgelabz.BRP.day1;
/*
 * @Author: Tukaram Rathod
 *  purpose:1.Write a program “ PrintThreeNames.java ” that takes three names as input and
 *  prints out a proper sentence with the names in the reverse of the order given, so
 *  that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
 *  and Alice.".
 */
import java.util.Scanner;
public class PrintThreeNames {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int size;
        size = cs.nextInt();
        String Names[] = new String[size];
        int j;
        System.out.println("Enter Elements of Array : ");

        for (int i=0;i<size;i++){
            Names[i]= cs.nextLine();
        }
        System.out.println("After Reversing Array Elements--> ");

        System.out.print("Hi ");
        for (int i=size-1;i>=0;i--)
            System.out.print("" +Names[i]+ " ");
    }
}

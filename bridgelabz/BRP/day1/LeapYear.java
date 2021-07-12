package com.bridgelabz.BRP.day1;
/*
 * @Author: Tukaram Rathod
 *  purpose:1. Write a LeapYear.java program that takes a year as input and outputs the Year
 *  is a Leap Year or not a Leap Year.
 *  The LeapYear program only works for year >= 1582, corresponding to a year in
 *  the Gregorian calendar. So ensure to check for the same. Further the Leap Year
 *  is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is
 *  not a Leap Year and 2000 is a Leap Year.
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = cs.nextInt();
        if (((year % 4 == 0) && (year % 100!=0)) || (year %400 ==0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}

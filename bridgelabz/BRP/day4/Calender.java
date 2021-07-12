package com.bridgelabz.BRP.day4;
/*
* @Author: Tukaram Rathod
 * Purpose: 1.Extend the exercise done in Week 1 to create Calendar.java and write a Static
 * Function to find Day Of Week that takes a date as input and returns the day of the
 * week that date falls on.
 * 2. To Calendar.java that takes the month and year as command-line arguments and
 * prints the Calendar of the month as shown below. It uses the Day Of Week function
 * to find Calendar Dates..
 */
import com.bridgelabz.BRP.day4.Utility.Utility;
import java.util.Scanner;
public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month;
        boolean isLeapYear;
        int days;
        int day;

        int[] daysPerYear = { 31, 28, 30, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("Enter month");
        month = scanner.nextInt();
        if (month > 0 && month <= 12) {
            System.out.println("Enter year");
            year = scanner.nextInt();
            if (year > 1582 && year < 9999) {
                isLeapYear = Utility.is_LeapYear(year);

                if (isLeapYear && month == 2) {
                    days = 29;
                    day = Utility.calculateDay_Of_Week(1, month, year);
                    Utility.printCalendar(day, days);

                } else {
                    days = daysPerYear[month - 1];
                    day = Utility.calculateDay_Of_Week(1, month, year);
                    Utility.printCalendar(day, days);
                }
            } else
                System.out.println("please enter valid year");
        } else
            System.out.println("Please enter valid month");
        scanner.close();
    }
}

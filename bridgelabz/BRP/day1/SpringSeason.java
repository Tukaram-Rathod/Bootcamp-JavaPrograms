package com.bridgelabz.BRP.day1;
/*
 * @Author: Tukaram Rathod
 *  purpose:2. Write a program SpringSeason.java that takes two int values m and d from the
 *  command line and prints true if day d of month m is between March 20 (m = 3, d
 *  =20) and June 20 (m = 6, d = 20), false otherwise.
 */
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter Month : ");
        int month = cs.nextInt();
        System.out.println("Enter Day : ");
        int day = cs.nextInt();

        if ((month == 4 || month == 5) && (day <= 30 && day != 0)){
            System.out.println("True");
        }
        else if (month == 6 && day <= 20){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}

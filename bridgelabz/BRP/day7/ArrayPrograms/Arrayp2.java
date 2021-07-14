package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:2.Write a program to print the average marks obtained by a student in five tests
 */
import java.util.Scanner;
public class Arrayp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double avg,sum=0.0;
        double arr[]=new double[5];
        int i=0,j=0;
        System.out.print("Enter the five test Marks:\n");
        while(i<5)
        {
            arr[i]=sc.nextDouble();
            i++;
        }
        while(j<5)
        {
            sum+=arr[j];
            j++;
        }
        avg=sum/5.0;
        System.out.println("Average of five tests marks is: "+avg);

    }
}

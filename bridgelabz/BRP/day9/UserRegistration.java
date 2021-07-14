package com.bridgelabz.BRP.day9;
/*
 * @Author: Tukaram Rathod
 * Purpose:Write a Program to Register a User. The registration of User takes in following inputs
 * and applies regular expression to ensure valid input is done.
 */
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
    static String fName;
    static String lName;
    static String email;
    static String  pNum;
    static String pass;
    static String ccName;

    //Creating an function for every section of Address book.
    public static String firstName(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your First Name :");
        fName = sc1.nextLine();
        return fName;
    }
    public static String lastName(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Your Last Name :");
        lName = sc2.nextLine();
        return lName;
    }

    public static String emailId(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Your Email-Id :");
        email = sc3.nextLine();
        return email;
    }
    public static String Pasword(){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter Your Password :");
        pass= sc4.nextLine();
        return pass;
    }
    public static String phoneNum(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter Your Mobile Number :");
        pNum = sc5.nextLine();
        return pNum;
    }
    public static void compName(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println(" Company Name - 0 \t Not Inrested -1");
        int choice =sc1.nextInt();


        switch (choice) {
            case 0 -> {
                ccName = sc1.next();
                System.out.println("Company Name=" + ccName);
            }
            case 1 -> System.out.println("Not Interested");
            default -> System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());

        boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());

        boolean emailId = Pattern.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}",UserRegistration.emailId());

        boolean Pasword = Pattern.matches("^(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}",UserRegistration.Pasword());

        boolean phoneNum = Pattern.matches("^\\d{10}$",UserRegistration.phoneNum());

        UserRegistration.compName();
        //Here we check if the user input is Valid it get print as it is.
        //otherwise it print invalid user input

        if (firstName) {
            System.out.println("First Name: " + fName);
        }
        else {
            System.out.println("Invalid");}
        if (lastName) {
            System.out.println("Last Name: " + lName);
        }
        else {
            System.out.println("Invalid");}

        if (emailId) {
            System.out.println("Email id: " + email);
        }
        else {
            System.out.println("Invalid");
        }
        if (Pasword) {
            System.out.println("Security Password: " + pass);
        }
        else {
            System.out.println("Invalid");
        }
        if (phoneNum) {
            System.out.println("Mobile number: " + pNum);
        }
        else {
            System.out.println("Invalid");
        }
    }
}

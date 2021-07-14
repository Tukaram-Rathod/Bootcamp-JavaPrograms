package com.bridgelabz.BRP.day7;
/*
 * @Author: Tukaram Rathod
 * Purpose:ArrayFunction
 */
public class ArrayFunction {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,8,3};

        boolean primeNum = true;
        for (int i = 0; i < arr.length; i++) {
            primeNum = true;

        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                {
                    primeNum = false;
                }
            }

            if (primeNum == true)
            {
                System.out.println(i);
            }

        }
    }
}

package com.bridgelabz.BRP.day4;
/*
 * @Author: Tukaram Rathod
 * Purpose:e. to check if the arrays returned by two string functions above are equal.
 */
import java.util.Arrays;
public class ArrayEquals {
    public static void main (String[] args)
    {
        //defining array to compare
        String[] inarray1 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"};
        String[] inarray2 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"}; Object[] array1 = {inarray1};  // array1 have only one element
        Object[] array2 = {inarray2};  // array2 also have only one element
        //comparing two arrays using equals() method
        if (Arrays.deepEquals(array1, array2))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}

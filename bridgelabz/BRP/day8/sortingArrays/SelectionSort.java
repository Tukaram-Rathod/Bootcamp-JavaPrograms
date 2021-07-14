package com.bridgelabz.BRP.day8.sortingArrays;
/*
 * @Author: Tukaram Rathod
 * Purpose:SelectionSort
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={36,19,29,12,5,55,701,101,111};
        int flag=0;
        int min;
        for (int i=0;i<a.length;i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
}

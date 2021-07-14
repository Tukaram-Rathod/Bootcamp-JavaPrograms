package com.bridgelabz.BRP.day6;
/*
 * @Author: Tukaram Rathod
 * Purpose:BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={36,19,29,12,5,55,701,101,111};
        int flag=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if (flag==0)
                break;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
}

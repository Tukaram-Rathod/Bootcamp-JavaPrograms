package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose: BubbleStringSortArray
 */
public class BubbleStringSortArray {
    public static void main(String[] args) {
        String[] a= {"deepak","amit","rahul","vironika","deepesh","rohit"};
        String temp;
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j].compareTo(a[j+1])>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}

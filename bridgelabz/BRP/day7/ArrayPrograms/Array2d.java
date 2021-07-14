package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:Array2d
 */

public class Array2d {
    public static void main(String[] args) {
        int[][] a= {{10,30,20},{30,40},{70,80,90}};

        for (int i=0;i<=a.length;i++){
            for (int j=0;j<=a.length;i++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

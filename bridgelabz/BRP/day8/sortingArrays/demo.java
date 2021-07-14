package com.bridgelabz.BRP.day8.sortingArrays;
/*
 * @Author: Tukaram Rathod
 * Purpose:demo
 */
public class demo {
    public static void main(String[] args) {
        int[][] a={{10,20},{40,50,60}};
        int[][] b= {{10,30,20},{30,40,20}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<=b.length;i++){
            for (int j=0;j<=b.length;i++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

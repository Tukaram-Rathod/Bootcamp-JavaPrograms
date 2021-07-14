package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose:minMaxNumberArray
 */
public class minMaxNumberArray {
    public static void main(String[] args) {
        System.out.println("searching min amd max elements:");
        searchMax();
        searchMin();
    }
    private static void searchMax() {
        int[]a={4,3,5,2,1,6,10};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (max<a[i])
                max=a[i];
        }
        System.out.println("maximum elements :" +max);
    }
    public static void searchMin(){
        int[]b={4,3,5,2,6,11};
        int min=b[0];
        for (int i=1;i<b.length;i++){
            if (min>b[i])
                min=b[i];
        }
        System.out.println("minimum elements :" +min);
    }
}

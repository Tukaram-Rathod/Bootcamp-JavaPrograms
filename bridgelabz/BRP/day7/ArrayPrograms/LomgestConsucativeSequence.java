package com.bridgelabz.BRP.day7.ArrayPrograms;
/*
 * @Author: Tukaram Rathod
 * Purpose: Longest Consucative Sequence
 */
import java.util.HashSet;
public class LomgestConsucativeSequence {
    public static void main(String[] args) {
        int[] a={3,9,1,10,4,20,2,11,12};
        HashSet<Integer> hs = new HashSet<>();
        for (int i =0;i<a.length;i++)
            hs.add(a[i]);
        int long_lenth=0;
        for (int i=0;i<a.length;i++){
            if (!hs.contains(a[i]-1)){
                int no=a[i];
                while (hs.contains(no)){
                    no++;
                }
                if (long_lenth<no-a[i]){
                    long_lenth=no-a[i];
                }
            }
        }
        System.out.println("Longest Sub Seq lenth is:"+long_lenth);
    }
}

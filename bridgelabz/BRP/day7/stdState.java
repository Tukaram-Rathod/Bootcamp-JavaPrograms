package com.bridgelabz.BRP.day7;

import java.util.Arrays;

public class stdState {
    public static void main(String[] args) {
        int[] arr = {9,5,4,2,1,7,8,3};
        int left = 0;
        int right = arr.length - 1;
        int even = 0;
        Arrays.sort(arr);
        while(left < right)
        {
            left++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package day0.Array;

import java.util.Scanner;

/*
35. Write a Program to Find a pair with a given sum in the array.
 */
public class A35FindPairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i,j;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Sum Value:");
        int sum=sc.nextInt();
        int flag=0;
        for(i=0;i<size-1;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==sum)
                {  flag=1;
                    System.out.print("Given sum pairs of elements are "+arr[i]+" and "+arr[j]+".\n");
                }
            }
        }
        if(flag==0)
            System.out.print("Given sum Pair is not Present.");
    }
}

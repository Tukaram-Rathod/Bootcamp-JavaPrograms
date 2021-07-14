package day0.Array;

import java.util.Scanner;
/*
30. Write a program to check if one array is a subset of another array or not.
 */
public class A30CheckArrayIsSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j;
        size=sc.nextInt();
        System.out.println("Enter the size of the 2nd array:");
        int size2=sc.nextInt();

        int[] arr =new int[size];
        int[] arr2 =new int[size2];
        System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
        }

        System.out.println("Enter the Element of the array:");
        for(j=0;j<size2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        int i,count=0;

        for(i=0;i<size;i++)
        {
            for(j=0;j<size2;j++)
            {
                if(arr[i]==arr2[j]){
                    count++;
                }
            }
        }
        if(count==size2)
            System.out.println("Array two is a subset of array one.");
        else
            System.out.println("Array two is not a subset of array one");
    }
}

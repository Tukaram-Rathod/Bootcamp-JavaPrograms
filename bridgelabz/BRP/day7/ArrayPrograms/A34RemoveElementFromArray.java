package day0.Array;

import java.util.Scanner;
/*
34. Write a Program to remove an element from an array by index.
 */
public class A34RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pos;
        System.out.print("\nEnter the position of the Element:");
        pos=sc.nextInt();

        System.out.print("\nBefore deleting array elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        pos+=1;

        for(i=pos-1;i<size-1;i++)
            arr[i] = arr[i+1];

        System.out.print("\nAfter Deleting Array Element are:");
        for(i=0;i<size-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

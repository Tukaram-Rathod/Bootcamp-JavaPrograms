package day0.Array;

import java.util.Scanner;
/*
37. Write a Program to Move all zeros to the end of an Array.
 */
public class A37MoveAllZeroToEndOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,i;
        size=sc.nextInt();
        int arr[ ]=new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;

        for(i=0;i<size;i++)
        {
            if(arr[i]!=0)
            {
                arr[c]=arr[i];
                c++;
            }
        }
        for(i=c;i<size;i++){
            arr[c]=0;
            c++;
        }
        System.out.println("After Move all zeros to end, Array is:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

package day0.Array;

import java.util.Scanner;
/*
33. Write a Program to Merge two unsorted arrays of different lengths.
 */
public class A33Merge2unsortArray {
    static void Merge_Array(int arr[],int arr2[],int size,int size2)
    {
        int m_size=size+size2;
        int merge_arr[ ]=new int[m_size];
        int i=0,k=0,j=0;
        while(k<m_size)
        {
            if(i<size)
            {
                merge_arr[k]=arr[i];
                i++;
                k++;
            }
            if(j<size2)
            {
                merge_arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        int p;
        System.out.print("After Merge two Array element are:");
        for(p=0;p<m_size;p++)
        {
            System.out.print(merge_arr[p]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size,j=0;
        size=sc.nextInt();
        System.out.println("Enter the size of the 2nd array:");
        int size2=sc.nextInt();

        int arr[ ]=new int[size];
        int arr2[ ]=new int[size2];
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

        Merge_Array(arr,arr2,size,size2);
    }
}

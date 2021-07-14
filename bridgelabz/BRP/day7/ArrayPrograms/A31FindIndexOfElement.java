package day0.Array;
/*
31. Write a Program to Find the index of an element in an array.
 */
import java.util.Scanner;

public class A31FindIndexOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int i,temp=0,size;
        size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the Element of the array:");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele;
        System.out.print("\nEnter the search element:");
        ele=sc.nextInt();

        System.out.print("\nArray elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int index = 0;
        for(i=0;i<size;i++)
        {
            if(arr[i]==ele)
            {
                temp=1;
                index=i;
            }
        }
        if(temp==1)
            System.out.print("\nIndex of Search Element "+ele+" is "+index);
        else
            System.out.print("\nElement is not found....");
    }
}

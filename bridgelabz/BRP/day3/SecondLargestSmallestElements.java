package com.bridgelabz.BRP.day3;
/*
 * @Author: Tukaram Rathod
 * Purpose:3. Write a program to find the 2nd largest and the 2nd smallest element from an
 * unsorted array and without sorting the array.
 */
public class SecondLargestSmallestElements {
    public static void main(String[] args) {
        int []a={619,189,100,444,133,131,505,177,600,190};
        SecondLargest();
        SecondSmallest();
        SecondLargestMaxValue();
        SecondSmallestMinValue();
    }
    private static void SecondLargest(){
        int []a={619,189,100,444,133,131,505,177,600,190};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] < a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if (i==1)//if kth position then if(i==k-1)
                break;
        }
        System.out.println();
        System.out.println("Second largest elements : "+a[1]);
    }
    private static void SecondSmallest(){
        int []a={619,189,100,444,133,131,505,177,600,190};
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] > a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if (i==1)
                break;
        }
        System.out.println("Second Smallest elements : "+a[1]);
    }
    private static void SecondLargestMaxValue(){
        int []a={619,189,100,444,133,131,505,177,600,190};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i]>largest){
                second_largest=largest;
                largest=a[i];
            }
            else if (a[i]>second_largest && a[i]!=largest){
                second_largest=a[i];
            }
        }
        if (second_largest==Integer.MIN_VALUE)
            System.out.println("no second largest elements:");
        else
            System.out.println("Second Largest elements is : "+second_largest);
    }
    private static void SecondSmallestMinValue(){
        int []a={619,189,100,444,133,131,505,177,600,190};
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i] < smallest){
                second_smallest=smallest;
                smallest=a[i];
            }
            else if (a[i] < second_smallest && a[i]!=smallest){
                second_smallest=a[i];
            }
        }
        if (second_smallest==Integer.MIN_VALUE)
            System.out.println("no second smallest elements:");
        else
            System.out.println("Second Smallest elements is : "+second_smallest);
    }

}

package com.practice.coderbyte;

/**
 * GCF
 * Have the function GCF(arr) take the array of numbers
 * stored in arr which will always contain only
 * two positive integers, and return the greatest common
 * factor of them. For example: if arr is [45, 12] then your
 * program should return 3. There will always be two elements
 * in the array and they will be positive integers.
 * Examples
 * Input: new int[] {1, 6}
 * Output: 1
 * Input: new int[] {12, 28}
 * Output: 4
 */
public class GCF {
    public static int GCF(int[] arr) {
        // code goes here
        int first=arr[0];
        int second=arr[1];
        int end=0;
        int GCF=0;
        if(first==second)
            return first;
        if(first>second){
            end=first;
        }
        else
            end=second;
        for(int i=1;i<end;i++){
            if(first%i==0 && second%i==0){
                GCF=i;
            }
        }
        return GCF;
    }

    public static void main (String[] args) {
        // keep this function call here
        int num[]=new int[] {12,12};
        System.out.print(GCF(num));
    }
}

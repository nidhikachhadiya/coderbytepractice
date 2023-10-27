package com.practice.coderbyte;

import java.util.Arrays;

/**
 * Array Addition I
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and return the string true if any combination of numbers in the array (excluding the largest number) can be added up to equal the largest number in the array, otherwise return the string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, and may contain negative numbers.
 * Examples
 * Input: new int[] {5,7,16,1,2}
 * Output: false
 * Input: new int[] {3,5,-1,8,12}
 * Output: true
 */
public class ArrayAdditionI {
    public static String ArrayAdditionI(int[] arr) {
        // code goes here
        int rest=0;
        int sum = 0;
        int largest = 0;
        for(int a: arr) {
            if (a > largest) {
                largest = a;
            }
        }
        for(int x=0; x<arr.length; x++)
        {
            if(arr[x] != largest)
                rest += arr[x];
        }
        if(rest < largest)
            return "false";
        return "true";
    }


    public static void main (String[] args) {
        // keep this function call here
       int num[]=new int[] {2,4,7,12};
        System.out.print(ArrayAdditionI(num));
    }
}

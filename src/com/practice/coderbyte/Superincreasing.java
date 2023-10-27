package com.practice.coderbyte;

/**
 * Superincreasing
 * Have the function Superincreasing(arr) take the array of numbers stored in arr and determine if the array forms a superincreasing sequence where each element in the array is greater than the sum of all previous elements. The array will only consist of positive integers. For example: if arr is [1, 3, 6, 13, 54] then your program should return the string "true" because it forms a superincreasing sequence. If a superincreasing sequence isn't formed, then your program should return the string "false"
 * Examples
 * Input: new int[] {1,2,3,4}
 * Output: false
 * Input: new int[] {1,2,5,10}
 * Output: true
 */

public class Superincreasing {

    public static String Superincreasing(int[] arr) {
        // code goes here
        int runningSum = 0;
        for(int a : arr){
            if(runningSum >= a)
                return "false";
            runningSum += a;
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        int num[]=new int[] {1, 3, 6, 13, 54};
        System.out.print(Superincreasing(num));
    }
}

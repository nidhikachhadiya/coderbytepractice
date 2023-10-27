package com.practice.coderbyte;

/**
 * Three Sum
 * Have the function ThreeSum(arr) take the array of integers stored in arr, and determine if any three distinct numbers (excluding the first element) in the array can sum up to the first element in the array. For example: if arr is [8, 2, 1, 4, 10, 5, -1, -1] then there are actually three sets of triplets that sum to the number 8: [2, 1, 5], [4, 5, -1] and [10, -1, -1]. Your program should return the string true if 3 distinct elements sum to the first element, otherwise your program should return the string false. The input array will always contain at least 4 elements.
 * Examples
 * Input: new int[] {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2}
 * Output: true
 * Input: new int[] {12, 3, 1, -5, -4, 7}
 * Output: false
 */
public class ThreeSum {
    public static String ThreeSum(int[] arr) {
        // code goes here
      String result="false";
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    System.out.println(sum);
                    if(sum==arr[0]) {
                        if (arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k]) ;
                        {
                            System.out.println("inside if");
                            result = "true";
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        int num[]=new int[]{10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2};
        System.out.print(ThreeSum(num));
    }
}

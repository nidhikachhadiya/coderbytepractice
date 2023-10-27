package com.practice.coderbyte;

/**
 * Have the function TwoSum(arr) take the array of integers stored in arr, and determine if any two numbers (excluding the first element) in the array can sum up to the first element in the array. For example: if arr is [7, 3, 5, 2, -4, 8, 11], then there are actually two pairs that sum to the number 7: [5, 2] and [-4, 11]. Your program should return all pairs, with the numbers separated by a comma, in the order the first number appears in the array. Pairs should be separated by a space. So for the example above, your program would return: 5,2 -4,11
 *
 * If there are no two numbers that sum to the first element in the array, return -1
 * Examples
 * Input: new int[] {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}
 * Output: 6,11 10,7 15,2
 * Input: new int[] {7, 6, 4, 1, 7, -2, 3, 12}
 * Output: 6,1 4,3
 */
public class TwoSum {

    public static String TwoSum(int[] arr) {
        String result="";
        // code goes here
        for(int i=1;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == arr[0]) {
                    result = result + " " + (arr[i]) + "," + arr[j];
                }

            }
        }
            if(result.length()>1)
              result=result.substring(1,result.length());
            else
                result="-1";
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
       int nums[]= new int[] {100, 90};
        System.out.print(TwoSum(nums));
    }
}

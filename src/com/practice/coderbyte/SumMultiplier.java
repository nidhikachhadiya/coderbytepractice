package com.practice.coderbyte;

/**
 * Have the function SumMultiplier(arr) take the array of numbers stored in arr and return the string true if any two numbers can be multiplied so that the answer is greater than double the sum of all the elements in the array. If not, return the string false. For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3] then the sum of all these elements is 42 and doubling it is 84. There are two elements in the array, 16 * 6 = 96 and 96 is greater than 84, so your program should return the string true.
 * Examples
 * Input: new int[] {2, 2, 2, 2, 4, 1}
 * Output: false
 * Input: new int[] {1, 1, 2, 10, 3, 1, 12}
 * Output: true
 */
public class SumMultiplier {

    public static String SumMultiplier(int[] arr) {
        // code goes here
        int sum=0;
        int dobuleofsum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        dobuleofsum=sum*2;
        System.out.println(dobuleofsum);
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if((arr[i]*arr[j])>dobuleofsum){
                    return "true";
                }
            }
        }

        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        int num[]=new int[] {4, 5, 5, 5, 12};
        System.out.print(SumMultiplier(num));
    }
}

package com.practice.coderbyte;

/**
 * Closest Enemy
 * Have the function ClosestEnemy(arr) take the array of numbers stored in arr and from the position in the array where a 1 is, return the number of spaces either left or right you must move to reach an enemy which is represented by a 2. For example: if arr is [0, 0, 1, 0, 0, 2, 0, 2] then your program should return 3 because the closest enemy (2) is 3 spaces away from the 1. The array will contain any number of 0's and 2's, but only a single 1. It may not contain any 2's at all as well, where in that case your program should return a 0.
 * Examples
 * Input: new int[] {1, 0, 0, 0, 2, 2, 2}
 * Output: 4
 * Input: new int[] {2, 0, 0, 0, 2, 2, 1, 0}
 * Output: 1
 */
public class ClosestEnemy {

    public static int ClosestEnemy(int[] arr) {
        // code goes here
        int foundoneat=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                for(int j=0;j<i;j++){
                    if(arr[j]==2){
                        foundoneat=Math.min(foundoneat,i-j);
                    }
                }
                for(int k = i + 1; k < arr.length; k++) {
                    if(arr[k] == 2) {
                        foundoneat = Math.min(foundoneat, k - i);
                    }
                }
            }

        }
        if(foundoneat == Integer.MAX_VALUE)  {
            return 0;
        }
        return foundoneat;

    }

    public static void main (String[] args) {
        // keep this function call here
        int num[]= new int[] {2, 0, 0, 0, 2, 2, 1, 0};
        System.out.print(ClosestEnemy(num));
    }
}

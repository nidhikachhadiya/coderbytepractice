package com.practice.coderbyte;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Changing Sequence
 * Have the function ChangingSequence(arr) take the array of numbers stored in arr and return the index at which the numbers stop increasing and begin decreasing or stop decreasing and begin increasing. For example: if arr is [1, 2, 4, 6, 4, 3, 1] then your program should return 3 because 6 is the last point in the array where the numbers were increasing and the next number begins a decreasing sequence. The array will contain at least 3 numbers and it may contains only a single sequence, increasing or decreasing. If there is only a single sequence in the array, then your program should return -1. Indexing should begin with 0.
 * Examples
 * Input: new int[] {-4, -2, 9, 10}
 * Output: -1
 * Input: new int[] {5, 4, 3, 2, 10, 11}
 * Output: 3
 */
public class ChangingSequence {

    public static int ChangingSequence(int[] arr)
        {
            if (arr.length < 2) return -1;
            boolean increaing = arr[1] > arr[0];

            for (int i = 2; i < arr.length; i++)
            {
                boolean trendIncreasing = arr[i] > arr[i-1];
                if (increaing != trendIncreasing)
                    return i - 1;
            }
            return -1;
    }
    public static void main (String[] args) {
        // keep this function call here
        int num[]=new int[] {1, 2, 4, 6, 4, 3, 1};
        System.out.print(ChangingSequence(num));
    }

}

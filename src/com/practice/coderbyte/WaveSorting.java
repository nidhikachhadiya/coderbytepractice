package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Wave Sorting
 * Have the function WaveSorting(arr) take the array of positive integers stored in arr and return the string true if the numbers can be arranged in a wave pattern: a1 > a2 < a3 > a4 < a5 > ..., otherwise return the string false. For example, if arr is: [0, 1, 2, 4, 1, 4], then a possible wave ordering of the numbers is: [2, 0, 4, 1, 4, 1]. So for this input your program should return the string true. The input array will always contain at least 2 elements. More examples are given below as sample test cases.
 * Examples
 * Input: new int[] {0, 1, 2, 4, 1, 1, 1}
 * Output: false
 * Input: new int[] {0, 4, 22, 4, 14, 4, 2}
 * Output: true
 */
public class WaveSorting {

    public static String WaveSorting(int[] arr) {
        // code goes here
        Arrays.sort(arr);
        int half=(int)arr.length/2;
        System.out.println(half);
        for(int i=0;i<half;i++){
            if(arr[i]>=arr[i+half])
                return "false";
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
       int s[]=new int[]  {0, 4, 22, 4, 14, 4, 2};
       //0,2,4,4,4,14,22
        /**
         * 0>4
         * 2>4
         * 4>14
         */
        System.out.print(WaveSorting(s));
    }
}

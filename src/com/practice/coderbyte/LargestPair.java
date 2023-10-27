package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Largest Pair
 * Have the function LargestPair(num) take the num parameter being passed and determine the largest double digit number within the whole number. For example: if num is 4759472 then your program should return 94 because that is the largest double digit number. The input will always contain at least two positive digits.
 * Examples
 * Input: 453857
 * Output: 85
 * Input: 363223311
 * Output: 63
 */
public class LargestPair {
    public static int LargestPair(String s) {
        // code goes here
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++)
        {
            ls.add(Integer.parseInt(s.substring(i,i+2)));
        }
        Collections.sort(ls);
       int result=Integer.parseInt(String.valueOf(ls.get(ls.size()-1)));
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        String number="5673536634";
        System.out.print(LargestPair(number));
    }
}

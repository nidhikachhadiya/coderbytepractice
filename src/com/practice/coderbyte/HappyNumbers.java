package com.practice.coderbyte;

/**
 * Happy Numbers
 * Have the function HappyNumbers(num) determine if a number is Happy, which is a number whose sum of the square of the digits eventually converges to 1. Return true if it's a Happy number, otherwise return false.
 *
 * For example: the number 10 is Happy because 1^2 + 0^2 converges to 1.
 * Examples
 * Input: 1
 * Output: true
 * Input: 101
 * Output: false
 */
public class HappyNumbers {

    public static String HappyNumbers(int num) {
        // code goes here
        if(num==1) return "true";
        if (num < 10) return "false";
        String num_str = String.valueOf(num);
        String[] digits = num_str.split("");
        int sum = 0;
        for (String d : digits) {
            sum += Integer.valueOf(d) * Integer.valueOf(d);
        }
        return HappyNumbers(sum);
    }
    public static void main (String[] args) {
        // keep this function call here
       int num=5525;
        System.out.print(HappyNumbers(num));
    }
}

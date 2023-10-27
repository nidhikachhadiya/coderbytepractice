package com.practice.coderbyte;

import java.util.Scanner;

/**
 * Have the function TimeConvert(num) take the num
 * parameter being passed and return the number
 * of hours and minutes the parameter converts to
 * (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon.
 * Examples
 * Input: 126
 * Output: 2:6
 * Input: 45
 * Output: 0:45
 */
public class TimeConvert {

    public static String TimeConvert(int num) {

        return Integer.toString(num/60)+":"+Integer.toString(num%60);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(s.nextInt()));
    }
}

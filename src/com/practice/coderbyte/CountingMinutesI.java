package com.practice.coderbyte;

/**
 * Counting Minutes I
 * Have the function CountingMinutesI(str) take the str parameter being passed which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes between the two times. The time will be in a 12 hour clock format. For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
 * Examples
 * Input: "12:30pm-12:00am"
 * Output: 690
 * Input: "1:23am-1:08am"
 * Output: 1425
 */
public class CountingMinutesI {
    public static String CountingMinutesI(String str) {
        // code goes here
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
       String s="1:00pm-11:00am";
        System.out.print(CountingMinutesI(s));
    }

}

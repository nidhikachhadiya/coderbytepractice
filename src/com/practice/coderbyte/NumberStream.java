package com.practice.coderbyte;

/**
 * Number Stream
 * Have the function NumberStream(str) take the str parameter being passed which will contain the numbers 2 through 9, and determine if there is a consecutive stream of digits of at least N length where N is the actual digit value. If so, return the string true, otherwise return the string false. For example: if str is "6539923335" then your program should return the string true because there is a consecutive stream of 3's of length 3. The input string will always contain at least one digit.
 * Examples
 * Input: "5556293383563665"
 * Output: false
 * Input: "5788888888882339999"
 * Output: true
 */
public class NumberStream {

    public static String NumberStream(String str) {
        // code goes here
        for(int i = 0; i < str.length(); i++) {
            int number = Integer.parseInt(String.valueOf(str.charAt(i)));
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(number).repeat(number));
            if(str.contains(sb)) return "true";
        }
        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        String s="5788888888882339999";
        System.out.print(NumberStream(s));
    }
}

package com.practice.coderbyte;

/**
 * Simple Evens
 * Have the function SimpleEvens(num) check whether every single number in the passed in parameter is even. If so, return the string true, otherwise return the string false. For example: if num is 4602225 your program should return the string false because 5 is not an even number.
 * Examples
 * Input: 2222220222
 * Output: true
 * Input: 20864646452
 * Output: false
 */
public class SimpleEvens {
    public static String SimpleEvens(String num) {
        // code goes here
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)%2!=0){
                return "false";
            }
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        String num="20864646452";
        System.out.print(SimpleEvens(num));
    }
}

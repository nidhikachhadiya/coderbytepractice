package com.practice.coderbyte;

/**
 * Number Reverse
 * Have the function NumberReverse(str) take the str parameter being passed which will be a string of numbers, and return a new string with the numbers in reverse order.
 * Examples
 * Input: "1 2 3"
 * Output: 3 2 1
 * Input: "10 20 50"
 * Output: 50 20 10
 */
public class NumberReverse {
    public static String NumberReverse(String str) {
        // code goes here
        String s[]=str.split(" ");
        String strnew="";
        for(int i=s.length-1;i>=0;i--){
            strnew=strnew+" "+s[i];
        }
        return strnew.substring(1,strnew.length());
    }

    public static void main (String[] args) {
        // keep this function call here

        String s="10 20 50";
        System.out.print(NumberReverse(s));
    }
}

package com.practice.coderbyte;

/**
 * Have the function Palindrome(str) take the str parameter being passed and return the string true if the parameter is a palindrome, (the string is the same forward as it is backward) otherwise return the string false. For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string.
 * Examples
 * Input: "never odd or even"
 * Output: true
 * Input: "eye"
 * Output: true
 */
public class Palindrome {
    public static String Palindrome(String str) {
        // code goes here
        String temp=str.replaceAll(" ","");
        String reverse="";
        char c[]=str.toLowerCase().replaceAll(" ","").toCharArray();
        for(int i=c.length-1;i>=0;i--){
            reverse=reverse+c[i];
        }
        if(temp.equals(reverse))
        return "true";
        else
            return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "never odd or even";
        System.out.print(Palindrome(s));
    }

}

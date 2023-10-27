package com.practice;

/**
 * Palindrome Swapper
 * Have the function PalindromeSwapper(str) take the str parameter being passed and determine if a palindrome can be created by swapping two adjacent characters in the string. If it is possible to create a palindrome, then your program should return the palindrome, if not then return the string -1. The input string will only contain alphabetic characters. For example: if str is "rcaecar" then you can create a palindrome by swapping the second and third characters, so your program should return the string racecar which is the final palindromic string.
 * Examples
 * Input: "anna"
 * Output: anna
 * Input: "kyaak"
 * Output: kayak
 */
public class PalindromeSwapper {

    public static String PalindromeSwapper(String str) {
        // code goes here
        if(isPalindrom(str))return str;
        for(int i=0;i<str.length()-1;i++){
            String sw=isSwap(str,i,i+1);
            if(isPalindrom(sw))
                return sw;

        }

        return "-1";
    }
    public  static boolean isPalindrom(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static String isSwap(String s,int i, int j){
        StringBuilder sb=new StringBuilder();
        sb.setCharAt(i,s.charAt(j));
        sb.setCharAt(j,s.charAt(i));
        return sb.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="kyaak";
        System.out.print(PalindromeSwapper(s));
    }

}

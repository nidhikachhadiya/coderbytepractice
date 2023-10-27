package com.practice.coderbyte;

/**
 * String Merge
 * Have the function StringMerge(str) read the str parameter being passed which will contain a large string of alphanumeric characters with a single asterisk character splitting the string evenly into two separate strings. Your goal is to return a new string by pairing up the characters in the corresponding locations in both strings. For example: if str is "abc1*kyoo" then your program should return the string akbyco1o because a pairs with k, b pairs with y, etc. The string will always split evenly with the asterisk in the center.
 * Examples
 * Input: "aaa*bbb"
 * Output: ababab
 * Input: "123hg*aaabb"
 * Output: 1a2a3ahbgb
 */
public class StringMerge {

    public static String StringMerge(String str) {
        // code goes here
        String s[]=str.split("\\*");
        String s1=s[0];
        String s2=s[1];
        String newstr="";
        for(int i=0;i<s1.length();i++){
            newstr=newstr+s1.charAt(i)+s2.charAt(i);
        }


        return newstr;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="123hg*aaabb";
        System.out.print(StringMerge(s));
    }

}

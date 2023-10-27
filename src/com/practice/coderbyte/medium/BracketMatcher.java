package com.practice.coderbyte.medium;

/**
 * Bracket Matcher
 * Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
 * Examples
 * Input: "(coder)(byte))"
 * Output: 0
 * Input: "(c(oder)) b(yte)"
 * Output: 1
 */
public class BracketMatcher {

    public static String BracketMatcher(String str) {
        // code goes here
        str=str.toLowerCase().replaceAll("[a-z]","");
        while(str.contains("()")){
          str=  str.replace("()","");

        }
        if(str.length()>0) {
            if (str.contains("(") || str.contains(")"))
                return "0";
        }

            return "1";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="(coder)(byte))";
        System.out.print(BracketMatcher(s));
    }

}

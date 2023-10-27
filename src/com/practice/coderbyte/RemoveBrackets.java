package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove Brackets
 * Have the function RemoveBrackets(str) take the str parameter being passed, which will contain only the characters "(" and ")", and determine the minimum number of brackets that need to be removed to create a string of correctly matched brackets. For example: if str is "(()))" then your program should return the number 1. The answer could potentially be 0, and there will always be at least one set of matching brackets in the string.
 * Examples
 * Input: "(())()((("
 * Output: 3
 * Input: "(()("
 * Output: 2
 */
public class RemoveBrackets {
    public static int RemoveBrackets(String str) {
        // code goes here
        while(str.contains("()"))
            str=   str.replace("()","");
        return str.length();
    }
    public static int RemoveallBrackets(String str) {
        // code goes here
        while(str.contains("()") || str.contains("{}") || str.contains("[]")) {
            str = str.replace("()", "");
            str = str.replace("[]", "");
            str = str.replace("{}", "");
        }
        return str.length();
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="[()]{}{[()()]()}}";
        System.out.print(RemoveallBrackets(s));
    }
}

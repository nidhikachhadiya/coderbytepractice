package com.practice.coderbyte.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Run Length
 * Have the function RunLength(str) take the str parameter being passed and return a compressed version of the string using the Run-length encoding algorithm. This algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols.
 * Examples
 * Input: "aabbcde"
 * Output: 2a2b1c1d1e
 */
public class RunLength {

    public static String RunLength(String str) {
        // code goes here
        StringBuilder encodedStr = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                encodedStr.append(count).append(currentChar);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        // Add the count and character for the last sequence
        encodedStr.append(count).append(currentChar);

        return encodedStr.toString();

    }

    public static void main (String[] args) {
        // keep this function call here
       String s="wwwbbbw";
        System.out.print(RunLength(s));
    }
}

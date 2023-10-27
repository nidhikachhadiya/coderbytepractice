package com.practice.coderbyte;

import java.util.*;
import java.util.stream.Stream;

/**
 * Have the function AlphabetSoup(str) take the str
 * string parameter being passed and return the string with
 * the letters in alphabetical order (ie. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 * Examples
 * Input: "coderbyte"
 * Output: bcdeeorty
 * Input: "hooplah"
 * Output: ahhloop
 */
public class AlphabetSoup {
    public static String AlphabetSoup(String str) {
        // code goes here
        char c[] =str.toLowerCase().toCharArray();
        Arrays.sort(c);
        String sorted = new String(c);

        return sorted;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="Nidhi";
        System.out.print(AlphabetSoup(s));
    }

}

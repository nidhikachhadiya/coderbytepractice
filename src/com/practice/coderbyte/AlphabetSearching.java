package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.List;

/**
 * Alphabet Searching
 * Have the function AlphabetSearching(str) take the str parameter being passed and return the string true if every single letter of the English alphabet exists in the string, otherwise return the string false. For example: if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv" then your program should return the string true because every character in the alphabet exists in this string even though some characters appear more than once.
 * Examples
 * Input: "abcdefghijklmnopqrstuvwxyyyy"
 * Output: false
 * Input: "abc123456kmo"
 * Output: false
 */
public class AlphabetSearching {

    public static String AlphabetSearching(String str) {
        // code goes here
        List<Character> list =new ArrayList<>(List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'));
        for(int i=0;i<list.size();i++){
            String myletter=list.get(i).toString();
            if(!(str.toLowerCase().contains(myletter))){
                return "false";
            }
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="abcdefghijklmnopqrstuvwxyyyy";
        System.out.print(AlphabetSearching(s));
    }


}

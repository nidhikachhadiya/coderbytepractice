package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.List;

public class VowelCount {
    /**
     * Vowel Count
     * Have the function VowelCount(str) take the str string
     * parameter being passed and return the number of vowels
     * the string contains (ie. "All cows eat grass and moo"
     * would return 8). Do not count y as a vowel for this challenge.
     * Examples
     * Input: "hello"
     * Output: 2
     * Input: "coderbyte"
     * Output: 3
     * @param str
     * @return
     */
    public static int VowelCount(String str) {
        // code goes here
         int num=0;
         List ls =new ArrayList(List.of('a','e','i','o','u'));
        char c[]=str.toLowerCase().toCharArray();
        for(int i=0;i<c.length;i++){
            if(ls.contains(c[i])){
                num++;
            }
        }
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "All cows eat grass and moo";
        System.out.print(VowelCount(s));
    }
}

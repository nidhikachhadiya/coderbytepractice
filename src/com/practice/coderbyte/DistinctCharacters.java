package com.practice.coderbyte;

import java.util.HashMap;
import java.util.Map;

/**
 * Distinct Characters
 * Have the function DistinctCharacters(str) take the str parameter being passed and determine if it contains at least 10 distinct characters, if so, then your program should return the string true, otherwise it should return the string false. For example: if str is "abc123kkmmmm?" then your program should return the string false because this string contains only 9 distinct characters: a, b, c, 1, 2, 3, k, m, ? adds up to 9.
 * Examples
 * Input: "12334bbmma:=6"
 * Output: true
 * Input: "eeeemmmmmmmmm1000"
 * Output: false
 * Tags
 * string manipulationsearching
 */
public class DistinctCharacters {
    public static String DistinctCharacters(String str) {
        // code goes here

        if(str.length()<10)
            return "false";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
            else
                map.put(str.charAt(i),1);
        }
        if(map.size()>=10){
            return "true";
        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="abc123kkmmmm?";
        System.out.print(DistinctCharacters(s));
    }
}

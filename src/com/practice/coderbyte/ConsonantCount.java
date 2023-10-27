package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.List;

/**
 * Consonant Count
 * Have the function ConsonantCount(str) take the str string parameter being passed and return the number of consonants the string contains.
 * Examples
 * Input: "Hello World"
 * Output: 7
 * Input: "Alphabets"
 * Output: 6
 */
public class ConsonantCount {

    public static String ConsonantCount(String str) {
        // code goes here
        int count=0;
        List<Character> ls =new ArrayList<>(List.of('a','e','i','o','u'));
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
            if(!(ls.contains(str.toLowerCase().charAt(i)))){
                count++;
            }
        }}

        return String.valueOf(count);
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="Alphabets";
        System.out.print(ConsonantCount(s));
    }

}

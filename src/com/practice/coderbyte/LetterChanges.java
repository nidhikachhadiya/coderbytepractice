package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Has the function letterchange take the str a parameter
 * being passed and modify it using the following algorithm
 * replace every letter in the string with the letter following it
 * in the alphabet (for ex. c becomes d and a becomes z) then capitalized is every vowel
 * in this new string and finally returned this modify string
 */
public class LetterChanges {

    public static final List<Character> VOWEL_LIST = new ArrayList<>(Arrays.asList('a','e','i','o','u'));

    public static void main(String[] args) {
      String s="fun times";
      letterchange(s);
    }
    public static String letterchange(String str){
        char c[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(Character.isLetter(c[i])){
                if(c[i]=='z'){
                    c[i]='A';
                    continue;
                }
                ++c[i];
                if(VOWEL_LIST.contains(c[i])){
                    c[i] = Character.toUpperCase(c[i]);
                }
            }
            System.out.print(c[i]);
        }


        return str;

    }
}


package com.practice.coderbyte;

/**
 *  Swap Case
 * Have the function SwapCase(str) take the str parameter
 * and swap the case of each character.
 * For example: if str is "Hello World" the output should be
 * hELLO wORLD. Let numbers and symbols stay the way they are.
 * Examples
 * Input: "Hello-LOL"
 * Output: hELLO-lol
 * Input: "Sup DUDE!!?"
 * Output: sUP dude!!?
 */
public class SwapCase {

    public static String SwapCase(String str) {
        // code goes here
        String result="";
        char c;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(Character.isUpperCase(str.charAt(i)))
                    c=Character.toLowerCase(str.charAt(i));
                else
                     c = Character.toUpperCase(str.charAt(i));
                        result=result+c;
            }
            else
                result=result+str.charAt(i);
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="Sup DUDE!!?";
        System.out.print(SwapCase(s));
    }
}

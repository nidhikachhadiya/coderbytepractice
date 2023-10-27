package com.practice.coderbyte;

import java.util.Scanner;

/**
 * Have the function LetterCapitalize(str) take the str parameter
 * being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 * Examples
 * Input: "hello world"
 * Output: Hello World
 * Input: "i ran there"
 * Output: I Ran There
 */
public class LetterCapital {

    public static String LetterCapitalize(String oldString) {
        oldString = oldString.trim();
        char[] chars = oldString.toCharArray();
        boolean isNextCharEligibal = true;
        for(int i =0 ; i<chars.length; i++){

            if(chars[i] == ' '){
                isNextCharEligibal = true;
            }

            if(isNextCharEligibal && chars[i] != ' '){
                chars[i] = Character.toUpperCase(chars[i]);
                isNextCharEligibal = false;
            }
        }
        return String.valueOf(chars);
    }

/*    public static String LetterCapitalize(String str) {
        String myString="";
        String s[]=str.split(" ");
        for(int i=0;i<s.length;i++){
            char c[]= s[i].toCharArray();
            s[i]=s[i].replace(c[0],Character.toUpperCase(c[0]));
            myString=myString + " "+s[i];
        }
        // code goes here
        return myString.trim();
    }*/

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize("h3llo   yo  people"));


    }

}

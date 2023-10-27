package com.practice.coderbyte;

/**
 * Have the function CamelCase(str) take the str parameter being passed and return it in proper camel case format where the first letter of each word is capitalized (excluding the first letter). The string will only contain letters and some combination of delimiter punctuation characters separating each word.
 *
 * For example: if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
 * Examples
 * Input: "cats AND*Dogs-are Awesome"
 * Output: catsAndDogsAreAwesome
 * Input: "a b c d-e-f%g"
 * Output: aBCDEFG
 */
public class CamelCase {

    public static String CamelCase(String str) {
        // code goes here
        String strnew="";
        char c[]=str.toLowerCase().toCharArray();
        for(int i=0;i<c.length;i++){
            if( !(Character.isAlphabetic(c[i]))){
                c[i]=Character.toUpperCase(c[i+1]);
            }
            strnew=strnew+c[i];
        }
        StringBuilder builder=new StringBuilder(strnew);
        for(int i=0;i<builder.length();i++){
            if(Character.isUpperCase(builder.charAt(i))){
                builder.deleteCharAt(i+1);
            }
        }

        return builder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String s ="a b c d-e-f%g";
        System.out.print(CamelCase(s));
    }
}

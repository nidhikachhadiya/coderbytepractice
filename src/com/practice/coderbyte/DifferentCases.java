package com.practice.coderbyte;

/**
 * Have the function DifferentCases(str) take the str parameter being passed and return it in upper camel case format where the first letter of each word is capitalized. The string will only contain letters and some combination of delimiter punctuation characters separating each word.
 *
 * For example: if str is "Daniel LikeS-coding" then your program should return the string DanielLikesCoding.
 Examples
 Input: "cats AND*Dogs-are Awesome"
 Output: CatsAndDogsAreAwesome
 Input: "a b c d-e-f%g"
 Output: ABCDEFG
 */
public class DifferentCases {

    public static String DifferentCases(String str) {
        // code goes here

        char c[]=str.toLowerCase().toCharArray();
        String strnew=String.valueOf(c[0]).toUpperCase();
        for(int i=1;i<c.length;i++){
            if( !(Character.isAlphabetic(c[i]))){
                c[i]=Character.toUpperCase(c[i+1]);
            }
            strnew=strnew+c[i];
        }
        StringBuilder builder=new StringBuilder(strnew);
        for(int i=1;i<builder.length();i++){
            if(Character.isUpperCase(builder.charAt(i))){
                builder.deleteCharAt(i+1);
            }
        }
        return builder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "cats AND*Dogs-are Awesome";
        System.out.print(DifferentCases(s));
    }
}

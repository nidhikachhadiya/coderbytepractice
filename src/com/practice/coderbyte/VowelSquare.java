package com.practice.coderbyte;

/**
 * Vowel Square
 * Have the function VowelSquare(strArr) take the strArr parameter being passed which will be a 2D matrix of some arbitrary size filled with letters from the alphabet, and determine if a 2x2 square composed entirely of vowels exists in the matrix. For example: strArr is ["abcd", "eikr", "oufj"] then this matrix looks like the following:
 *
 * a b c d
 * e i k r
 * o u f j
 *
 * Within this matrix there is a 2x2 square of vowels starting in the second row and first column, namely, ei, ou. If a 2x2 square of vowels is found your program should return the top-left position (row-column) of the square, so for this example your program should return 1-0. If no 2x2 square of vowels exists, then return the string not found. If there are multiple squares of vowels, return the one that is at the most top-left position in the whole matrix. The input matrix will at least be of size 2x2.
 * Examples
 * Input: new String[] {"aqrst", "ukaei", "ffooo"}
 * Output: 1-2
 * Input: new String[] {"gg", "ff"}
 * Output: not found
 */
public class VowelSquare {

    public static String VowelSquare(String[] strArr) {
        // code goes here
       for(int i=0;i<strArr.length-1;i++){
           String s1=strArr[i];
           String s2=strArr[i+1];
           for(int j=0;j<s1.length();j++){
               if((isVolvel(s1.charAt(j))) && (isVolvel(s1.charAt(j+1))) && (isVolvel(s2.charAt(j))) && (isVolvel(s2.charAt(j+1)))){
                   return i + "-" + j;
               }
           }
       }
        return "not found";
    }

    public static boolean isVolvel(char c){
        return (c =='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u');
    }

    public static void main (String[] args) {
        // keep this function call here
       String s[]=new String[] {"aqrst", "ukaei", "ffooo"};
        System.out.print(VowelSquare(s));
    }

}

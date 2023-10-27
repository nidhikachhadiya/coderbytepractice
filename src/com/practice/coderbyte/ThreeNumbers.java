package com.practice.coderbyte;

import java.util.HashSet;

/**
 * Three Numbers
 * Have the function ThreeNumbers(str) take the str parameter being passed and determine if exactly three unique, single-digit integers occur within each word in the string. The integers can appear anywhere in the word, but they cannot be all adjacent to each other. If every word contains exactly 3 unique integers somewhere within it, then return the string true, otherwise return the string false. For example: if str is "2hell6o3 wor6l7d2" then your program should return "true" but if the string is "hell268o w6or2l4d" then your program should return "false" because all the integers are adjacent to each other in the first word.
 * Examples
 * Input: "2a3b5 w1o2rl3d g1gg92"
 * Output: true
 * Input: "21aa3a ggg4g4g6ggg"
 * Output: false
 */
public class ThreeNumbers {
    public static String ThreeNumbers(String str) {
        // code goes here
        String result="true";
        String strArray[]=str.split(" ");
        for(int i=0;i<strArray.length;i++) {
            if (isNumberDisting(strArray[i])){
                for (int j = 0; j < strArray[i].length() - 2; j++) {
                    if (Character.isDigit(strArray[i].charAt(j)) && (Character.isDigit(strArray[i].charAt(j + 1))) && (Character.isDigit(strArray[i].charAt(j + 2)))) {
                        result = "false";
                        break;
                    }
                }
        }
            else
                result="false";
        }
        return result;
    }

     public static boolean isNumberDisting(String s){
        char c[]=s.replaceAll("[a-z]","").toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    return false;
                }
            }
        }
        return true;
     }

    public static void main (String[] args) {
        // keep this function call here
        String s = "21aa3a ggg4g4g6ggg";
        System.out.println(isNumberDisting("ggg4g4g6ggg"));
        System.out.print(ThreeNumbers(s));
    }
}

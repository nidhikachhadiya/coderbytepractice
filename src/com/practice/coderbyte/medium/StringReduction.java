package com.practice.coderbyte.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * String Reduction
 * Have the function StringReduction(str) take the str parameter being passed and return the smallest number you can get through the following reduction method. The method is: Only the letters a, b, and c will be given in str and you must take two different adjacent characters and replace it with the third. For example "ac" can be replaced with "b" but "aa" cannot be replaced with anything. This method is done repeatedly until the string cannot be further reduced, and the length of the resulting string is to be outputted.
 *
 * For example: if str is "cab", then "ca" can be reduced to "b" and you get "bb" (you can also reduce it to "cc"). The reduction is done so the output should be 2. If str is "bcab", "bc" reduces to "a", so you have "aab", then "ab" reduces to "c", and the final string "ac" is reduced to "b" so the output should be 1.
 * Examples
 * Input: "abcabc"
 * Output: 2
 * Input: "cccc"
 * Output: 4
 */
public class StringReduction {
    public static String StringReduction(String str) {
        // code goes here
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("ab","c");
        hashMap.put("ba","c");
        hashMap.put("bc","a");
        hashMap.put("cb","a");
        hashMap.put("ac","b");
        hashMap.put("ca","b");
        boolean reduce=true;
        while(reduce){
            reduce=false;
            for(Map.Entry<String,String> entry:hashMap.entrySet()){
                if(str.contains(entry.getKey())){
                   reduce=true;
                   str=str.replaceFirst(entry.getKey(),entry.getValue());
                }
            }
        }
        return String.valueOf(str.length());
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="cccc";
        System.out.print(StringReduction(s));
    }

}

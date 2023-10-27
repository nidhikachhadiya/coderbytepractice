package com.practice.coderbyte;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Nonrepeating Character
 * Have the function NonrepeatingCharacter(str) take the str parameter being passed, which will contain only alphabetic characters and spaces, and return the first non-repeating character. For example: if str is "agettkgaeee" then your program should return k. The string will always contain at least one character and there will always be at least one non-repeating character.
 * Examples
 * Input: "abcdef"
 * Output: a
 * Input: "hello world hi hey"
 * Output: w
 */
public class NonrepeatingCharacter {

    public static String NonrepeatingCharacter(String str) {
        // code goes here
        LinkedHashMap<Character,Integer> treemap=new LinkedHashMap<>();
        char c[]=str.replaceAll(" ","").toLowerCase().toCharArray();
        for(int i=0;i<c.length;i++){
            if(treemap.containsKey(c[i])){
                int count=(int)treemap.get(c[i]);
                treemap.put(c[i],++count);
            }
            else
                treemap.put(c[i],1);
        }

        for(Map.Entry<Character,Integer> entry: treemap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey().toString();
            }
        }
        System.out.println(treemap);
        return "";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="hello world hi hey";
        System.out.print(NonrepeatingCharacter(s));
    }
}

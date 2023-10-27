package com.practice.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindNotRepeatChar {

    public static void main(String[] args) {
        String s1 = "NNNHHH b a";
        System.out.println(getFirstNonReapeatingChar(s1));
    }

    public static Character getFirstNonReapeatingChar(String input){
        boolean find = false;

        if(input == null || input == ""){
            return null;
        }

        char[] inputArray = input.toCharArray();

        if(inputArray.length == 1){
            return inputArray[0];
        }

        LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();

        for(int i=0;i<inputArray.length;i++){
            if(map.containsKey(inputArray[i])){
                int currentCount = (int)map.get(inputArray[i]);
                map.put(inputArray[i], ++currentCount);
            }else{
                map.put(inputArray[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
       return null;
    }
}


// Find first non repeating char
// This is my world : T
// RRR AAA B CCC    : B
// AA CC DDDD E     : E
// AA NNN RRR       : null/ empty char /
// null             :
// Empty String ""  :
// T                : Return element
// Tt hH i          : Case sensitive check : T
//                  : Case insensitive check : i

/*
*
*
*
*
*
* */
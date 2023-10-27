package com.practice.cgi;
// One String ="aaabbbcccdde";

import java.util.HashMap;

public class CountNumbers {

    public static void main(String[] args) {
        String input="aaabbbcccdde";
        countNumbersFromString(input);

    }

    public static void countNumbersFromString(String str){

        if(str==null || str.length()==0)
            System.out.println("Please enter valid String");

        HashMap<Character,Integer> hashmapNumber=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hashmapNumber.containsKey(str.charAt(i))){
                int count=hashmapNumber.get(str.charAt(i));
                hashmapNumber.put(str.charAt(i),++count);
            }
            else
                hashmapNumber.put(str.charAt(i),1);
        }

        System.out.println(hashmapNumber);
    }


}

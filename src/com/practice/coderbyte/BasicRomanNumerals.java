package com.practice.coderbyte;

import java.util.HashMap;

public class BasicRomanNumerals {

    public static String BasicRomanNumerals(String str) {
        // code goes here
        HashMap<String, Integer> dict = new HashMap<>();
        dict.put("I", 1);
        dict.put("V", 5);
        dict.put("X", 10);
        dict.put("L", 50);
        dict.put("C", 100);
        dict.put("D", 500);
        dict.put("M", 1000);

        String[] literals = str.split("");
        int num = dict.get(literals[literals.length-1]);
        for(int i = literals.length-2;i>=0;i--){
            if(dict.get(literals[i])>=dict.get(literals[i+1])){
                num+=dict.get(literals[i]);
            }else{
                num-=dict.get(literals[i]);
            }
        }
        return ""+num;
    }

    public static void main (String[] args) {
        // keep this function call here
        String str="IVI";
        System.out.print(BasicRomanNumerals(str));
    }

}

package com.practice.everydayprogram;

import java.util.HashMap;

public class CountNumberOfOccurenceofCharDay4 {
    public static void main(String[] args) {
        String str = "Nidhi";
        countOccurenceofChar(str);
    }
    public static void countOccurenceofChar(String s){
            char c[] =s.toCharArray();
            HashMap<Character,Integer> hashmap=new HashMap<>();
            for(int i=0;i<c.length;i++){
                if(hashmap.containsKey(c[i])){
                    int currentCount = (int)hashmap.get(c[i]);
                    hashmap.put(c[i],++currentCount);
                }
                else
                    hashmap.put(c[i],1);
            }
            System.out.println(hashmap);
        }
    }




package com.practice.everydayprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateCharactersInStringDay8 {
    public static void main(String[] args) {
        String str="NidhiRaviKachhadiyaJiyani";
        findDuplicateChar(str);
    }
    public static void findDuplicateChar(String s){
        char c[] =s.toCharArray();
        HashMap<Character,Integer> hashmap =new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(hashmap.containsKey(c[i])){
                int count =(int)hashmap.get(c[i]);
                hashmap.put(c[i],++count);
            }
            else
                hashmap.put(c[i],1);

        }
        for(Map.Entry<Character,Integer> entry:hashmap.entrySet()){
if(entry.getValue()>1){
    System.out.println(entry.getKey() + " is duplicate");
}
        }
    }
}

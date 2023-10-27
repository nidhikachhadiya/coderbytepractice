package com.practice.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindNotRepeatWord {
    public static void main(String[] args) {
        String s ="Hello Word Hello Nidhi";
        System.out.println(getNonRepeatWordFromSentence(s));
    }

    public static String getNonRepeatWordFromSentence(String s){
        String c[]=s.split(" ");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<c.length;i++){
         if(map.containsKey(c[i])){
             map.put(c[i],(int)map.get(c[i])+1);
         }
         else
             map.put(c[i],1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }

        }
        System.out.println(map);
           return null;
    }
}

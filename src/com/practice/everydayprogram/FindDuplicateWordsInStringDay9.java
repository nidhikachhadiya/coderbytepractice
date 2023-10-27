package com.practice.everydayprogram;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsInStringDay9 {
    public static void main(String[] args) {
        String str ="Nidhi Ravi Nidhi Kachhdiya";
        findDuplicateWordsInString(str);
    }
    public static void findDuplicateWordsInString(String s){
        String [] splitvalue=s.split(" ");
        HashMap<String,Integer> hashmap =new HashMap<>();
        for(int i=0;i<splitvalue.length;i++){
            if(hashmap.containsKey(splitvalue[i])){
                int count =(int)hashmap.get(splitvalue[i]);
                hashmap.put(splitvalue[i],++count);
            }
            else
                hashmap.put(splitvalue[i],1);
        }

        for(Map.Entry<String,Integer> entry: hashmap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " is duplicate Word");
            }
        }
    }
}

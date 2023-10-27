package com.practice.infos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CheckDuplicateString {
    public static void main(String[] args) {
        String Statement="Hello World Hello Nidhi";
        System.out.println(CheckDuplicateStringAndRemove(Statement));
    }
    public static String CheckDuplicateStringAndRemove(String str){
        String strArray[]=str.split(" ");
        LinkedHashMap<String,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<strArray.length;i++){
            if(hashMap.containsKey(strArray[i])){
                int count = (int)hashMap.get(strArray[i]);
                hashMap.put(strArray[i],++count);
            }
            else
                hashMap.put(strArray[i],1);
        }
        String removed="";
     for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
             removed=removed + " "+ entry.getKey();

     }
       return  removed;

    }
}

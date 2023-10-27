package com.practice.infos;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrintOccurreceofEachCharacters {
    public static void main(String[] args) {
        printOccurrenceofChar("Nidhi Kachhadiya");
    }
    public static void printOccurrenceofChar(String str){
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        str=str.toLowerCase().replaceAll(" ","");
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int count= (int) map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
            else
                map.put(str.charAt(i),1);
        }
        System.out.println(map);
    }
}

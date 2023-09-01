package com.practice.everydayprogram;

import java.util.HashMap;

public class CountOccurenceofWordsinString {

    public static void main(String[] args) {
        String str ="Nidhi Kachhadiya Ravi Jiyani Nidhi";
        countOccureneceofWords(str);
    }
    public static void countOccureneceofWords(String s){
      String[] arraystr=  s.split(" ");
        HashMap<String,Integer> hashMap =new HashMap<>();
      for(int i=0;i<arraystr.length;i++){
          if(hashMap.containsKey(arraystr[i])){
              int count=(int)hashMap.get(arraystr[i]);
              hashMap.put(arraystr[i],++count);
          }
          else
          {
              hashMap.put(arraystr[i],1);
          }
      }
        System.out.println(hashMap);
    }
}

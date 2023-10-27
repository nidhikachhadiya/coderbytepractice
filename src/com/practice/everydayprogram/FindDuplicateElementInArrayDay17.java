package com.practice.everydayprogram;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElementInArrayDay17 {
    public static void main(String[] args) {
        int array[]={1,3,4,5,3,5};
        findDuplicateElementinArray(array);
    }
    public  static void findDuplicateElementinArray(int a[]){
        HashMap<Integer,Integer> hashMap =new HashMap();
        for(int i=0;i<a.length;i++){
            if(hashMap.containsKey(a[i])){
                int count=hashMap.get(a[i]);
                hashMap.put(a[i],++count);
            }
            else
                hashMap.put(a[i],1);
        }

        System.out.println(hashMap);
       for( Map.Entry<Integer,Integer> entry :hashMap.entrySet()){
          if(entry.getValue()>1){
              System.out.println(entry.getKey());
          }
       }


    }
}

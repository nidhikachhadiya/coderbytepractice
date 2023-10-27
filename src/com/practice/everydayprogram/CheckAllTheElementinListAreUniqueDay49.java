package com.practice.everydayprogram;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckAllTheElementinListAreUniqueDay49 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 10, 15, 20, 25,10);
        HashMap<Integer,Integer>  hashmap=new HashMap<>();
        for(int i=0;i<list.size();i++)
        {

            if(hashmap.containsKey(list.get(i)))
            {
                int count=(int)hashmap.get(list.get(i));
                hashmap.put(list.get(i),++count);

            }
            else
                hashmap.put(list.get(i),1);
        }
        boolean isNotUnique=false;
       for(Map.Entry entry: hashmap.entrySet()){
           if(entry.getValue().equals(2)){
               isNotUnique=true;
           }
       }
       if(isNotUnique)
       {
           System.out.println("Given list is not unique");
       }
       else
           System.out.println("Given List is unique");

    }
}

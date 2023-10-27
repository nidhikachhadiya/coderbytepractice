package com.practice.everydayprogram;

import java.util.HashMap;

public class FindFrequncyofElementinArrayDay45 {

    public static void main(String[] args) {
        Integer array[]={5,10,15,20,10,15};
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                System.out.println("inside");
                int count=(int)hashMap.get(array[i]);
                hashMap.put(array[i],++count);
            }
            else
                hashMap.put(array[i],1);
        }
        System.out.println(hashMap);
        }
}

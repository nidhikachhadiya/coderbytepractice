package com.practice.collection.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap<>();
        hm.put(1,"Nidhi");
        hm.put(null,"Paraj");
        hm.put(2,"Ravi");
        System.out.println(hm);
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        hm.replace(2,"Jiyani");
        System.out.println(hm.entrySet());

    }
}

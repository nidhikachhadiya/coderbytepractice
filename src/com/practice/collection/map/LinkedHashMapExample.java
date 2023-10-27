package com.practice.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lmap=new LinkedHashMap<>();
        lmap.put(1,"Nidhi");
        lmap.put(null,"Paraj");
        lmap.put(2,"Ravi");
        System.out.println(lmap);
    }

}

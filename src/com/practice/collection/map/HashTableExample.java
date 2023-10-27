package com.practice.collection.map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"nidhi");
        hashtable.put(2,"nidhi");

        hashtable.put(3,"nidhi");
        hashtable.put(4,"nidhi");

        System.out.println(hashtable);
    }
}

package com.practice.collection.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet =new HashSet<>();
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(5);
        System.out.println(hashSet);
    }
}

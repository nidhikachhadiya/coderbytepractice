package com.practice.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("K");
        linkedHashSet.add("Nidhi");
        linkedHashSet.add("Paraj");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Paraj");
        System.out.println(linkedHashSet);
    }
}

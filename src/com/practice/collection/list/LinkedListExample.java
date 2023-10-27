package com.practice.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Nidhi");
        linkedList.add("Kachhadiya");
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
     }
    }
}

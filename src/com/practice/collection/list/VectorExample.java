package com.practice.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v =new Vector<>();
        v.add(1);
        v.add(0);
        System.out.println(v);
        Iterator<Integer> iterator =v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

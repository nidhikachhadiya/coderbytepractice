package com.practice.collection.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        // Add Element
        arrayList.add("Jiyani");
        arrayList.add("Nidhi");
        arrayList.add("Ravi");
        arrayList.add("Ravi");
        System.out.println(arrayList);
        // Change Element
        arrayList.set(2,"Kachhadiya");
        System.out.println(arrayList);

        //access Element
        System.out.println(arrayList.get(3));

    }
}

package com.practice.everydayprogram;

import java.util.TreeSet;

public class FindMaxValueinTreesetDay50 {
    public static void main(String[] args) {
        TreeSet<Integer> treeset=new TreeSet<>();
        treeset.add(4);
        treeset.add(7);
        treeset.add(1);
        treeset.add(2);
        System.out.println("Max number is " + treeset.last());
    }
}

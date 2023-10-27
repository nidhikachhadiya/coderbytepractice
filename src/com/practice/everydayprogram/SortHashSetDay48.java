package com.practice.everydayprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortHashSetDay48 {
    public static void main(String[] args) {
        HashSet<Integer> hashset=new HashSet<>();
        hashset.add(3);
        hashset.add(5);
        hashset.add(10);
        hashset.add(2);
        hashset.add(8);
        List<Integer> ls=new ArrayList<>(hashset);
        Collections.sort(ls);
        System.out.println(ls);

    }
}

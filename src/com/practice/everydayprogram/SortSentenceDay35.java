package com.practice.everydayprogram;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortSentenceDay35 {

    public static void main(String[] args) {
        String s="than speak words louder Actions";
        String[] array=s.split(" ");
       // List<String> list=new LinkedList(Arrays.asList(array));
      //  TreeSet<String> treeset=new TreeSet<>(list);
      //  System.out.println(treeset);
        Arrays.sort(array);
        for(String str:array)
        System.out.println(str);

    }
}

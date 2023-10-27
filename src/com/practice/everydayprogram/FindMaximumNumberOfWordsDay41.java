package com.practice.everydayprogram;

import java.util.Collections;
import java.util.LinkedList;

public class FindMaximumNumberOfWordsDay41 {
    public static void main(String[] args) {

        String s[] ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        LinkedList ls=new LinkedList();

        for(int i=0;i<s.length;i++){
            String split[]=s[i].split(" ");
               ls.add(split.length);
        }
        Collections.sort(ls);
        System.out.println(ls.getLast());
    }
}

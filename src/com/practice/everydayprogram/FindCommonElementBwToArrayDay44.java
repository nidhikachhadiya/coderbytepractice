package com.practice.everydayprogram;

import java.util.Arrays;
import java.util.LinkedList;

public class FindCommonElementBwToArrayDay44 {
    public static void main(String[] args) {
        Integer a[]={4,8,12,16,20,24};
        Integer b[]= {3,6,9,12,15,18,21,24};
        LinkedList<Integer> ls =new LinkedList(Arrays.asList(a));
         for(int i=0;i<b.length;i++){
             if(ls.contains(b[i])){
                 System.out.println(b[i] + " is common in both Array");
             }

         }


    }
}

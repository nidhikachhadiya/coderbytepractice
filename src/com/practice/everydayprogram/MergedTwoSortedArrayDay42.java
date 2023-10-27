package com.practice.everydayprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MergedTwoSortedArrayDay42 {
    public static void main(String[] args) {
        Integer ar1[]={1,3,5,7,9};
        Integer ar2[]={2,4,6,8,10};
        LinkedList<Integer> ls=new LinkedList(Arrays.asList(ar1));
        for(Integer num:ar2){
            ls.add(num);
        }
        Collections.sort(ls);
        System.out.println(ls);

    }
}

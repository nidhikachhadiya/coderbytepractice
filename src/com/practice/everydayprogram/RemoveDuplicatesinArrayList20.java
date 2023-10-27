package com.practice.everydayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesinArrayList20 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<>(Arrays.asList(1,3,5,6,1,5));
        Set<Integer> set=new HashSet(arrayList);
        System.out.println(set);
    }
}

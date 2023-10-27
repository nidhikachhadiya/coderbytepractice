package com.practice.tcsnqtcodingsheet.arrayexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromArray_11 {
    public static void main(String[] args) {
        Integer array[]={1,3,5,2,2,5};
        List ls=new ArrayList(Arrays.asList(array));
        HashSet hashset=new HashSet(ls);
        System.out.println(hashset);
    }
}

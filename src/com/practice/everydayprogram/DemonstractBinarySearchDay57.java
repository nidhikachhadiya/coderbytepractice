package com.practice.everydayprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemonstractBinarySearchDay57 {
    public static void main(String[] args) {
        List<Integer> ls=new LinkedList<>(Arrays.asList(1,3,5,6,6));
        System.out.println(Collections.binarySearch(ls,6));

    }
}

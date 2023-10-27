package com.practice.everydayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleListElementDay56 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>(Arrays.asList(5,10,15,5,20));
        System.out.println(ls);
        Collections.shuffle(ls);
        System.out.println(ls);
    }
}

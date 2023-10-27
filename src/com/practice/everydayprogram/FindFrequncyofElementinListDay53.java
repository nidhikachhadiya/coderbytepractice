package com.practice.everydayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFrequncyofElementinListDay53 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>(Arrays.asList(2,4,6,5,4));
        System.out.println(Collections.frequency(ls,4));

    }
}

package com.practice.everydayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SyncronizedArraylistDay51 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>(Arrays.asList(1,4,5,6));
        Collections.synchronizedList(ls);
        System.out.println(ls);

    }
}

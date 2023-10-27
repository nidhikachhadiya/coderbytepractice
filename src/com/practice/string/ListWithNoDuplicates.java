package com.practice.string;

import java.util.*;

public class ListWithNoDuplicates {

    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 1, 2, 1};
        removeduplicate(array);
    }
    public static List<Integer> removeduplicate(Integer[] myarray){
        List<Integer> list = Arrays.asList(myarray);
        List<Integer> newlist=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
                if (!(newlist.contains(list.get(i)))) {
                    newlist.add(list.get(i));
                }
            }
        System.out.println(newlist);
        return newlist;

    }
}
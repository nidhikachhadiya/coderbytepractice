package com.practice.everydayprogram;

import java.util.*;

public class FoundThirdLargestElement14 {
    public static void main(String[] args) {
        Integer array[]={2,4,1,6,5,7,8};
        foundThirdLargestElement(array);
    }
    public static void foundThirdLargestElement(Integer a[]){
        int count=0;
        List<Integer> list = Arrays.asList(a);
        TreeSet<Integer> treeset =new TreeSet<>(list);
        List<Integer> list1= new ArrayList<>(treeset);
        System.out.println(list1.get(list1.size()-3));


    }
}

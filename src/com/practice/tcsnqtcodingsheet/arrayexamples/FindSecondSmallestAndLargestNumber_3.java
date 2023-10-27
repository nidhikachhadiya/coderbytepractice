package com.practice.tcsnqtcodingsheet.arrayexamples;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondSmallestAndLargestNumber_3 {
    public static void main(String[] args) {
        Integer a[]={2,4,5,2,1,1,4,3};
        Collections.sort(Arrays.asList(a));
        System.out.println(a[a.length-2]);

    }
}

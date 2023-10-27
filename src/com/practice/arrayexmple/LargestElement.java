package com.practice.arrayexmple;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int a[]={3,5,1,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-1]);
    }
}

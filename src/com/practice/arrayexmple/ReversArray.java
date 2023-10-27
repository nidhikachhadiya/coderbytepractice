package com.practice.arrayexmple;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int a[] ={2,4,5,6,7};
        int b[] = new int[a.length];
        for(int i=a.length-1; i>=0;i--){
            System.out.println(" "+a[i]);
            b[i]=a[i];
        }

    }
}

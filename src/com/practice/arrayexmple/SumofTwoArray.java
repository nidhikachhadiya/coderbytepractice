package com.practice.arrayexmple;

import java.util.Arrays;

public class SumofTwoArray {
    public static void main(String[] args) {
        int a[]={3,5,6};
        int b[]={2,4,5};
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i]+b[i];

        }
        System.out.println(Arrays.toString(c));

        }


}

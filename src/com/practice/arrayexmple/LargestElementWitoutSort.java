package com.practice.arrayexmple;

public class LargestElementWitoutSort {
    public static void main(String[] args) {
        int a[]={4,5,3,6};

        for(int i=0;i<a.length;i++){
                if(a[0]<a[i])
                    a[0]=a[i];
            }
        System.out.println(a[0]);
        }
}

package com.practice.tcsnqtcodingsheet.arrayexamples;

import java.util.Arrays;
import java.util.Collections;

public class RearrangingArrayinIncreasingDecreasingOrder_6 {
    public static void main(String[] args) {
        Integer array[] ={4,2,8,6,15,5,9,20};
        int total=array.length;
        int half=total/2;
        int num1[]=new int[half];
        int num2[] =new int[half];
        Collections.sort(Arrays.asList(array));
        for(int i=0;i<array.length/2;i++){
            num1[i]=array[i];
        }
        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
        for(int i=array.length-1,j=0;i>=array.length/2;i--,j++){
            num2[j]=array[i];
        }
        for(int i=0;i<num2.length;i++){
            System.out.println(num2[i]);
        }
    }
}

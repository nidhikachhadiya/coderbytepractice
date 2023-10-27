package com.practice.everydayprogram;

public class PrintAlternateElementInArrayDay54 {
    public static void main(String[] args) {
        Integer array[]={1,3,5,6,7,1,3};
        for(int i=0;i<array.length;i=i+2){
            System.out.println(array[i]);
        }
    }
}

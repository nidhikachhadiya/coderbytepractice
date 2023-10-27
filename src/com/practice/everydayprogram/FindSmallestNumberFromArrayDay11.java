package com.practice.everydayprogram;

import java.util.Arrays;

public class FindSmallestNumberFromArrayDay11 {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,3,1,6};
        findsmallestNumber(arr);

    }
    public static void findsmallestNumber(int arrs[]){
        int min=arrs[0];
        for(int i=0;i<arrs.length;i++){
            if(arrs[i]<min){
                min=arrs[i];
            }
        }
        System.out.println(min);
    }
}

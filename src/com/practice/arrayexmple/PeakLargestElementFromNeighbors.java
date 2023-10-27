package com.practice.arrayexmple;

public class PeakLargestElementFromNeighbors {
    public static void main(String[] args) {
        int a[]={2,4,30,3,5,6};
            for(int i=1 ;i<a.length-1;i++){
               if(a[i]>a[i-1] && a[i]>a[i+1]){
                   System.out.println(i);
               }

        }
    }
}

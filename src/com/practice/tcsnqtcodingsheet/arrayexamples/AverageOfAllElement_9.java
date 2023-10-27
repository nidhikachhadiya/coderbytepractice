package com.practice.tcsnqtcodingsheet.arrayexamples;

public class AverageOfAllElement_9 {
    public static void main(String[] args) {
        int a[]={1,4,5,3,9};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum/a.length);
    }
}

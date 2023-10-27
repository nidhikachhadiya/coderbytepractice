package com.practice.tcsnqtcodingsheet.arrayexamples;

public class SumofElement_7 {
    public static void main(String[] args) {
        int array[]={1,4,5,2,5,9};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}

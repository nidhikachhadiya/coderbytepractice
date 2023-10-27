package com.practice.tcsnqtcodingsheet.arrayexamples;

public class FindLargestNumber_2 {
    public static void main(String[] args) {
        int array[] ={4,3,5,2};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}

package com.practice.infos;

import java.util.Arrays;

public class FindLargestTwoNumbers {
    public static void main(String[] args) {
        int num[]={3,5,1,9,4};
        printLargestTwoNumbers(num);
    }
    public static void printLargestTwoNumbers(int number[]){
        Arrays.sort(number);
        System.out.println(number[number.length-1]);
        System.out.println(number[number.length-2]);
        int max=number[0];
        int secondlargest=0;
       for(int i=0;i<number.length;i++){
               if(number[i]>max){
                  max=number[i];
               }
               if(number[i]>secondlargest && number[i]!=max){
                   secondlargest=number[i];
               }
           }
        System.out.println(secondlargest);
        System.out.println(max);
       }
}

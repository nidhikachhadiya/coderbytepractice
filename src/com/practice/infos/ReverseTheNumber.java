package com.practice.infos;

public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));

    }

    public static int reverseNumber(int number){
        int reverseNumber=0;
        int remainder=0;
        while(number>0){
            remainder=number%10;
           reverseNumber=reverseNumber*10 + remainder;
            number=number/10;
        }
        return reverseNumber;
    }

}

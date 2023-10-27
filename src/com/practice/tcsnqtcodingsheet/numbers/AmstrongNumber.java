package com.practice.tcsnqtcodingsheet.numbers;

public class AmstrongNumber {
    public static void main(String[] args) {
        int a=153;
        int reverse=0;
        int reminder;
        int temp=a;
        while(a>0){
            reminder=a%10;
            reverse=reverse+(reminder*reminder*reminder);
            a=a/10;

        }
        System.out.println(reverse);
        if(temp==reverse){
            System.out.println("Given number is amstrong number");
        }
        else
        {
            System.out.println("Given number is not amstrong number");
        }
    }
}

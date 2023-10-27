package com.practice.tcsnqtcodingsheet.numbers;

public class CheckNumberisPelindrom {
    public static void main(String[] args) {
        int a=121;
        int reminder;
        int temp=a;
        int rever=0;

        while(a>0){
           reminder= a%10;
           rever=rever*10+reminder;
           a=a/10;
        }
       if(rever==temp){
           System.out.println("Given number is pelindrom");
       }
       else
           System.out.println("Given number is not pelindrom");
    }
}

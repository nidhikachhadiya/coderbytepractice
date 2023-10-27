package com.practice.everydayprogram;

public class FindFectorialofNumberDay15 {
    public static void main(String[] args) {
        int number =7;

        findfactorial(number);
    }

    // 1*2*3

    public static void findfactorial(int n){
        int fact=1;
       for(int i=1;i<=n;i++){
           fact=fact*i;
       }
        System.out.println(fact);

    }
}


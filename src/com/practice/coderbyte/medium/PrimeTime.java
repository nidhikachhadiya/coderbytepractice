package com.practice.coderbyte.medium;

public class PrimeTime {
    public static boolean PrimeTime(int num) {
        // code goes here
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }

    public static void main (String[] args) {
        // keep this function call here
        int number=110;
        System.out.print(PrimeTime(number));
    }
}

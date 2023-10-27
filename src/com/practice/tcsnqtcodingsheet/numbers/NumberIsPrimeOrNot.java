package com.practice.tcsnqtcodingsheet.numbers;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        int n=13;
        boolean isNotPrime=false;
        if(n!=1) {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                   isNotPrime=true;
                   break;
                }
            }
        }
        if (!isNotPrime){
            System.out.println("Given number is  prime");
        }
        else
            System.out.println("Given number not is prime");
    }
}

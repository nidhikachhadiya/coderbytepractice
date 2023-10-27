package com.practice.tcsnqtcodingsheet.numbers;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        int min=10,max=100;
        for(int i=min;i<=max;i++){
            if(!(isPrime(i))){
                System.out.println(i+ " is prime");
            }

        }
    }
    static boolean isPrime(int n){
       boolean isnotprime=false;
       if(n>1) {
           for (int i = 2; i < Math.sqrt(n); i++) {
               if (n % i == 0) {
                   isnotprime = true;
                   break;
               }
           }
       }
        return isnotprime;
    }
}

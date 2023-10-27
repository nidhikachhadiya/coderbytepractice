package com.practice.infos;
//1*2*3=6
public class Factorial {
    public static void main(String[] args) {
        findFactorial(3);

    }

    public static int findFactorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return fact;
    }
}

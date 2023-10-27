package com.practice.infos;

public class Fibbonacci {
    public static void main(String[] args) {
        printFibbonacci(10);
    }

    public static void printFibbonacci(int number){
        int first=0;
        int second =1;
        int sum=0;
        for(int i=1;i<number;i++){

            first=second;
            second=sum;
            sum=first+second;
            System.out.println(sum);

        }

    }
}

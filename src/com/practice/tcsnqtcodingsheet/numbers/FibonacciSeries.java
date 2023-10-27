package com.practice.tcsnqtcodingsheet.numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first=0;
        int second =1;
        int n=10;
        int sum=0;
        System.out.println(first);
        for(int i=2;i<n;i++) {
            sum = first+second;
            second=first;
            first=sum;
            System.out.println(sum);
        }

    }
}

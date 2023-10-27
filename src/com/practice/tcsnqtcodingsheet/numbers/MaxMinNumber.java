package com.practice.tcsnqtcodingsheet.numbers;

public class MaxMinNumber {
    public static void main(String[] args) {
        int n=1356;

        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while (n != 0)
        {
            d = n % 10;
            mini = Math.min(mini,d);
            maxi = Math.max(maxi,d);
            n = n / 10;
        }

        System.out.println("The minimum number is: "+mini);
        System.out.print("The maximum number is: "+maxi);
    }
}

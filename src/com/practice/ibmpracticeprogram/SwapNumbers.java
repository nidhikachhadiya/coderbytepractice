package com.practice.ibmpracticeprogram;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int i=6;
        int j=4;
        int temp;
        System.out.println("Before Swapping value of a is "+a +" and value of b "+ b);
        temp=b;
        b=a;
        a=temp;
        System.out.println("After Swapping value of a is "+a +" and value of b "+ b);

        System.out.println("Before Swapping value of i is "+i +" and value of j "+ j);
        i=i+j; // i=10
        j=i-j;//j= 6;
        i=i-j; //4

        System.out.println("After Swapping value of i is "+i +" and value of j "+ j);

    }
}

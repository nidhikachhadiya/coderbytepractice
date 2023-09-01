package com.practice.fuctionalprogramming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllTheNumberInListStructured(List.of(1,3,5,6,8,9,3));

    }

    private static void printAllTheNumberInListStructured(List<Integer> integers) {
        for(int i=0;i<integers.size();i++){
            System.out.println(integers.get(i));
        }
        for(int number:integers) {
            System.out.println("=======");
            System.out.println(number);
        }
    }
}

package com.practice.fuctionalprogramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllTheNumberInListFunctional(List.of(1,3,5,6,8,9,3));

    }

    private static void printAllTheNumberInListFunctional(List<Integer> integers) {
//        for(int i=0;i<integers.size();i++){
//            System.out.println(integers.get(i));
//        }
//        for(int number:integers) {
//            System.out.println("=======");
//            System.out.println(number);
//        }
        integers.stream().filter(integer -> integer%2==0).forEach(System.out :: println);
    }
}

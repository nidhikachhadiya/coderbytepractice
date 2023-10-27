package com.practice.fuctionalprogramming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
     //   printAllTheNumberInListFunctional(List.of(1, 3, 5, 6, 8, 9, 3));
        List<String> Course = List.of("Spring", "Spring Boot", "API", "MicroServices"
                , "AWS", "PCF", "Azure", "Docker", "Kubernate");
//        Course.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
//        Course.stream().filter(course -> course.length()>=4).forEach(System.out::println);
        System.out.println(getSumofNumberInListFunctional(List.of(1, 3, 5, 6, 8, 9, 3)));
    }

    private static void printAllTheNumberInListFunctional(List<Integer> integers) {
        integers.stream().filter(integer -> integer % 2 == 1).map(number -> number * number)
                .forEach(System.out::println);
        integers.stream().reduce(0, Integer::sum);
    }


    private static int getSumofNumberInListFunctional(List<Integer> integers) {
       // return integers.stream().reduce(0, Integer::sum);
        return integers.stream().filter(x->x%2==1).reduce(0,Integer::sum);
    }

}
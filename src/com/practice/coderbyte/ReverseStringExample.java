package com.practice.coderbyte;

public class ReverseStringExample {
    public static void main(String[] args) {
        String s="Nidhi";
        char c[]=s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}

package com.practice.everydayprogram;

public class SwapFirstAndLastLetterInStringDay46 {
    public static void main(String[] args) {
        String s= "Keerthana";
        char[] a =s.toCharArray();
        char first;
        char last;

           first=a[0];
           last=a[a.length-1];
           a[0]=last;
           a[a.length-1]=first;
        System.out.println(String.valueOf(a));
        }




}

package com.practice.infos;

public class PrintOddpositions {
    public static void main(String[] args) {
        reverseStringPrintOddPositions("Nidhi Kachhadiya");
    }
    public static void reverseStringPrintOddPositions(String str){
        String reverse=new StringBuilder(str).reverse().toString().replaceAll(" ","");
        System.out.println(reverse);
        for(int i=0;i<reverse.length();i=i+2){
            System.out.println(reverse.charAt(i));
        }

    }
}

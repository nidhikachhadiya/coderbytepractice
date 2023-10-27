package com.practice.ibmpracticeprogram;

public class SwapString {
    public static void main(String[] args) {
        String s1="Nidhi";
        String s2="Kachhadiya";
        System.out.println("Befor Swaping s1 is " + s1 + " and s2 is " + s2 );
       s1=s1+s2;
       s2=s1.substring(0,s1.length()-s2.length());
       s1=s1.substring(s2.length());

        System.out.println("after Swaping s1 is " + s1 + " and s2 is " + s2 );

    }
}

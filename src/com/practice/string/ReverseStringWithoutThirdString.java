package com.practice.string;

public class ReverseStringWithoutThirdString {
    public static void main(String[] args) {
        String s1="Nidhi";
        String s2="Kachhadiya";

        s1=s1.concat(s2);
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s2);
        System.out.println(s1);

    }
}

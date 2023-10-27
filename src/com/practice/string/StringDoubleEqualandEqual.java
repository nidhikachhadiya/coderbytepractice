package com.practice.string;

public class StringDoubleEqualandEqual {
    public static void main(String[] args) {
        String s1="Nidhi";
        String s2=s1;
        String s3=new String("Nidhi");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));

    }
}

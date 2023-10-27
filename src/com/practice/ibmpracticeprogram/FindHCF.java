package com.practice.ibmpracticeprogram;

public class FindHCF {
    public static void main(String[] args) {
        int x = 16, y = 80;

        System.out.println(HCF(x,y));
    }
    static int HCF(int a,int b){
        if(b==0)
        return a;
        return HCF(b,b%a);
    }
}

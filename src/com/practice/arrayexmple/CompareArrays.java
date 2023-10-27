package com.practice.arrayexmple;

public class CompareArrays {
    public static void main(String[] args) {
        int a[]={2,4,5,6};
        int b[]=a;
        int c[]={2,4,5,6};
        int d[]={3,5,6};
        if(a==b){
            System.out.println("a and bBoth are same");
        }

        if(b==c){
            System.out.println("b and c Both are same");
        }
        if(c==a){
            System.out.println("a and cBoth are same");
        }

        if(c==d){
            System.out.println("c and d Both are same");
        }
    }
}

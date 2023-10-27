package com.practice.infos;

public class TriangularofNumber {
    public static void main(String[] args) {

        printTriangularofNumber(120);

    }
    public static void printTriangularofNumber(int number){
        int sum=3;
        for(int i=3;i<=number;i++){
            System.out.println(sum);
            sum+=i;
        }
    }
}

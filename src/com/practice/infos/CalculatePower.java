package com.practice.infos;

public class CalculatePower {

    public static void main(String[] args) {
        int base =4, exponantion=4;
        long result=1;
        while(exponantion!=0){
            result=result*base;
            exponantion--;
        }
        System.out.println(result);
        }

    }



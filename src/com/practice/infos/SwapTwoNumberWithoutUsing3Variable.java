package com.practice.infos;
/*
number1=4
number2=2

number1=6
number2=6-2=4
number1=number1-number2
 */
public class SwapTwoNumberWithoutUsing3Variable {
    public static void main(String[] args) {
        swapTwoNumber(4,2);

    }
    public static void swapTwoNumber(int number1, int number2){
        System.out.println("Before Swapping numbers are: "+number1 + " "+number2);

        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("After Swapping numbers are: "+number1 + " "+number2);


    }
}

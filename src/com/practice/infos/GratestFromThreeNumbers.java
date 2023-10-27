package com.practice.infos;

/**
 * 3,5,6
 * 3>5
 */
public class GratestFromThreeNumbers {
    public static void main(String[] args) {
        System.out.println(findGratestNumber(3,0,1));
    }
    public static int findGratestNumber(int number1, int number2, int number3){
        if(number1>number2 && number1>number3){
            return number1;
        }
        else if(number2>number3 && number2>number1)
            return number2;
        else
            return number3;

    }
}

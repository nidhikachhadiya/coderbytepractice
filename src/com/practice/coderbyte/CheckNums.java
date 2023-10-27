package com.practice.coderbyte;

/**
 * Have the function CheckNums(num1,num2) take both parameters
 * being passed and return the string true if num2 is greater
 * than num1, otherwise return the string false. If the parameter
 * values are equal to each other then return the string -1.
 * Examples
 * Input: 3 & num2 = 122
 * Output: true
 * Input: 67 & num2 = 67
 * Output: -1
 */
public class CheckNums {
    public static String CheckNums(int num1, int num2) {
        if(num1==num2){
            return "-1";
        }
        return num2>num1?"true":"false";
    }

    public static void main (String[] args) {
        // keep this function call here

        System.out.print(CheckNums(5,5));
    }
}

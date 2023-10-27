package com.practice.coderbyte;

import java.text.DecimalFormat;

/**
 * Division Stringified
 * Have the function DivisionStringified(num1,num2) take both parameters being passed, divide num1 by num2, and return the result as a string with properly formatted commas. If an answer is only 3 digits long, return the number with no commas (ie. 2 / 3 should output "1"). For example: if num1 is 123456789 and num2 is 10000 the output should be "12,346".
 * Examples
 * Input: 5 & num2 = 2
 * Output: 3
 * Input: 6874 & num2 = 67
 * Output: 103
 */
public class DivisionStringified {
    public static String DivisionStringified(int num1, int num2) {
        // code goes here
        int result =(int)Math.round( (double)num1 / (double)num2);
        DecimalFormat decimalFormat=new DecimalFormat("#,###");
        return decimalFormat.format(result);

    }

    public static void main (String[] args) {
        // keep this function call here
        int num1=45;
        int num2=50;
        System.out.print(DivisionStringified(num1,num2));
    }

}

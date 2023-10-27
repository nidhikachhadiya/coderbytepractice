package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Have the function NumberAddition(str) take the str parameter, search for all the numbers in the string, add them together, then return that final number. For example: if str is "88Hello 3World!" the output should be 91. You will have to differentiate between single digit numbers and multiple digit numbers like in the example above. So "55Hello" and "5Hello 5" should return two different answers. Each string will contain at least one letter or symbol.
 * Examples
 * Input: "75Number9"
 * Output: 84
 * Input: "10 2One Number*1*"
 * Output: 13
 */
public class NumberAddition {

    public static int NumberAddition(String str) {
        // code goes here
       int sum=0;
        String[] strArray = str.split("[^0-9]");
        for(int i=0; i<strArray.length; i++) {
            if(strArray[i].length()>0) {
                sum += Integer.valueOf(strArray[i]);
            }
        }
        return  sum;

    }

    public static void main (String[] args) {
        // keep this function call here
       String s="T1wo Ho33uses";
        System.out.print(NumberAddition(s));
    }
}

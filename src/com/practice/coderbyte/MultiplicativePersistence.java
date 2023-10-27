package com.practice.coderbyte;

/**
 * Additive Persistence
 * Have the function AdditivePersistence(num) take the num parameter being passed which will always be a positive integer and return its additive persistence which is the number of times you must add the digits in num until you reach a single digit. For example: if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
 * Examples
 * Input: 4
 * Output: 0
 * Input: 19
 * Output: 2
 */
public class MultiplicativePersistence {


    public static int Multiplicative(int num) {
        int count=0;
        if(num>9) {
            while (num > 9) {
                count++;
                String str = String.valueOf(num);
                char[] chars = str.toCharArray();
                int mul = 1;
                for (int i = 0; i < chars.length; i++) {
                    mul = mul * Character.getNumericValue(chars[i]);
                }
                num = mul;
            }
            return count;
        }
        else
            return 0;
    }

    public static void main (String[] args) {
        int num=46;
        System.out.println(Multiplicative(num));
    }
}

/*
46
4*6= 24
2*4=8
 */

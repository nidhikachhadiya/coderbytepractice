package com.practice.coderbyte;

/**
 * Binary Reversal
 * Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer, take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and then finally return the new reversed string in decimal form. For example: if str is "47" then the binary version of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary string which then becomes: 11110100 and then finally return the decimal version of this string, which is 244.
 * Examples
 * Input: "213"
 * Output: 171
 * Input: "4567"
 * Output: 60296
 */
public class BinaryReversal {

    public static String BinaryReversal(String str) {
        // code goes here
        String binary=Integer.toBinaryString(Integer.parseInt(str));
        int decimal=0;
       while( !(binary.length()==8 || binary.length()==16 || binary.length()==32 || binary.length()==24 ))
        {
            binary=0+binary;
        }
            String reversebinary= new StringBuilder(binary).reverse().toString();
             decimal=Integer.parseInt(reversebinary,2);

        return String.valueOf(decimal);
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "4567";
        System.out.print(BinaryReversal(s));
    }
}

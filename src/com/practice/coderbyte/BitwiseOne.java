package com.practice.coderbyte;
/*
Bitwise One
Have the function BitwiseOne(strArr) take the array of strings stored in strArr, which will only contain two strings of equal length that represent binary numbers, and return a final binary string that performed the bitwise OR operation on both strings. A bitwise OR operation places a 0 in the new string where there are zeroes in both binary strings, otherwise it places a 1 in that spot. For example: if strArr is ["1001", "0100"] then your program should return the string "1101"
Examples
Input: new String[] {"100", "000"}
Output: 100
Input: new String[] {"00011", "01010"}
Output: 01011
 */
public class BitwiseOne {
    public static String BitwiseOne(String[] strArr) {
        // code goes here
        String s1=strArr[0];
    String s2=strArr[1];
    String s3="";
        for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)=='1'|| s2.charAt(i)=='1') {
            s3 = s3 + '1';
        }
        else {
            s3 = s3 + '0';
        }

    }
        return s3;
}

    public static void main (String[] args) {
        // keep this function call here
        String s[]=new String[] {"00011", "01010"};
        System.out.print(BitwiseOne(s));
    }

}

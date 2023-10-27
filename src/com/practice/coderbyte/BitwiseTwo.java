package com.practice.coderbyte;

/**
 * Bitwise Two
 * Have the function BitwiseTwo(strArr) take the array of strings stored in strArr, which will only contain two strings of equal length that represent binary numbers, and return a final binary string that performed the bitwise AND operation on both strings. A bitwise AND operation places a 1 in the new string where there is a 1 in both locations in the binary strings, otherwise it places a 0 in that spot. For example: if strArr is ["10111", "01101"] then your program should return the string "00101"
 * Examples
 * Input: new String[] {"100", "000"}
 * Output: 000
 * Input: new String[] {"10100", "11100"}
 * Output: 10100
 */
public class BitwiseTwo {
    public static String BitwiseTwo(String[] strArr) {
        // code goes here
        String s1=strArr[0];
        String s2=strArr[1];
        String newstr="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1' && s2.charAt(i)=='1')
                newstr=newstr+"1";
            else
                newstr=newstr+"0";
        }

        return newstr;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s[]=new String[] {"10100", "11100"};
        System.out.print(BitwiseTwo(s));
    }

}

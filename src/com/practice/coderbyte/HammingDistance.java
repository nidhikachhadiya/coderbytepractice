package com.practice.coderbyte;

/**
 * Hamming Distance
 * Have the function HammingDistance(strArr) take the array of strings stored in strArr, which will only contain two strings of equal length and return the Hamming distance between them. The Hamming distance is the number of positions where the corresponding characters are different. For example: if strArr is ["coder", "codec"] then your program should return 1. The string will always be of equal length and will only contain lowercase characters from the alphabet and numbers.
 * Examples
 * Input: new String[] {"10011", "10100"}
 * Output: 3
 * Input: new String[] {"helloworld", "worldhello"}
 * Output: 8
 */
public class HammingDistance {

    public static int HammingDistance(String[] strArr) {
        // code goes here
        int distance=0;
        String s1=strArr[0];
        String s2=strArr[1];
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
                distance++;
            }
        }
        return distance;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s[]=new String[] {"helloworld", "worldhello"};
        System.out.print(HammingDistance(s));
    }

}

package com.practice.coderbyte;

/**
 * H Distance
 * Have the function HDistance(strArr) take the array of strings
 * stored in strArr, which will only contain two strings of
 * equal length and return the number of characters at each
 * position that are different between them. For example:
 * if strArr is ["house", "hours"] then your program should
 * return 2. The string will always be of equal length and will
 * only contain lowercase characters from the alphabet and numbers.
 * Examples
 * Input: new String[] {"10011", "10100"}
 * Output: 3
 * Input: new String[] {"abcdef", "defabc"}
 * Output: 6
 */
public class HDistance {
    public static String HDistance(String[] strArr) {
        // code goes here
        String s1=strArr[0];
        String s2=strArr[1];
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        return String.valueOf(count);
    }

    public static void main (String[] args) {
        // keep this function call here
       String s[]= new String[] {"abcdef", "defabc"};
        System.out.print(HDistance(s));
    }

}


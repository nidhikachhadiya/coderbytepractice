package com.practice.coderbyte;

/**
 * One Decremented
 * Have the function OneDecremented(str) count how many times a digit appears that is exactly one less than the previous digit. For example: if str is "5655984" then your program should return 2 because 5 appears directly after 6 and 8 appears directly after 9. The input will always contain at least 1 digit.
 * Examples
 * Input: "56"
 * Output: 0
 * Input: "9876541110"
 * Output: 6
 */
public class OneDecremented {

    public static String OneDecremented(String str) {
        // code goes here
        int count=0;
        char c[]=str.toCharArray();
        for(int i=0;i<c.length-1;i++){
            if(c[i]-c[i+1]==1){
                count++;
            }
        }
        return String.valueOf(count);
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "56";
        System.out.print(OneDecremented(s));
    }
}

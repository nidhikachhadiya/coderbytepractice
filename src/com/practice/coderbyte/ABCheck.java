package com.practice.coderbyte;

/**
 * Have the function ABCheck(str) take the str parameter being
 * passed and return the string true if the characters
 * a and b are separated by exactly 3 places anywhere in
 * the string at least once (ie. "lane borrowed" would result
 * in true because there is exactly three characters between a and b). Otherwise return the string false.
 * Examples
 * Input: "after badly"
 * Output: false
 * Input: "Laura sobs"
 * Output: true
 */
public class ABCheck {
    public static String ABCheck(String str) {
        // code goes here
        for(int i=0;i<str.length()-4;i++){
            if((str.charAt(i)=='a'&&str.charAt(i+4)=='b')||(str.charAt(i)=='b'&&str.charAt(i+4)=='a')){
                return "true";
            }
        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s ="Laura sobsd";
        System.out.print(ABCheck(s));
    }
}

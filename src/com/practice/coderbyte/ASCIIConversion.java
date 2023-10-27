package com.practice.coderbyte;
/*
ASCII Conversion
Have the function ASCIIConversion(str) take the str parameter being passed and return a new string where every character, aside from the space character, is replaced with its corresponding decimal character code. For example: if str is "dog" then your program should return the string 100111103 because d = 100, o = 111, g = 103.
Examples
Input: "hello world"
Output: 104101108108111 119111114108100
Input: "abc **"
Output: 979899 4242
 */
public class ASCIIConversion {

    public static String ASCIIConversion(String str) {
        // code goes here
        String strnew="";
        for(int i=0;i< str.length();i++){
            int num= str.charAt(i);
            strnew=strnew+num;
        }
        strnew=strnew.replaceAll("32"," ");
        return strnew;
    }

    public static void main (String[] args) {
        // keep this function call here
       String s="hello world";
        System.out.print(ASCIIConversion(s));
    }

}

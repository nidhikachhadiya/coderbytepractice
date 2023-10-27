package com.practice.coderbyte;

import java.util.Scanner;

/**
 * Have the function SimpleSymbols(str) take the str parameter
 * being passed and determine if it is an acceptable sequence
 * by either returning the string true or false.
 * The str parameter will be composed of + and = symbols
 * with several characters between them (ie. ++d+===+c++==a)
 * and for the string to be true each letter must be surrounded
 * by a + symbol. So the string to the left would be false.
 * The string will not be empty and will have at least one letter.
 * Examples
 * Input: "+d+=3=+s+"
 * Output: true
 * Input: "f++d+"
 * Output: false
 */
public class SimpleSymbols {
    public static String SimpleSymbols(String str) {

        String surrounded="";
        char c[]=str.toCharArray();
        if(Character.isLetter(c[0])){
            surrounded="false";
        }
        for(int i=1;i<c.length;i++){

            if(Character.isLetter(c[i])){
                if(c[i-1]=='+' && c[i+1]=='+'){
                    surrounded="true";
                }
                  else {
                      surrounded = "false";
                    break;
                }
            }

        }
        // code goes here
        return surrounded;
    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
       String s="b";
        System.out.print(SimpleSymbols(s));
    }
}

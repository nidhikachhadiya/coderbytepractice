package com.practice.coderbyte;

/**
 * Ex Oh
 * Have the function ExOh(str) take the str parameter being passed
 * and return the string true if there is an equal number
 * of x's and o's, otherwise return the string false. Only these two letters
 * will be entered in the string, no punctuation or numbers. For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.
 * Examples
 * Input: "xooxxo"
 * Output: true
 * Input: "x"
 * Output: false
 */
public class ExOh {
    public static String ExOh(String str) {
        // code goes here
        int number_of_x=0;
        int number_of_o=0;
        char c[]=str.toLowerCase().toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='x')
            {
                number_of_x++;
            }
            else
            {
                number_of_o++;
            }
        }
        if(number_of_o==number_of_x)
            return "true";
        else
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "xoxoxoo";
        System.out.print(ExOh(s));
    }
}


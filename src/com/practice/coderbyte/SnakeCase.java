package com.practice.coderbyte;

/**
 * Have the function SnakeCase(str) take the str parameter being passed and return it in proper snake case format where each word is lowercased and separated from adjacent words via an underscore. The string will only contain letters and some combination of delimiter punctuation characters separating each word.
 *
 * For example: if str is "BOB loves-coding" then your program should return the string bob_loves_coding.
 * Examples
 * Input: "cats AND*Dogs-are Awesome"
 * Output: cats_and_dogs_are_awesome
 * Input: "a b c d-e-f%g"
 * Output: a_b_c_d_e_f_g
 */
public class SnakeCase {
    public static String SnakeCase(String str) {
        // code goes here
        String strnew="";
        char c[]=str.toLowerCase().toCharArray();
        for(int i=0;i<c.length;i++){
            if(!(Character.isAlphabetic(str.charAt(i)))){
                c[i]='_';
            }
            strnew=strnew +c[i];

        }
        return strnew;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="a b c d-e-f%g";
        System.out.print(SnakeCase(s));
    }
}

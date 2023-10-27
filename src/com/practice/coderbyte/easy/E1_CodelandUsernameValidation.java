package com.practice.coderbyte.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class E1_CodelandUsernameValidation {
    public static void main(String[] args) {
        System.out.println(FindIntersection("hello*3"));

    }
    public static String FindIntersection(String str) {

        List<Character> Vovel=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        String newstr="";
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isLetter(c[i])) {
                if (c[i] == 'z') {
                    c[i] = 'A';
                    continue;
                }
                ++c[i];
            }
            if(Vovel.contains(c[i])){
                c[i]=Character.toUpperCase(c[i]);
            }
            newstr=newstr+c[i];
        }
        return newstr;
    }
}

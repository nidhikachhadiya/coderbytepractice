package com.practice.coderbyte;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 *
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
 * Examples
 * Input: "aa6?9"
 * Output: false
 * Input: "acc?7??sss?3rr1??????5"
 * Output: true
 */
public class QuestionsMarks {

    public static String QuestionsMarks(String str) {
        // code goes here
       str=str.replaceAll("[a-z]","");
        System.out.println(str);
        Pattern pattern =Pattern.compile("([0-9])([?])([?])([?])([0-9])");
        Pattern pattern1 =Pattern.compile("([0-9])([?])([?])([0-9])");
        Pattern pattern2 =Pattern.compile("([0-9])([?])([0-9])");

        Matcher matcher1 =pattern1.matcher(str);
        Matcher matcher2 =pattern2.matcher(str);
        Matcher matcher =pattern.matcher(str);

        if(matcher1.find() || matcher2.find()){
            return "false";
}
        if(matcher.find()){
            return "true";
        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="acc?7??sss?3rr1??????5";
        System.out.print(QuestionsMarks(s));
    }
}

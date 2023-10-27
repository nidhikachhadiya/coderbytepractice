package com.practice.coderbyte;

/**
 * Word Count
 * Have the function WordCount(str) take the str string parameter being passed and return the number of words the string contains (e.g. "Never eat shredded wheat or cake" would return 6). Words will be separated by single spaces.
 * Examples
 * Input: "Hello World"
 * Output: 2
 * Input: "one 22 three"
 * Output: 3
 */
public class WordCount {

    public static int WordCount(String str) {
        // code goes here
        int num=0;
        String s[] =str.split(" ");
        return s.length;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "Nidhi Kachhadiya";
        System.out.print(WordCount(s));
    }
}

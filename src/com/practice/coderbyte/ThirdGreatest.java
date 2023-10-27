package com.practice.coderbyte;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Have the function ThirdGreatest(strArr) take the array of strings stored in strArr and return the third largest word within it. So for example: if strArr is ["hello", "world", "before", "all"] your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.
 * Examples
 * Input: new String[] {"coder","byte","code"}
 * Output: code
 * Input: new String[] {"abc","defg","z","hijk"}
 * Output: abc
 */
public class ThirdGreatest {

    public static String ThirdGreatest(String[] strArr) {
        // code goes here
       ArrayList<Integer> length=new ArrayList<>();
       for(int i=0;i<strArr.length;i++){
           length.add(strArr[i].length());
       }
        Collections.sort(length);
        Collections.reverse(length);
        int thirdHightest=length.get(2);
        for(int i=strArr.length-1;i>=0;i--){
            if(strArr[i].length()==thirdHightest){
                return strArr[i];
            }
        }
        return "";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s[]= {"abc","defg","z","hijk"};
        System.out.print(ThirdGreatest(s));
    }
}

package com.practice;
//
public class ReverseString {

    public static void main(String[] args) {
        reverseString("Nidhi");
    }

    public static String reverseString(String str){
        String reverse="";
        char c[]=str.toCharArray();
        for(int i=c.length-1;i>0;i--){
            reverse=reverse+c[i];
        }
        System.out.println(reverse);
        return reverse;
    }

}

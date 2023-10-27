package com.practice.infos;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("this is hello world String"));
    }
    public static String reverseString(String str){
        String reverseString="";
        String strSplit[]=str.split(" ");
        String first=strSplit[0];
        String last=strSplit[strSplit.length-1];
        String reverseFirst=new StringBuilder(first).reverse().toString();
        String reverselast=new StringBuilder(last).reverse().toString();
        reverseString=reverseFirst + " "+reverselast;
        return reverseString;
    }
}

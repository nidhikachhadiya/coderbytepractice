package com.practice.infos;

public class FindSubString {
    public static void main(String[] args) {
        String str="Nidhi Kachhaddiya";
        findSubString(str);
    }
    public static void findSubString(String s){
        String str=s.substring(1,s.length()-3);
        System.out.println(str);
    }
}

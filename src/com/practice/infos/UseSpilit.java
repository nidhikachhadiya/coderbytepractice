package com.practice.infos;

public class UseSpilit {
    public static void main(String[] args) {
        String statement="Nidhi Kachhadiya is Automation Engineer";
        useSplit(statement);
    }

    public static void useSplit(String str){
        String strArray[]=str.split(" ");
       for(String s:strArray){
           System.out.println(s);
       }
    }
}

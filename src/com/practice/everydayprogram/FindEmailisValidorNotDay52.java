package com.practice.everydayprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmailisValidorNotDay52 {
    public static void main(String[] args) {
        String s="@yahoo.com";
        String regex="^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(s);
        if(matcher.matches()){
            System.out.println("Valid email");
        }
        else
            System.out.println("Not Valid");

    }
}

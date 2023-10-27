package com.practice.coderbyte;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {

    public static boolean CodelandUsernameValidation(String str) {
        // code goes here
        String regex="^[a-zA-z0-9_]*$";
        if(str.length()>=4 && str.length()<=25){
            char firstchar= str.charAt(0);
            if(Character.isLetter(firstchar)){
                if(str.charAt(str.length()-1)!='_'){
                    if(Pattern.matches(regex,str)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}

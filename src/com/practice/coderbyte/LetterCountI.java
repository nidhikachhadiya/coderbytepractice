package com.practice.coderbyte;

public class LetterCountI {


    public static String LetterCountI(String str) {
        // code goes here
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                for (int k = j + 1; k < parts[i].length(); k++) {
                    if (parts[i].charAt(j) == parts[i].charAt(k))
                        return parts[i];
                }
            }
        }
        return "-1";
    }

    public static void main (String[] args) {
        // keep this function call here
       String s="Nidhi Kachhadiya";
        System.out.print(LetterCountI(s));
    }
}

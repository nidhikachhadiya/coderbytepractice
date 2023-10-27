package com.practice.infos;

public class PalindromeString {
    public static void main(String[] args) {
        String msg = isStringPalindrom("MADAM") ? "Given String is  Palindrom" : "Given String is not Palindrom";
        System.out.println(msg);
    }

    public static boolean isStringPalindrom(String s) {
        String temp = s;
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(isStringPalindromWithBuilder("Nidhi"));

        System.out.println(reverse);
        return reverse.toLowerCase().equals(temp.toLowerCase());
    }

    public static boolean isStringPalindromWithBuilder(String s) {
        String temp = s;
        String reverse = "";
        StringBuilder sb=new StringBuilder(s);
        reverse=sb.reverse().toString();
        return reverse.toLowerCase().equals(temp.toLowerCase());

    }


}

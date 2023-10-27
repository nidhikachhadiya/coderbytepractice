package com.practice.everydayprogram;

import java.util.Arrays;

public class CompareStringAreAnagramDay16 {
    public static void main(String[] args) {
        String s1="Nidhi";
        String s2="idhiN";
        checkAnagramString(s1,s2);
    }
    public static void checkAnagramString(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println("given String are not anagram");
        }

        else {
            char array1[]=str1.toLowerCase().toCharArray();
            char array2[]=str2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            if(Arrays.equals(array1,array2)){
                System.out.println("given String is anagram");
            }
            else
            {
                System.out.println("given String is not anagram");

            }
        }
    }
}

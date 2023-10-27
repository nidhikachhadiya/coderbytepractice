package com.practice.coderbyte.medium;

public class MinWindowSubstring {
    public static String MinWindowSubstring(String[] strArr) {
        // code goes here
        String s1=strArr[0];
        String s2=strArr[1];
        String output="";
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s2.contains(Character.toString(s1.charAt(i)))){
                    output=output+s1.charAt(i);
                }

            }
        }
        return null;
    }

    public static void main (String[] args) {
        // keep this function call here
        String input[] = new String[] {"ahffaksfajeeubsne", "jefaa"};
        System.out.print(MinWindowSubstring(input));
    }
}
//aaffaaffjjee
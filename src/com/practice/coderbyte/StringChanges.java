package com.practice.coderbyte;

/**
 * String Changes
 * Have the function StringChanges(str) take the str parameter
 * being passed, which will be a string containing letters from
 * the alphabet, and return a new string based on the following
 * rules. Whenever a capital M is encountered, duplicate the
 * previous character (then remove the M), and whenever a capital
 * N is encountered remove the next character from the string
 * (then remove the N). All other characters in the string
 * will be lowercase letters. For example: "abcNdgM" should
 * return "abcgg". The final string will never be empty.
 * Examples
 * Input: "MrtyNNgMM"
 * Output: rtyggg
 * Input: "oMoMkkNrrN"
 * Output: ooookkr
 */
public class StringChanges {
    public static String StringChanges(String str) {
        // code goes here
        StringBuilder sb=new StringBuilder();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='M' && i!=0){
                c[i]=c[i-1];
            }
            if(c[i]=='M' && i==0){
                c[i]='.';
            }
            if(c[i]=='N'){
                if(i==c.length-1)
                    c[i]='.';
                else{
                    c[i]='.';
                    c[i+1]='.';
                }
            }
            sb=sb.append(c[i]);
        }
        for(int j=0;j<sb.length();j++){
            if(sb.charAt(j)=='.'){
                sb.deleteCharAt(j);
                j--;
            }
        }
        return sb.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="oMoMkkNrrN";
        System.out.print(StringChanges(s));
    }
}

package com.practice.everydayprogram;



public class ReverseVowelsDay38 {
    public static void main(String[] args) {
        String s="hellou";
        System.out.println(reverseVovel(s));
    }
    public static boolean isvolve(char c){
        return (c=='a' || c=='e' ||c=='i' ||c=='o' || c=='u');
    }
    public static String reverseVovel(String str){
        String volvel="";
        int j=0;
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(isvolve(c[i])){
                j++;
                volvel=volvel+c[i];
            }
            System.out.println(volvel);
        }
        for(int i=0;i<c.length;i++){
            if(isvolve(c[i])){
                c[i]=volvel.charAt(--j);
            }
        }
        return String.valueOf(c);
    }
}

package com.practice.everydayprogram;

public class CountParticularCharacterInStringDay6 {
    public static void main(String[] args) {
        String str="NidhiKachhadiya";
        countParticularCharacterInString(str);
    }

    public static void countParticularCharacterInString(String s){
        char c[]=s.toCharArray();
        char particularChar ='a';
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==particularChar){
                ++count;
            }
        }
        System.out.println(particularChar + " is "+ count +" times");
    }
}

package com.practice.everydayprogram;

public class CountNumberofVovelsinStringDay7 {
    public static void main(String[] args) {
        String str="NidhiKachhadiya";
        countNumberofVovelsinString(str);
    }
    public static void countNumberofVovelsinString(String s){
        char c[]=s.toLowerCase().toCharArray();
        int count=0;
        if(c.length>=1){
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e'|| c[i]=='i' || c[i]=='o'||c[i]=='u'){
                ++count;
            }
        }
            System.out.println("Vovels are "+count);
    }
    }
}

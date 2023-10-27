package com.practice.everydayprogram;

public class FindLengthofStringDay10 {
    public static void main(String[] args) {
        String str="NidhiRavi";
        findlength(str);
    }
    public static void findlength(String s){
        char [] c=s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            ++count;
        }
        System.out.println(count);
    }
}

package com.practice.everydayprogram;

public class RemoveVovelFromStringDay39 {
    public static void main(String[] args) {
        String s="Nidhi Kachhadiya";
        String regex="[aeiouAEIOU]";
        String str=s.replaceAll(regex,"");
        System.out.println(str);

        //Remove digit
        String strdigit="Nidhi1345";
        String strd="[0123456789]";
        String withoutDigit =strdigit.replaceAll(strd,"");
        System.out.println(withoutDigit);

    }
}

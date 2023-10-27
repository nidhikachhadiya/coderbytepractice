package com.practice.infos;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s="Nidhi Kachhadiya";
        System.out.println(removeDuplicate(s));

    }
    public static String removeDuplicate(String str){
        String strnew="";
        LinkedHashSet<Character> hashSet=new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++){
            hashSet.add(str.charAt(i));
        }
        Iterator<Character> e=hashSet.iterator();
        while(e.hasNext()){
           strnew=strnew+e.next();
        }
return strnew;



    }
}

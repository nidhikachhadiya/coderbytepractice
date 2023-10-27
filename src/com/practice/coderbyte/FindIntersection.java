package com.practice.coderbyte;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class FindIntersection {

    public static String FindIntersection(String[] s) {
        // code goes here
        String s1[]=s[0].split(",");
        String s2[] =s[1].split(",");
        String strnew="";

        LinkedHashSet<Integer> linkedHashSet =new LinkedHashSet<Integer>();
        for(int i=0;i<s1.length;i++){
            linkedHashSet.add(Integer.valueOf(s1[i].trim()));
        }
        for(int i=0;i<s2.length;i++){
            if(linkedHashSet.contains(Integer.parseInt(s2[i].trim()))){
               strnew=strnew+","+s2[i].trim();
            }
        }
        if(strnew.length()>0)
        return strnew.substring(1,strnew.length());
        else
            return "false";

    }

    public static void main (String[] args) {
        // keep this function call here

        String s[] = new String[] {"1, 2, 3, 4, 5", "6, 7, 8, 9, 10"};
        System.out.print(FindIntersection(s));

    }

    }



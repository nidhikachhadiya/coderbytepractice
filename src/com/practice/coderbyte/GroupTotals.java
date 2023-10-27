package com.practice.coderbyte;

import java.util.HashMap;
import java.util.Map;

/**
 * Have the function GroupTotals(strArr) read in the strArr parameter containing key:value pairs where the key is a string and the value is an integer. Your program should return a string with new key:value pairs separated by a comma such that each key appears only once with the total values summed up.
 *
 * For example: if strArr is ["B:-1", "A:1", "B:3", "A:5"] then your program should return the string A:6,B:2.
 *
 * Your final output string should return the keys in alphabetical order. Exclude keys that have a value of 0 after being summed up.
 * Examples
 * Input: new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"}
 * Output: B:3,Y:1
 * Input: new String[] {"Z:0", "A:-1"}
 * Output: A:-1
 */
public class GroupTotals {

    public static String GroupTotals(String[] strArr) {
        // code goes here
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<strArr.length;i++){
          String s[]=strArr[i].split(":");
            if(map.containsKey(s[0])){
                int count=map.get(s[0])+Integer.parseInt(s[1]);
                map.put(s[0],count);
            }
            else
                map.put(s[0],Integer.parseInt(s[1]));
        }
        String strnew="";
       for(Map.Entry<String,Integer> entry: map.entrySet()){
           if(entry.getValue()!=0){
               strnew =strnew + entry.getKey() + ":"+ entry.getValue() +",";
           }
       }
       strnew=strnew.substring(0,strnew.length()-1);
        return strnew;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s[]=new String[] {"M:-7", "D:-3", "Y:-5", "D:32", "Y:2022", "M:18"};
        System.out.print(GroupTotals(s));
    }
}

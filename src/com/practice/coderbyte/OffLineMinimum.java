package com.practice.coderbyte;

import java.util.TreeSet;

/**
 * Off Line Minimum
 * Have the function OffLineMinimum(strArr) take the strArr parameter being passed which will be an array of integers ranging from 1...n and the letter "E" and return the correct subset based on the following rules. The input will be in the following format: ["I","I","E","I",...,"E",...,"I"] where the I's stand for integers and the E means take out the smallest integer currently in the whole set. When finished, your program should return that new set with integers separated by commas. For example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] then your program should return 4,1,5.
 * Examples
 * Input: new String[] {"1","2","E","E","3"}
 * Output: 1,2
 * Input: new String[] {"4","E","1","E","2","E","3","E"}
 * Output: 4,1,2,3
 */
public class OffLineMinimum {
    public static String OffLineMinimum(String[] nums) {
        // code goes here
        TreeSet<String> set = new TreeSet<String>();
        String result = "";
        for(int i=0;i<nums.length;i++){
            if(nums[i]=="E"){
                if(result==""){
                    result=set.first();
                }
                else
                    result=result+ "," + set.first();
                set.remove(set.first());
            }
            else
                set.add(nums[i]);
        }


       return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        String str[]=new String[] {"1","2","E","E","3"};
        System.out.print(OffLineMinimum(str));
    }

}

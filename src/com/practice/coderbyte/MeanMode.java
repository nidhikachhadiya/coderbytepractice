package com.practice.coderbyte;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Mean Mode
 * Have the function MeanMode(arr) take the array of numbers stored in arr and return 1 if the mode equals the mean, 0 if they don't equal each other (ie. [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)). The array will not be empty, will only contain positive integers, and will not contain more than one mode.
 * Examples
 * Input: new int[] {1, 2, 3}
 * Output: 0
 * Input: new int[] {4, 4, 4, 6, 2}
 * Output: 1
 */
public class MeanMode {

    public static int MeanMode(int[] arr) {
        // code goes here
        int mean;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
         mean=sum/arr.length;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) {
                int count=(int)map.get(arr[i]);
                map.put(arr[i],++count);
            }
            else
                map.put(arr[i],1);
        }
        int maxValueInMap = Collections.max(map.values());
        int mode=0;
     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
         if(maxValueInMap==entry.getValue()){
            mode=entry.getKey();
         }
     }
     if(mean==mode)
        return 1;
     else
         return 0;
    }
    

    public static void main (String[] args) {
        // keep this function call here
       int[]a= new int[]  {1, 2, 3};
        System.out.print(MeanMode(a));
    }

}

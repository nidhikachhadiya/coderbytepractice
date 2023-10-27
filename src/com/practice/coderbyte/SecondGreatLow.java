package com.practice.coderbyte;

import java.util.*;
import java.util.stream.Collectors;

public class SecondGreatLow {

    public static String SecondGreatLow(Integer[] arr) {
        // code goes here
       List<Integer> list=new ArrayList<>();
       if(arr.length>2) {
           for (int i = 0; i < arr.length; i++) {
               if (!(list.contains(arr[i]))) {
                   list.add(arr[i]);
               }
           }
           Collections.sort(list);
           int secondLargest = list.get(list.size() - 2);
           int secondlowest = list.get(1);
           return String.valueOf(secondlowest) + " " + String.valueOf(secondLargest);
       }
       else
           {
               Arrays.sort(arr);
               if(arr[1]>arr[0])
               return String.valueOf(arr[1])+ " "+String.valueOf(arr[0]);
               else
                   return String.valueOf(arr[1])+ " "+String.valueOf(arr[0]);
           }
       }



    public static void main (String[] args) {
        // keep this function call here
       Integer []num=  {80,80};
        System.out.print(SecondGreatLow(num));
    }

}

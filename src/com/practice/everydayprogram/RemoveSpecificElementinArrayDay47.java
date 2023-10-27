package com.practice.everydayprogram;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveSpecificElementinArrayDay47 {
    public static void main(String[] args) {
        Integer[] arr= {5,10,15,20,21,25};
        Integer elementToRemove=21;
        LinkedList<Integer> ls=new LinkedList<>(Arrays.asList(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elementToRemove){
                ls.remove(arr[i]);
            }
        }
        Integer [] array =new Integer[ls.size()];
        for(int i=0;i<ls.size();i++){
            array[i]=ls.get(i);
            System.out.println(array[i]);
        }

    }
}

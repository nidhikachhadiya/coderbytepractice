package com.practice.everydayprogram;

import com.practice.collection.set.TreesetExample;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortArrayDay12 {

    public static void main(String[] args) {
        Integer array1[]={3,4,1,5,6};
        sortAnArray(array1);
    }

    public static void sortAnArray(Integer a[]){
        int temp=a[0];
        //Sort an array with inbuild method
       /* Arrays.sort(a);
       for(int num:a){
            System.out.println(num);
        }*/
       // Sort an array with 2 for loops
        /*for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int num:a){
            System.out.println(num);
        }*/

        // Sort an array using collection
        List<Integer> list=Arrays.asList(a);
        TreeSet<Integer> treeset =new TreeSet<Integer>(list);
        System.out.println(treeset);

    }

}

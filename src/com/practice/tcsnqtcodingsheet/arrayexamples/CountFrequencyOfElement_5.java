package com.practice.tcsnqtcodingsheet.arrayexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountFrequencyOfElement_5 {
    public static void main(String[] args) {
        Integer array[]= {1,3,5,6,4,2,2,3,4};
        List ls=new ArrayList(Arrays.asList(array));
        HashMap map=new HashMap();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int count=(int)map.get(array[i]);
                map.put(array[i],++count);
            }
            else
                map.put(array[i],1);
        }

        System.out.println(map);
    }
}

package com.practice.tcsnqtcodingsheet.arrayexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray_8 {
    public static void main(String[] args) {
        List ls =new ArrayList(Arrays.asList(2,5,6,1,3,7,1));
        Collections.rotate(ls,2);
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}

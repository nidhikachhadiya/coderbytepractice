package com.practice.ibmpracticeprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print1to10WithoutLoop {
   static int i=1;
    public static void main(String[] args) {

        if(i<=10){
            System.out.print(" "+i++);
            main(null);
        }
    }
}

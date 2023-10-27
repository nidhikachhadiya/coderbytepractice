package com.practice;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int myarray1[]={2,4,5,1};
        int myarray2[]={4,5,7,8,1};
        int dummy[]=new int[myarray1.length+myarray2.length];

        for(int i=0;i<myarray1.length;i++){
            dummy[i]=myarray1[i];
        }
        for(int i=0;i<myarray2.length;i++){
            dummy[myarray1.length+i]=myarray2[i];
        }






    }
}

package com.practice.everydayprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingNumberFromArrayDay43 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6,8,8};
        int b[]=new int[a.length+1];
        for(int i=0;i<=a.length;i++){
            b[i]=0;
        }
        for(int i=0;i<a.length;i++){
            b[a[i]-1]=1;
        }
        int ans=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==0){
               ans=i+1;
               System.out.println(ans);
            }
        }

        }






    }


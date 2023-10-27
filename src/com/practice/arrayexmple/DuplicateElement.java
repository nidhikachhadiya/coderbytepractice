package com.practice.arrayexmple;

public class DuplicateElement {
    public static void main(String[] args) {
        int a[]={3,5,6,3,6,7,8};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                System.out.println(a[i]+" is duplicate");
            }

        }
    }
}

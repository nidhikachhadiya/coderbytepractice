package com.practice.arrayexmple;

public class OccurrenceElement {
    public static void main(String[] args) {
        int a[]={3,4,5,6,3,1,3};
        int x=4;
        int count=0;
       for(int j=0;j<a.length;j++){
        for(int i=0;i<a.length;i++){
            if(a[i]==a[j]){
                count++;
            }
        }
        System.out.println("number "+a[j]+" is " +count + "times ");
        count=0;
       }
    }
}

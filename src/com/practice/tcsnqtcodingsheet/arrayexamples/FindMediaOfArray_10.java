package com.practice.tcsnqtcodingsheet.arrayexamples;

public class FindMediaOfArray_10 {
    public static void main(String[] args) {
        int a[]={1,3,5,7,7,8,9};
        int n=a.length;
        if(n%2==0){
          int m=(a[n/2-1]+a[n/2])/2;
            System.out.println(m);

        }
        else{
            int m=a[(n+1)/2-1];
            System.out.println(m);
        }
    }
}

package com.practice.arrayexmple;

public class MoveAllNegativeElement {
    public static void main(String[] args) {
        int a[]={2,4,-1,-4,-5,3,6};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);

        }

    }
}

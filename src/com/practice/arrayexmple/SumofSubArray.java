package com.practice.arrayexmple;

public class SumofSubArray {
    public static void main(String[] args) {
        int a[]={1,2,5,6,7};
        int sum=7;
        int total=0;
        boolean flag=false;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                total=a[i]+a[j];
                if(total==sum){
                    System.out.println("sum of index "+i +" and " +j +" is same as " +sum );
                    break;
                }
            }
        }
    }
}

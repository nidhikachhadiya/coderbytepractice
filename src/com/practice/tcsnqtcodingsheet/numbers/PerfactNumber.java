package com.practice.tcsnqtcodingsheet.numbers;

public class PerfactNumber {
    public static void main(String[] args) {
        int num=6;
        int temp=num;
        int sum=0;
        for(int i=1;i<num-1;i++){
        if(num%i==0){
            sum=sum+i;
        }
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Given number is perfect numnber");
        }
        else {
            System.out.println("Given number is not perfect number");
        }
    }

}

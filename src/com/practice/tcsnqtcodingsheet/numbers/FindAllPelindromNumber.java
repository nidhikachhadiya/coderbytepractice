package com.practice.tcsnqtcodingsheet.numbers;

public class FindAllPelindromNumber {
    public static void main(String[] args) {
        int min=10,max=100;
        for(int i=min;i<=100;i++){
            if(isPelindrom(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPelindrom(int n){
        int temp=n;
        int reminder;
        int reverse=0;
        while(n>0){
            reminder=n%10;
            reverse=reverse*10+reminder;
            n=n/10;
        }

        if(reverse==temp) {
            return true;
        }
        else
            return false;
    }
}

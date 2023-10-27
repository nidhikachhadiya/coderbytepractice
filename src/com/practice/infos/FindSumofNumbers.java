package com.practice.infos;
// -1+-2+-
public class FindSumofNumbers {

    public static void main(String[] args) {
        System.out.println(findSum(-4));
    }
    public static int findSum(int number){
        int sum=0;
        if(number==0)
            return 0;
        if(number>0) {

            /*for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }*/
        }

        if(number<0){
            for(int i=0;i>=number;i--){
                sum=sum+i;
            }
        }
        return sum;
    }
}

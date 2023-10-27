package com.practice.infos;

public class PerfectNumber {
    public static void main(String[] args) {

        int number = 124;
        findPerfectNumber(6);
    }

    public static boolean findPerfectNumber(int num) {
      int sum=0;
      for(int i=1;i<num;i++){
          if(num%i==0){
              sum=sum+i;
          }
      }
        System.out.println(sum);


        return false;
}

}

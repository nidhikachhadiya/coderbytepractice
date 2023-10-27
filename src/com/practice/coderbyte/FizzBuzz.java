package com.practice.coderbyte;

/**
 * FizzBuzz
 * Have the function FizzBuzz(num) take the num parameter
 * being passed and return all the numbers from 1 to num
 * separated by spaces, but replace every number that is
 * divisible by 3 with the word "Fizz", replace every number
 * that is divisible by 5 with the word "Buzz", and every number
 * that is divisible by both 3 and 5 with the word "FizzBuzz".
 * For example: if num is 16, then your program should return
 * the string "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14
 * FizzBuzz 16". The input will be within the range 1 - 50.
 * Examples
 * Input: 3
 * Output: 1 2 Fizz
 * Input: 8
 * Output: 1 2 Fizz 4 Buzz Fizz 7 8
 */
public class FizzBuzz {

    public static String FizzBuzz(int num) {
        // code goes here
        char c='.';
        StringBuilder sb=new StringBuilder();
        boolean mode=false;
        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                sb=sb.append(" FizzBuzz");
                mode=true;
            }
          else  if(i%3==0){
                sb=sb.append(" Fizz");
                mode=true;
          }
           else if(i%5==0){
                sb=sb.append(" Buzz");
                mode=true;
           }
           if(!mode){
               sb=sb.append(" "+i);
           }
           mode=false;
        }
        return sb.deleteCharAt(0).toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        int num=16;
        System.out.print(FizzBuzz(num));
    }
}

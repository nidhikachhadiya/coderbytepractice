package com.practice.coderbyte;

/**
 * Next Palindrome
 * Have the function NextPalindrome(num) take the num parameter being passed and return the next largest palindromic number. The input can be any positive integer. For example: if num is 24, then your program should return 33 because that is the next largest number that is a palindrome.
 * Examples
 * Input: 2
 * Output: 3
 * Input: 180
 * Output: 181
 */
public class NextPalindrome {

    public static int NextPalindrome(int num) {
        // code goes here
        int result;
        int i;
        for(i=num+1;;i++){
            if (isNumberpelindrom(i)){
                result=i;
                break;
            }
        }
      return i;
    }
   public static boolean isNumberpelindrom(int number){
       int temp=number;
       int reverse=0;
       int remider;
        while(number>0){
            remider=number%10;
            reverse=reverse*10 +remider;
            number=number/10;
        }
       if(reverse==temp){
            return true;
        }
        return false;
   }
    public static void main (String[] args) {
        // keep this function call here
        int num=2;
        System.out.print(NextPalindrome(num));
    }

}

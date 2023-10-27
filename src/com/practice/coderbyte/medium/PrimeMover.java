package com.practice.coderbyte.medium;

/**
 * Prime Mover
 * Have the function PrimeMover(num) return the numth prime number. The range will be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is the 16th prime number.
 * Examples
 * Input: 9
 * Output: 23
 * Input: 100
 * Output: 541
 */
public class PrimeMover {
    public static int PrimeMover(int num) {
        // code goes here
        int count=0;
        for(int i=2;i<=Integer.MAX_VALUE;i++) {
            if(isPrimer(i))
            {
                count++;
                if(count==num){
                    return i;
                }
            }

        }
        return 0;
    }
    static boolean isPrimer(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public static void main (String[] args) {
        // keep this function call here
        int number=9;
        System.out.print(PrimeMover(number));
    }
}


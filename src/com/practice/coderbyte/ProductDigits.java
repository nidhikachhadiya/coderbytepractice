package com.practice.coderbyte;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Product Digits
 * Have the function ProductDigits(num) take the num parameter being passed which will be a positive integer, and determine the least amount of digits you need to multiply to produce it. For example: if num is 24 then you can multiply 8 by 3 which produces 24, so your program should return 2 because there is a total of only 2 digits that are needed. Another example: if num is 90, you can multiply 10 * 9, so in this case your program should output 3 because you cannot reach 90 without using a total of 3 digits in your multiplication.
 * Examples
 * Input: 6
 * Output: 2
 * Input: 23
 * Output: 3
 */
public class ProductDigits {
    public static int ProductDigits(int num) {
        // code goes here
        LinkedList<String> ls =new LinkedList<>();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i*j==num){
                    ls.add("" +i +j);
                }
            }
        }
        int min=ls.get(0).length();
        for(int i=0;i<ls.size();i++){
               if(ls.get(i).length()<min){
                 min=ls.get(i).length();
              }
         }
          return min;
    }

    public static void main (String[] args) {
        // keep this function call here
        int num=24;
        System.out.print(ProductDigits(num));
    }
}
/**
 * import java.util.*;
 * import java.io.*;
 *
 * class Main {
 *
 *   public static int ProductDigits(int num) {
 *     // code goes here
 *     LinkedList<String> ls =new LinkedList<>();
 *         for(int i=1;i<=num;i++){
 *             for(int j=1;j<=num;j++){
 *                 if(i*j==num){
 *                     ls.add("" +i +j);
 *                 }
 *             }
 *         }
 *         int min=ls.get(0).length();
 *         for(int i=0;i<ls.size();i++){
 *              if(ls.get(i).length()<min){
 *                  min=ls.get(i).length();
 *              }
 *         }
 *         return min;
 *   }
 *
 *   public static void main (String[] args) {
 *     // keep this function call here
 *     Scanner s = new Scanner(System.in);
 *     System.out.print(ProductDigits(s.nextLine()));
 *   }
 *
 * }
 */

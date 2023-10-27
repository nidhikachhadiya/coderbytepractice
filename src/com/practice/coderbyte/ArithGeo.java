package com.practice.coderbyte;

/**
 * Arith Geo
 * Have the function ArithGeo(arr) take the array of numbers stored in arr and return the string "Arithmetic" if the sequence follows an arithmetic pattern or return "Geometric" if it follows a geometric pattern. If the sequence doesn't follow either pattern return -1. An arithmetic sequence is one where the difference between each of the numbers is consistent, where as in a geometric sequence, each term after the first is multiplied by some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements.
 * Examples
 * Input: new int[] {5,10,15}
 * Output: Arithmetic
 * Input: new int[] {2,4,16,24}
 * Output: -1
 */
public class ArithGeo {

    public static String ArithGeo(int[] arr) {
        // code goes here
        int arith=arr[1]-arr[0];
        int geo=arr[1]/arr[0];
        boolean isArithmetic=true;
        boolean isGeometric=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arith!=arr[i+1])
                isArithmetic=false;
            if(arr[i]*geo!=arr[i+1])
                isGeometric=false;
        }
        if(isArithmetic==true && isGeometric==false)
            return "Arithmetic";
        if(isArithmetic==false && isGeometric==true)
            return "Geometric";
        return "-1";
    }

    public static void main (String[] args) {
        // keep this function call here
        int[] s = new int[] {1,2,3,4,5,10,20};
        System.out.print(ArithGeo(s));
    }
}

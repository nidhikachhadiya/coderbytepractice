package com.practice.coderbyte;

/**
 * Serial Number
 * Have the function SerialNumber(str) take the str parameter being passed and determine if it is a valid serial number with the following constraints:
 *
 * 1. It needs to contain three sets each with three digits (1 through 9) separated by a period.
 * 2. The first set of digits must add up to an even number.
 * 3. The second set of digits must add up to an odd number.
 * 4. The last digit in each set must be larger than the two previous digits in the same set.
 *
 * If all the above constraints are met within the string, the your program should return the string true, otherwise your program should return the string false. For example: if str is "224.315.218" then your program should return "true".
 * Examples
 * Input: "11.124.667"
 * Output: false
 * Input: "114.568.112"
 * Output: true
 */
public class SerialNumber {

    public static String SerialNumber(String str) {
        // code goes here
        int sumofeven=0;
        int sumofodd=0;
        boolean lastLarge=false;
        String strArray[]=str.split("\\.");
        if(strArray.length!=3)
            return "false";
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].length()!=3)
                return "false";
           if(i==0){
               for(int j=0;j<strArray[0].length();j++){
                 sumofeven=sumofeven+strArray[i].charAt(j);
               }
               if((strArray[i].charAt(2)>strArray[i].charAt(1)) && (strArray[i].charAt(2)>strArray[i].charAt(0)))
                   lastLarge=true;
           }
            if(i==1){
                for(int j=0;j<strArray[1].length();j++){
                    sumofodd=sumofodd+strArray[i].charAt(j);
                }
                if((strArray[i].charAt(2)>strArray[i].charAt(1)) && (strArray[i].charAt(2)>strArray[i].charAt(0)))
                    lastLarge=true;
                }
            }
        if((lastLarge) && (sumofeven%2==0) && (sumofodd%2!=0))
            return "true";

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        String s="224.315.218";
        System.out.print(SerialNumber(s));
    }
}

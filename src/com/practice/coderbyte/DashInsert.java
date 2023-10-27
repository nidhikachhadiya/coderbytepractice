package com.practice.coderbyte;

/**
 * Dash Insert
 * Have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str. For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number.
 * Examples
 * Input: 99946
 * Output: 9-9-946
 * Input: 56730
 * Output: 567-30
 */
public class DashInsert {

    public static String DashInsert(String str) {
        // code goes here
        String updated="";
        for(int i=0;i<str.length();i++){
            int number=Character.getNumericValue(str.charAt(i));
            if(isNumberOdd(number) && i>0){
                int previouse= Character.getNumericValue(str.charAt(i-1));
                if(isNumberOdd(previouse)){
                    updated=updated+"-";
                }
            }
            updated=updated+str.charAt(i);
        }


       return updated;
    }
   static boolean isNumberOdd(int num){
         if(num%2!=0){
             return true;
         }
         return false;

    }

    public static void main (String[] args) {
        // keep this function call here
        String s="77993";
        System.out.print(DashInsert(s));
    }
}

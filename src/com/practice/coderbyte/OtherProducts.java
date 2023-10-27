package com.practice.coderbyte;

/**
 * Other Products
 * Have the function OtherProducts(arr) take the array of numbers stored in arr and return a new list of the products of all the other numbers in the array for each element. For example: if arr is [1, 2, 3, 4, 5] then the new array, where each location in the new array is the product of all other elements, is [120, 60, 40, 30, 24]. The following calculations were performed to get this answer: [(2*3*4*5), (1*3*4*5), (1*2*4*5), (1*2*3*5), (1*2*3*4)]. You should generate this new array and then return the numbers as a string joined by a hyphen: 120-60-40-30-24. The array will contain at most 10 elements and at least 1 element of only positive integers.
 * Examples
 * Input: new int[] {1,4,3}
 * Output: 12-3-4
 * Input: new int[] {3,1,2,6}
 * Output: 12-36-18-6
 * Tags
 * arraymath fundamentalsGoogle
 */
public class OtherProducts {

    public static String OtherProducts(int[] arr) {
        // code goes here
        String result="";
        int newArray[]=new int[arr.length];
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            mul=1;
          for(int j=0;j<arr.length;j++){
              mul=mul*arr[j];
          }
          mul=mul/arr[i];
          newArray[i]=mul;
            System.out.println(newArray[i]);
        }

       for(int i=0;i<newArray.length;i++){
           result=result+"-"+newArray[i];
       }
       result=result.substring(1,result.length());
       return  result;
    }

    public static void main (String[] args) {
        // keep this function call here
        int num[]=new int[] {3,1,2,6};
        System.out.print(OtherProducts(num));
    }
}

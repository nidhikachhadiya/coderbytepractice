package com.practice.cgi;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 7, 9, 11, 13, 15};
        int k = 9;
        System.out.println(exist(ints,k));
    }
    static boolean exist(int arrayofnumber[],int k){

        int left=0;
        int right=arrayofnumber.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arrayofnumber[mid]==k)
                return true;
             if(arrayofnumber[mid]<k)
                left=mid+1;
            else
                right=mid-1;
        }

        return false;
    }
}

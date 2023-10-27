package com.practice.everydayprogram;

public class FoundElementInArrayDay13 {
    public static void main(String[] args) {
        int array []={2,5,6,7,9};
        int element =2;

        foundAnElementInArray(array,element);
    }

    public static void foundAnElementInArray(int a[],int e){
        boolean isFound=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==e){
              isFound=true;
              break;
            }
        }
        if(isFound)
        System.out.println("Element "+e+" is found in given array");
        else
            System.out.println("Element "+e+" is not found in given array");

    }
}

package com.practice.cgi;

public class RotateLeft {
    public static void main(String[] args) {
        int[] array= {1,3,2,6,4};

        for(int i=0;i<2;i++){
            int firstElement = array[0];
            for(int j=0;j<array.length-1;j++){
                array[j]=array[j+1];
            }
            array[array.length-1] = firstElement;
        }

        System.out.println("");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}

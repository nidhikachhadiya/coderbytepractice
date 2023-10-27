package com.practice.cgi;
// {2,6,4,1,3}
public class PracticeProgram {
    public static void main(String[] args) {


        int number_array[]={1,3,2,6,4};
        if(number_array.length==0){
            System.out.println("Please enter valid array");
        }
        int update_array[]=new int[number_array.length];

        int increatmentcount=2;
        for(int i=0;i<number_array.length-increatmentcount;i++){
            update_array[i]=number_array[i+increatmentcount];
        }
        for(int i=0;i<increatmentcount;i++){
            update_array[number_array.length-increatmentcount+i]=number_array[i];
        }
         for(int a:update_array){
             System.out.println(a);
         }

    }
}

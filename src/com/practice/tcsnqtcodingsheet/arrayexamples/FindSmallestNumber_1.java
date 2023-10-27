package com.practice.tcsnqtcodingsheet.arrayexamples;

public class FindSmallestNumber_1 {
    public static void main(String[] args) {
        int a[] = {2, 1, 3, 5, 7};
        int small = a[0];
        int second_small=a[0];
        int large=a[0];
        int second_large=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                second_small = small;
                small=a[i];
            }
            else if(a[i]<second_small && a[i]!=small){
                     second_small=a[i];
            }



        }
        for(int i=0;i<a.length;i++){
            if(a[i]>large){
                second_large=large;
                large=a[i];
            }
            else if(a[i]>second_large && a[i]!=large){
                second_large=a[i];
            }
        }

        System.out.println(second_small);
        System.out.println(second_large);

    }
}

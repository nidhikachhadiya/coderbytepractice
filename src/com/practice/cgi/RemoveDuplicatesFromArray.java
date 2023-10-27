package com.practice.cgi;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int number_array[]={1,3,5,6,1,2};
        int unique=0;

        // Find unique element
        for (int i = 0; i < number_array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (number_array[i] == number_array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique++;
            }
        }
        System.out.println(unique);


    }
}

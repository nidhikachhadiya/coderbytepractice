package com.practice.coderbyte;

import java.util.ArrayList;
import java.util.List;

/**
 * Triangle Row
 * Have the function TriangleRow(num) take num which will be a positive integer representing some row from Pascal's triangle. Pascal's triangle starts with a [1] at the 0th row of the triangle. Then the first row is [1, 1] and the second row is [1, 2, 1]. The next row begins with 1 and ends with 1, and the inside of the row is determined by adding the k-1 and kth elements from the previous row. The next row in the triangle would then be [1, 3, 3, 1], and so on. The input will be some positive integer and your goal is to return the sum of that row. For example: if num is 4 then your program should return the sum of 1 + 4 + 6 + 4 + 1 which is 16.
 * Examples
 * Input: 1
 * Output: 2
 * Input: 2
 * Output: 4
 */
public class TriangleRow {

    public static int TriangleRow(int num) {
        int ans = 1;
        for(int i = 0; i < num; i++){
            System.out.println(ans);
            ans=ans*2;
        }
        return ans;

    }

    public static void main (String[] args) {
        // keep this function call here
        int number=7;
        System.out.print(TriangleRow(number));

}
}

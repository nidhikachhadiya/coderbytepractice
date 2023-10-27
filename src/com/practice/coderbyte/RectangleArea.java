package com.practice.coderbyte;

import java.awt.*;

/**
 * Rectangle Area
 * Have the function RectangleArea(strArr) take the array
 * of strings stored in strArr, which will only contain 4
 * elements and be in the form (x y) where x and y are both
 * integers, and return the area of the rectangle formed by
 * the 4 points on a Cartesian grid. The 4 elements will be in
 * arbitrary order. For example: if strArr is
 * ["(0 0)", "(3 0)", "(0 2)", "(3 2)"]
 * then your program should return 6 because the width
 * of the rectangle is 3 and the height is 2 and the area of a rectangle
 * is equal to the width * height.
 * Examples
 * Input: new String[] {"(1 1)","(1 3)","(3 1)","(3 3)"}
 * Output: 4
 * Input: new String[] {"(0 0)","(1 0)","(1 1)","(0 1)"}
 * Output: 1
 */
public class RectangleArea {
    public static int RectangleArea(String[] strArr) {
        // code goes here
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (String str : strArr) {
            String[] coordinates = str.replaceAll("[()]", "").split(" ");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        int width = maxX - minX;
        int height = maxY - minY;
        int area = width * height;
        return area;
    }

    public static void main (String[] args) {
        // keep this function call here
        String str[]=new String[] {"(1 1)","(1 3)","(3 1)","(3 3)"};
        System.out.print(RectangleArea(str));
    }
}

package com.practice.coderbyte;

/**
 * Star Rating
 * Have the function StarRating(str) take the str parameter being passed which will be an average rating between 0.00 and 5.00, and convert this rating into a list of 5 image names to be displayed in a user interface to represent the rating as a list of stars and half stars. Ratings should be rounded to the nearest half. There are 3 image file names available: "full.jpg", "half.jpg", "empty.jpg". The output will be the name of the 5 images (without the extension), from left to right, separated by spaces. For example: if str is "2.36" then this should be displayed by the following image:
 *
 *
 *
 * So your program should return the string "full full half empty empty".
 * Examples
 * Input: "0.38"
 * Output: half empty empty empty empty
 * Input: "4.5"
 * Output: full full full full half
 */
public class StarRating {

    public static String StarRating(String str) {
        // code goes here
        String s[]=str.split("\\.");
        if((Integer.parseInt(s[0])==0))
        {
            if(Integer.parseInt(s[1])>0)
                return "half empty empty empty empty";
            else
                return "empty empty empty empty empty";
        }
        if((Integer.parseInt(s[0])==1))
        {
            if(Integer.parseInt(s[1])>0)
                return "full half empty empty empty";
            else
                return "full empty empty empty empty";
        }
        if((Integer.parseInt(s[0])==2))
        {
            if(Integer.parseInt(s[1])>0)
                return "full full half empty empty";
            else
                return "full full empty empty empty";
        }
        if((Integer.parseInt(s[0])==3))
        {
            if(Integer.parseInt(s[1])>0)
                return "full full full half empty";
            else
                return "full full full empty empty";
        }
        if((Integer.parseInt(s[0])==4))
        {
            if(Integer.parseInt(s[1])>0)
                return "full full full full half";
            else
                return "full full full full empty";
        }

        if((Integer.parseInt(s[0])==5) ){
            return "full full full full full";
        }

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        String s="4.0";
        System.out.print(StarRating(s));
    }

}

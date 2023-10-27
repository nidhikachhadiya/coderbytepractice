package com.practice.tcsnqtcodingsheet.numbers;

public class LeapYear {
    public static void main(String[] args) {
        int year=2024;
        if(isLeapYear(year))
            System.out.println("Give year is leap year");
        else
            System.out.println("Given year is not leap year");
    }
    static boolean isLeapYear(int y){
        if(y%400==0)
            return true;
        if(y%100==0)
            return false;
        if(y%4==0)
            return true;
        return false;
    }

}

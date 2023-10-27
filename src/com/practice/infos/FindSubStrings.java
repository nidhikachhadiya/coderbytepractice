package com.practice.infos;

public class FindSubStrings {

    public static void main(String[] args) {
        findSubStrings(null);
    }

    public static void findSubStrings(String str){
        if(str==null){
            System.out.println("Please enter vaild string");
        }
        if(str!=null) {
            if (str.length() == 0)
                System.out.println("Please enter vaild string");
            else {
                for (int i = 0; i < str.length(); i++) {
                    for (int j = i + 1; j < str.length(); j++) {
                        System.out.println(str.substring(i, j));
                    }
                }
            }
        }

    }
}

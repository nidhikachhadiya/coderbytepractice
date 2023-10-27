package com.practice.everydayprogram;

import java.util.Map;
import java.util.TreeMap;

public class IterateReverseTreeMapDay55 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map=new TreeMap<>();
        map.put(5, "Lilly");
        map.put(1, "Jasmine");
        map.put(16, "Daisy");
        map.put(7, "Lavender");
        map.put(6, "Rose");
        System.out.println(map);
        Map reverse =map.descendingMap();
        System.out.println(reverse);
    }
}

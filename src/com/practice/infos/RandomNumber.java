package com.practice.infos;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100000);
        System.out.println(number);

    }
}

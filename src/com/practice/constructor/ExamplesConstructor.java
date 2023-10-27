package com.practice.constructor;

public class ExamplesConstructor {

    private ExamplesConstructor(){
        System.out.println("Hello");
    }
    int i;
    private ExamplesConstructor(int i){
        this.i=i;
        System.out.println(i);

    }
    public static void main(String[] args) {
        ExamplesConstructor d=new ExamplesConstructor();
        ExamplesConstructor d1 =new ExamplesConstructor(5000);

    }
}

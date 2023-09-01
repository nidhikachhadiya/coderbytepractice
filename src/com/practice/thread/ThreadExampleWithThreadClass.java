package com.practice.thread;

public class ThreadExampleWithThreadClass extends Thread {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++) {
            ThreadExampleWithThreadClass threadExample = new ThreadExampleWithThreadClass();
            threadExample.start();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }


}

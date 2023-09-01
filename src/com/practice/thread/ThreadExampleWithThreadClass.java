package com.practice.thread;

public class ThreadExample extends Thread {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++) {
            ThreadExample threadExample = new ThreadExample();
            threadExample.start();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }


}

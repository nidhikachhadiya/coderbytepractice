package com.practice.thread;

public class ThreadExampleWithRunnableInterface implements Runnable
{
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            Thread thread = new Thread(new ThreadExampleWithRunnableInterface());
            thread.start();

        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}

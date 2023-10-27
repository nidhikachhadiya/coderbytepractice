package com.practice.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue queue =new PriorityQueue();
        queue.add("Nidhi");
        queue.add("Ravi");
        queue.add("k");
        queue.add("Jiyani");
        queue.add("Kachhadiya");
        System.out.println(queue);
        Object peekvalues=queue.peek();
        System.out.println(peekvalues);
    }
}

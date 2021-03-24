package com.practice.dsalgo.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args) {
//    PriorityQueue<String> queue = new PriorityQueue<>();
//
//    queue.add("Kiwi");
//    queue.add("Apple");
//    queue.add("Banana");
//    queue.add("Lemon");
//
//    /**
//     * Element will not be stored in the sorted form
//     */
//    System.out.println(queue);
//
//    /**
//     * Removal from Priority Queue will always be sorted form
//     */
//
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());

    PriorityQueue<Integer> iq = new PriorityQueue<>();

    iq.add(12);
    iq.add(5);
    iq.add(34);
    iq.add(1);

    System.out.println(iq);

    /**
     * Removal from Priority Queue will always be sorted form
     * The O/P will be 1, 5, 12, 34
     */

    System.out.println(iq.remove());
    System.out.println(iq.remove());
    System.out.println(iq.remove());
    System.out.println(iq.remove());


  }

}

package com.practice.dsalgo.queue.deque;

import java.util.ArrayDeque;

public class ArrayDequeExample {

  public static void main(String[] args) {

    ArrayDeque<Integer> deque = new ArrayDeque<>();

    //Below operations will perform as Queue

//    deque.add(12);
//    deque.add(23);
//    deque.peek();
//    deque.addFirst(56);
//    deque.addLast(78);

    // If We want the ArrayDeque to perform as Stack

    deque.push(12);
    deque.push(345);
    deque.pop();
    deque.peek();

    System.out.println(deque);
  }
}

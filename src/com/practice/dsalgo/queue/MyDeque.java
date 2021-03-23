package com.practice.dsalgo.queue;

/**
 * This is a Doubly Ended Queue (AKA Deque or Deck) and in which we can perform all the operations of queue
 * It contains next and previous node address so that the operations can be performed at any side of the queue
 * @param <E>
 */

public class MyDeque<E> {

  Node<E> head, tail;

  public void addFirst(E data){
    Node<E> toAdd = new Node<>(data);

    if (head==null){
      head = tail = toAdd;
      return;
    }

    head.next = toAdd;
    toAdd.prev = head;
    head = toAdd;

  }

  public E removeLast(){

    if (head == null){
      return null;
    }

    Node<E> toRemove = tail;
    tail.next = tail;
    tail.prev = null;

    if (tail == null){
      head = null;
    }

    return toRemove.data;

  }

  /**
   * Implement this function which will return the first element from the deque and null if there is nothing
   * @param <E>
   */
//  public E peekFirst(){
//
//  }

  /**
   * Implement this function which will return the last element from the deque and null if there is nothing
   * @param <E>
   */

//    public E peekLast(){
//
//    }

  /**
   * Implement this function which will add the element at last position of deque
   * @param <E>
   */

//    public void addLast(E data){
//
//    }

  public static class Node<E>{
    E data;
    Node next, prev;

    public Node(E data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

}

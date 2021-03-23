package com.practice.dsalgo.queue;

public class MyQueue<E> {

  private Node<E> head, tail;

  public void enqueue(E e) {

    Node<E> toAdd = new Node<>(e);

    if (head == null) {
      head = tail = toAdd;
      return;
    }

    tail.next = toAdd;
    tail = tail.next;
  }

  public E dequeue() {

    if (head == null) {
      return null;
    }

    Node<E> temp = head;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    return temp.data;
  }

  public static class Node<E> {

    public E data;
    public Node<E> next;

    public Node(E data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    MyQueue<Integer> myQueue = new MyQueue<>();
    myQueue.enqueue(12);
    myQueue.enqueue(16);
    myQueue.enqueue(19);

    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    myQueue.enqueue(19);
    System.out.println(myQueue.dequeue());
  }
}

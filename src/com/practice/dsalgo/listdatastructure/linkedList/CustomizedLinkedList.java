package com.practice.dsalgo.listdatastructure.linkedList;

/**
 * Here we are creating our own linked List with few functionality like add and print the element of the list
 */
public class CustomizedLinkedList<E> {

  Node<E> head;

  public void add(E data) {
    Node<E> toAdd = new Node<>(data);

    if (isEmpty()) {
      head = toAdd;
      return;
    }

    Node<E> temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = toAdd;
  }

  public E removeLastElement() throws Exception {
    Node<E> temp = head;

    Node<E> toRemove = null;

    if (temp == null) {
      throw new Exception("Can not remove element from empty list");
    }

    if (temp.next == null) {
      toRemove = head;
      head = null;
      return toRemove.data;
    }

    while (temp.next.next != null) {
      temp = temp.next;
    }
    toRemove = temp.next;
    temp.next = null;
    return toRemove.data;
  }

  public E getLastElement() throws Exception{
    Node<E> temp = head;

    if (temp == null) {
      throw new Exception("Can not remove element from empty list");
    }

    while (temp.next != null) {
      temp = temp.next;
    }
    return temp.data;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void print() {
    Node<E> temp = head;
    System.out.print("[");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.print("]");
  }

  static class Node<E> {

    E data;
    Node<E> next;

    public Node(E data) {
      this.data = data;
      this.next = null;
    }
  }

  /**
   * Calling the functionality of our linked List
   *
   * @param args
   */

  public static void main(String[] args) {
    CustomizedLinkedList linkedList = new CustomizedLinkedList();
    for (int i = 0; i < 10; i++) {
      linkedList.add(i + "-->Added");
    }

    linkedList.print();
  }
}



package com.practice.coding.practice.list;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a linked list of N nodes. The task is to reverse this list.
 * Input:
 * LinkedList: 1->2->3->4->5->6
 * Output: 6 5 4 3 2 1
 * Explanation: After reversing the list,
 * elements are 6->5->4->3->2->1.
 */

public class ReverseLinkedList {

  public static void main(String[] args) {
    MyLinkedList myList = new MyLinkedList();
    myList.add(2);
    myList.add(3);
    //myList.add(4);
    myList.add(5);
    myList.add(6);
    myList.add(7);
    myList.add(9);
    myList.add(10);


    myList.print();
    System.out.println();
//    myList.head = reverseList(myList.head);
//
//    myList.print();
    //System.out.println("Middle Element is --> "+findMiddle(myList.head));
  }

static Node reverseList(Node head){

  Node temp = head;
  Node prev = null;
  Node next = null;
  while (temp != null){

    next = temp.next;
    temp.next = prev;
    prev = temp;
    temp = next;
  }
  head = prev;
  return head;

}

static Object findMiddle(Node head){

  Node fast = head;
  Node slow = head;
  Node temp = head;
  while(fast.next != null){
    slow = temp.next;
    if(fast.next.next != null)
    fast = fast.next.next;
    else fast = fast.next;
    temp = temp.next;
  }
  return slow.data;
}

}

class Node<T>{
  T data;
  Node next;

  Node(T data){
    this.data = data;
    next = null;
  }
}

class MyLinkedList<T> {

  Node<T> head;

  void add(T data) {
    Node<T> toAdd = new Node<>(data);

    if (head == null){
      head = toAdd;
      return;
    }

    Node<T> temp = head;
    while (temp.next != null){
      temp = temp.next;
    }
    temp.next = toAdd;
  }

  public void print() {
    Node temp = head;
    System.out.print("[");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.print("]");
  }

}


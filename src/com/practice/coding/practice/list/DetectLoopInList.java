package com.practice.coding.practice.list;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.
 */

public class DetectLoopInList {

  public static void main(String[] args) {
    int n = 3;
    Node head = new Node(1);
    Node tail = head;

    tail.next = new Node(3);
    tail = tail.next;

    tail.next = new Node(4);
    tail = tail.next;

//    tail.next = new Node(4);
//    tail = tail.next;

    int x = 2;

    makeLoop(head, tail, x);
    if (findALoopInList(head)){
      System.out.println("Loop Exist");
    }
    else {
      System.out.println("Loop Did not Exist");
    }
  }

  static boolean findALoopInList(Node head) {
    boolean b = false;
    Node temp = head;
    Node fast = head;
    Node slow = head;
    while (temp.next != null) {
      fast = fast.next.next;
      slow = fast.next;
      temp = temp.next;
      System.out.println("fast Data -> "+fast.data+" slow Data -> "+slow.data);
      if (fast.equals(slow)) {
        System.out.println("Inside here");
        b = true;
        break;
      }
    }

    return b;
  }

  static boolean FindLoopUsingSet(Node head){
    Set s = new HashSet();
    while (head != null){
      if (s.contains(head)){
        return true;
      }
      s.add(head);
      head = head.next;
    }
    return false;
  }

  static void makeLoop(Node head, Node tail, int x) {
    if (x == 0) {
      return;
    }
    Node curr = head;
    for (int i = 1; i < x; i++) {
      curr = curr.next;
    }
    tail.next = curr;
  }

  static class Node {

    int data;
    Node next;

    Node(int x) {
      data = x;
      next = null;
    }
  }
}


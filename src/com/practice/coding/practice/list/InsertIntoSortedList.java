package com.practice.coding.practice.list;

public class InsertIntoSortedList {

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.add(1);
    myLinkedList.add(14);
    myLinkedList.add(19);
    myLinkedList.add(31);
    myLinkedList.add(42);


    myLinkedList.print();
    System.out.println();

    myLinkedList.head = sortedInsert(myLinkedList.head, 33);
    myLinkedList.print();
  }

  static Node1 sortedInsert(Node1 head1, int key) {
    Node1 toAdd = new Node1(key);

    Node1 temp = head1;
    Node1 prev = null;
    Node1 next = null;

    while (temp.next != null) {
      if (temp.data < toAdd.data && temp.next.data < toAdd.data) {
        temp = temp.next;
        prev = temp;
        next = temp.next;
        continue;
      }
       if (temp.data <= toAdd.data && temp.next.data >= toAdd.data){
        next = temp.next;
        temp.next = toAdd;
        toAdd.next = next;
        break;
      }

      if (temp.data >= toAdd.data){
        if (prev == null){
          toAdd.next = temp;
          prev = toAdd;
          head1 = prev;
          next = toAdd.next;
          break;
        }
        temp.next = toAdd;
        toAdd.next = next;
        break;
      }
    }
    if (next == null){
      temp.next = toAdd;
    }
    return head1;
  }

  static class MyLinkedList {

    Node1 head;

    void add(int data) {
      Node1 toAdd = new Node1(data);

      if (head == null) {
        head = toAdd;
        return;
      }

      Node1 temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = toAdd;
    }

    public void print() {
      Node1 temp = head;
      System.out.print("[");
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.print("]");
    }
  }
}

class Node1 {

  int data;
  Node1 next;

  Node1(int data) {
    this.data = data;
    next = null;
  }
}
